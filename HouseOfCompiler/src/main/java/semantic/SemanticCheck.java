package semantic;

import java.util.ArrayList;
import java.util.Objects;

import common.BaseType;
import common.Operator;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import context.Context;
import context.ScopeContext;
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.FieldNotFoundException;
import semantic.exceptions.SemanticError;
import semantic.exceptions.TypeMismatchException;
import semantic.exceptions.TypeUnkown;
import semantic.exceptions.VariableNotDeclaredException;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.BoolExpr;
import syntaxtree.expressions.CharExpr;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.Null;
import syntaxtree.expressions.This;
import syntaxtree.expressions.Unary;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.Block;
import syntaxtree.statements.IfStmt;
import syntaxtree.statements.LocalVarDecl;
import syntaxtree.statements.ReturnStmt;
import syntaxtree.statements.WhileStmt;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;
import syntaxtree.structure.Program;
import visitor.SemanticVisitor;

public class SemanticCheck implements SemanticVisitor {
    private Context context;
    private ClassDecl currentClass;

    private ArrayList<String> currentFields = new ArrayList<>();
    private String currentMethod = "";
    private Type currentMethodReturnType;
    private Type currentAssignLeftType;
    private String fileName;
    private ScopeContext currentLocalScope;

    public ArrayList<Exception> errors = new ArrayList<>();

    /**
     * @param program
     * @return Program
     * @throws SemanticError
     */
    public static Program generateTast(Program program) throws SemanticError {
        SemanticCheck semanticCheck = new SemanticCheck();
        var result = program.accept(semanticCheck);
        if (result.isValid()) {
            return program;
        } else {
            String ANSI_RESET = "\u001B[0m";
            String ANSI_RED = "\u001B[31m";
            var errorString = ANSI_RED;
            for (int i = semanticCheck.errors.size() - 1; i >= 0; i--) {
                errorString += semanticCheck.errors.get(i).getMessage() + "\n";
            }
            throw new SemanticError(errorString + ANSI_RESET);
        }
    }

    /**
     * @param type1
     * @param type2
     * @return boolean
     */
    private boolean compareTypes(Type type1, Type type2) {
        return (type1.equals(type2) ||
                type1.equals(new ReferenceType("Object"))) ||
                (type1.equals(new BaseType(Primitives.INT)) &&
                        type2.equals(new BaseType(Primitives.CHAR)));
    }

    /**
     * @param toCheck
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(Program toCheck) {

        context = new Context(toCheck);
        currentLocalScope = new ScopeContext();
        var valid = true;
        for (ClassDecl classDecl : toCheck.getClasses()) {
            valid = classDecl.accept(this).isValid() && valid;
        }

        return new TypeCheckResult(valid, null);
    }

    /**
     * @param toCheck
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(ClassDecl toCheck) {
        var valid = true;
        this.currentClass = toCheck; // For the Class-Context
        if (fileName == null) {
            this.fileName = toCheck.getIdentifier() + ".java";
        }
        PrintableVector<String> identifiers = new PrintableVector<>();

        for (FieldDecl field : toCheck.getFieldDelcarations()) {
            var result = field.accept(this);
            valid = valid && result.isValid();
            if (valid)
                identifiers.add(field.getIdentifier());
        }

        if (toCheck.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(this);
        } else {
            for (ConstructorDecl constructorDecl : toCheck.getConstructorDeclarations()) {
                valid = constructorDecl.accept(this).isValid() && valid;
            }
        }
        for (MethodDecl methodDecl : toCheck.getMethodDeclarations()) {
            valid = methodDecl.accept(this).isValid() && valid;
        }

        return new TypeCheckResult(valid, new ReferenceType(toCheck.getIdentifier()));
    }

    /**
     * @param toCheck
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(FieldDecl toCheck) {
        var valid = true;
        if (currentFields.contains(toCheck.getIdentifier())) {
            errors.add(new AlreadyDefinedException(
                    "Field " + toCheck.getIdentifier() + " is already defined in class " + currentClass.getIdentifier()
                            + TypeHelper.generateLocationString(toCheck.line, toCheck.column, fileName)));
            valid = false;
        } else {
            currentFields.add(toCheck.getIdentifier());
        }
        valid = valid && TypeHelper.typeExists(toCheck.getType(), context);

        return new TypeCheckResult(valid, toCheck.getType());
    }

    /**
     * @param toCheck
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(ConstructorDecl toCheck) {
        boolean valid = true;
        currentLocalScope.pushScope();
        for (MethodParameter parameter : toCheck.getParameterDeclarations()) {
            var result = parameter.accept(this);
            valid = valid && result.isValid();
            currentLocalScope.addLocalVar(parameter);
        }
        currentMethodReturnType = new BaseType(Primitives.VOID);
        currentMethod = this.currentClass.getIdentifier();
        var result = toCheck.getBlock().accept(this);
        currentLocalScope.popScope();
        if (result.getType() != null && result.getType() != new BaseType(Primitives.VOID)) {
            errors.add(new TypeMismatchException(
                    "The return-Type of a Constructor must always be void " +
                            TypeHelper.generateLocationString(toCheck.line, toCheck.column, fileName)));
            valid = false;
        }
        valid = result.isValid() && valid;
        return new TypeCheckResult(valid, toCheck.getType());
    }

    /**
     * @param methodDecl
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(MethodDecl methodDecl) {
        var valid = true;

        currentLocalScope.pushScope();
        for (var parameter : methodDecl.getParameters()) {
            var result = parameter.accept(this);
            valid = valid && result.isValid();
            currentLocalScope.addLocalVar(parameter);
        }
        currentMethodReturnType = methodDecl.getType();
        currentMethod = methodDecl.getIdentifier();
        var result = methodDecl.getBlock().accept(this);
        valid = valid && result.isValid();
        currentLocalScope.popScope();
        var resultType = result.getType();
        if (resultType == null) {
            resultType = new BaseType(Primitives.VOID);
        }
        if (!resultType.equals(methodDecl.getType())) {
            errors.add(new TypeMismatchException("Method-Declaration " + methodDecl.getIdentifier() + " with type "
                    + methodDecl.getType() + " has at least one Mismatching return Type:"
                    + TypeHelper.generateLocationString(methodDecl.line, methodDecl.column, fileName)));
            valid = false;
        }
        return new TypeCheckResult(valid, resultType);
    }

    /**
     * @param toCheck
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(Assign toCheck) {
        IExpression lExpression = toCheck.getlExpression();
        IExpression rExpression = toCheck.getrExpression();
        var valid = true;

        // This check currently handles things like :
        /**
         * private int i;
         * void foo(int i){
         * i = i;
         * }
         */
        if (lExpression.equals(rExpression)) {
            errors.add(new TypeMismatchException("Cannot assign to self"
                    + TypeHelper.generateLocationString(toCheck.line, toCheck.column, fileName)));
            valid = false;
        }

        var lResult = lExpression.accept(this);
        currentAssignLeftType = lResult.getType();
        var rResult = rExpression.accept(this);

        if (!lExpression.getType().equals(rExpression.getType())) {
            errors.add(new TypeMismatchException(
                    "Mismatch types in Assign-Statement got: \"" + lResult.getType() + "\" and \""
                            + rResult.getType() + "\""
                            + TypeHelper.generateLocationString(toCheck.line, toCheck.column, fileName)));
            valid = false;
        } else {
            toCheck.setType(lExpression.getType());
        }
        valid = valid && lResult.isValid() && rResult.isValid();
        currentAssignLeftType = null;
        return new TypeCheckResult(valid, null); // return type is null to get the return type sufficently
    }

    /**
     * @param toCheck
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(MethodParameter toCheck) {
        if (TypeHelper.typeExists(toCheck.getType(), this.context)) {
            return new TypeCheckResult(true, toCheck.getType());
        } else {
            errors.add(new TypeUnkown("Type: " + toCheck.getType() + " is unknown"
                    + TypeHelper.generateLocationString(toCheck.line, toCheck.column, fileName)));
            return new TypeCheckResult(false, toCheck.getType());
        }
    }

    /**
     * @param whileStmt
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(WhileStmt whileStmt) {

        // check type in the while expression/condition
        var valid = true;
        var conditionBool = whileStmt.getExpression().accept(this);
        valid = valid && conditionBool.isValid();
        if (!TypeHelper.isBool(conditionBool.getType())) {
            errors.add(
                    new TypeMismatchException(
                            "While Condition expected " + Primitives.BOOL + " but got " + conditionBool.getType()
                                    + TypeHelper.generateLocationString(whileStmt.line, whileStmt.column, fileName)));
            valid = false;
        }
        // check block
        var blockResult = whileStmt.getBlock().accept(this);
        whileStmt.setType(blockResult.getType());
        valid = valid && conditionBool.isValid() && blockResult.isValid() && TypeHelper.isBool(conditionBool.getType());
        return new TypeCheckResult(valid, blockResult.getType());
    }

    /**
     * @param returnStmt
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(ReturnStmt returnStmt) {

        var returnExpression = returnStmt.getExpression().accept(this);
        returnStmt.setType(returnExpression.getType());
        if (currentMethodReturnType != null && !currentMethodReturnType.equals(returnExpression.getType())) {
            errors.add(
                    new TypeMismatchException("Return-Type mismatch:  cannot convert from " + returnExpression.getType()
                            + " to " + currentMethodReturnType
                            + TypeHelper.generateLocationString(returnStmt.line, returnStmt.column, fileName)));
            return new TypeCheckResult(false, returnExpression.getType());
        }
        return new TypeCheckResult(true, returnStmt.getType());
    }

    /**
     * @param localVarDecl
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(LocalVarDecl localVarDecl) {

        var valid = true;

        if (localVarDecl.getExpression() != null) {
            TypeCheckResult result = localVarDecl.getExpression().accept(this);

            var resultType = result.getType();
            valid = result.isValid() && valid;

            if (!resultType.equals(localVarDecl.getType())) {
                errors.add(new TypeMismatchException(
                        "Type mismatch: cannot convert from " + resultType + " to " + localVarDecl.getType()
                                + TypeHelper.generateLocationString(localVarDecl.line, localVarDecl.column, fileName)));
                valid = false;
            }

        }

        try {
            currentLocalScope.addLocalVar(localVarDecl);
        } catch (AlreadyDefinedException e) {
            errors.add(new AlreadyDefinedException(e.getMessage() + TypeHelper.generateLocationString(localVarDecl.line,
                    localVarDecl.column, fileName)));
            valid = false;
        }
        return new TypeCheckResult(valid, null);
    }

    /**
     * @param ifStmt
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(IfStmt ifStmt) {

        var valid = true;
        // check the Condition
        var conditionResult = ifStmt.getCondition().accept(this);
        valid = valid && conditionResult.isValid();
        if (!TypeHelper.isBool(conditionResult.getType())) {
            errors.add(
                    new TypeMismatchException(
                            "If Condition expected " + Primitives.BOOL + " but got " + conditionResult.getType()
                                    + TypeHelper.generateLocationString(ifStmt.line, ifStmt.column, fileName)));
            valid = false;
        }

        // check the if block
        var ifBlockResult = ifStmt.getBlockIf().accept(this);
        valid = valid && ifBlockResult.isValid();

        // check the else block
        if (ifStmt.getBlockElse() != null) {
            var elseBlockResult = ifStmt.getBlockElse().accept(this);
            valid = valid && elseBlockResult.isValid();
            var elseType = elseBlockResult.getType();

            // Folgendes if else ist für die Bestimmung des Rückgabetyps
            if (ifBlockResult.getType() == null && elseType != null) { // Falls einer der Blöcke keinen return type hat,
                                                                       // dann wird der Rückgabetyp des anderen gewählt
                ifStmt.setType(elseType);
            } else if (ifBlockResult.getType() != null && elseType == null) {
                ifStmt.setType(ifBlockResult.getType());
            } else if (ifBlockResult.getType() != null && elseType != null) { // Wenn beide ungleich null sind, dann
                                                                              // müssen beide Typen übereinstimmen
                                                                              // (Hätten wir vererbung müssten wir jetzt
                                                                              // prüfen ob die Typen Unterklassen eines
                                                                              // Obertyps sind...)
                if (!Objects.equals(elseType, ifBlockResult.getType())) {
                    errors.add(new TypeMismatchException(
                            "Type mismatch: cannot convert from " + elseType + " to " + ifBlockResult.getType()
                                    + TypeHelper.generateLocationString(ifStmt.line, ifStmt.column, fileName)));
                    valid = false;
                } else {
                    ifStmt.setType(ifBlockResult.getType()); // Falls der Typ gleich ist, wähle einen der beiden Typen
                                                             // als Rückgabetyp aus
                }
            }
        } else {
            ifStmt.setType(ifBlockResult.getType());
        }

        return new TypeCheckResult(valid, ifStmt.getType());
    }

    /**
     * @param block
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(Block block) {
        var statements = block.getStatements();
        var valid = true;
        Type blockReturnType = null;
        currentLocalScope.pushScope();
        for (var statement : statements) {
            var result = statement.accept(this);
            var statementReturnType = result.getType();
            if (statementReturnType != null) { // Wenn StatmentReturnType null ist, dann ändert sich der Block return
                                               // type nicht
                if (blockReturnType == null) { // Initiale setzen des Return type
                    blockReturnType = result.getType();
                } else {
                    if (!blockReturnType.equals(result.getType())) { // wenn es 2 verschiedene return types gibt, dann
                                                                     // ist es
                        // fehlerhaft
                        errors.add(new TypeMismatchException(
                                "Return types are mismatching in a single Block, got:" + blockReturnType
                                        + " and " + result.getType()
                                        + TypeHelper.generateLocationString(block.line, block.column, fileName)));
                        valid = false;
                    }
                }
            }
            valid = valid && result.isValid();

        }
        currentLocalScope.popScope();
        block.setType(blockReturnType);
        return new TypeCheckResult(valid, blockReturnType);
    }

    /**
     * @param newDecl
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(NewDecl newDecl) {
        var valid = true;

        var newClass = newDecl.getType();

        if (!TypeHelper.typeExists(newClass, this.context)) {
            errors.add(new TypeUnkown("Type: " + newClass + " is unknown"
                    + TypeHelper.generateLocationString(newDecl.line, newDecl.column, fileName)));
            valid = false;
        }

        for (var arguments : newDecl.getArguments()) {
            var result = arguments.accept(this);
            valid = valid && result.isValid();
        }

        try {
            var constructor = TypeHelper.getConstructor(newDecl, this.context);
        } catch (TypeMismatchException e) {
            errors.add(new SemanticError(e.getMessage() + TypeHelper.generateLocationString(newDecl.line,
                    newDecl.column, fileName)));
            valid = false;
        }

        return new TypeCheckResult(valid, newDecl.getType());
    }

    /**
     * @param methodCall
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(MethodCall methodCall) {

        var valid = true;

        var receiver = methodCall.getReceiver().accept(this);

        valid = valid && receiver.isValid();

        for (var parameter : methodCall.getArguments()) {
            var parameterResult = parameter.accept(this);
            valid = valid && parameterResult.isValid();
        }

        var method = TypeHelper.getMethodInType(methodCall, receiver.getType(), context); // Throws an Error, cant be
                                                                                          // null
        var returnType = method.getType();

        methodCall.setType(returnType);

        return new TypeCheckResult(valid, null);
    }

    /**
     * @param unary
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(Unary unary) {
        return null;
    }

    /**
     * @param aThis
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(This aThis) {
        aThis.setType(currentClass.getIdentifier());
        return new TypeCheckResult(true, aThis.getType());
    }

    /**
     * @param aNull
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(Null aNull) {
        if (currentAssignLeftType != null) {
            var assignType = currentAssignLeftType;
            if (assignType != null) {
                aNull.setType(assignType);
            }
        } else {
            aNull.setType(null);
        }
        return new TypeCheckResult(true, aNull.getType());
    }

    /**
     * @param localOrFieldVar
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(LocalOrFieldVar localOrFieldVar) {

        // check if the variable is declared in the current class

        var fieldVar = TypeHelper.getFieldInType(localOrFieldVar.getIdentifier(),
                new ReferenceType(this.currentClass.getIdentifier()), context);

        if (fieldVar != null) {
            localOrFieldVar.setType(fieldVar.getType());
            return new TypeCheckResult(true, fieldVar.getType());
        }

        // check if the variable is declared in the current scope
        Type localVar = currentLocalScope.getLocalVar(localOrFieldVar.getIdentifier());

        if (localVar != null) {
            localOrFieldVar.setType(localVar);
            return new TypeCheckResult(true, localVar);
        }

        errors.add(new VariableNotDeclaredException(
                "Variable: " + localOrFieldVar.getIdentifier() + " is not declared in this scope"
                        + TypeHelper.generateLocationString(localOrFieldVar.line, localOrFieldVar.column, fileName)));
        return new TypeCheckResult(false, null);

    }

    /**
     * @param integerExpr
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(IntegerExpr integerExpr) {
        return new TypeCheckResult(true, integerExpr.getType());
    }

    /**
     * @param instVar
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(InstVar instVar) {

        var valid = true;

        /**
         * Ein InstVar ist ja z.B. this.foo.bar...
         * Und als Objekt sieht das wie folgt aus:
         * new InstVar( new InstVar( new This(), "foo"), "bar");
         * this.foo.bar.getFoo().foo.bar
         * Die typeCheck Methode wird dann Rekursiv aufgerufen und irgendwann Erreicht
         * es dann
         * den TypeCheck für This() danach geht es rekursiv zurück;
         * nach oben zurück. Das ist dann der TypeCheck für InstVar(This, "foo"). Danach
         * muss in InstVar geschaut werden, ob es
         * im Typ von this.foo eine Variable mit dem Namen bar gibt usw...
         */
        var result = instVar.getExpression().accept(this); // Hier steht der typ drinne von dem der identifier ist...
        var type = result.getType();
        if (type instanceof BaseType) {
            errors.add(new TypeMismatchException(
                    "Type: " + type + ", is a BaseType and does not offer any Instance Variables or Methods"
                            + TypeHelper.generateLocationString(instVar.line, instVar.column, fileName)));
            valid = false;
        }
        var nextInstVar = TypeHelper.getFieldInType(instVar.getIdentifier(), type, this.context);

        // Check if the identifier exists in current Type
        if (nextInstVar == null) {
            errors.add(
                    new FieldNotFoundException("Field: " + instVar.getIdentifier() + " not found in Class: " + type
                            + TypeHelper.generateLocationString(instVar.line, instVar.column, fileName)));
            valid = false;
        }
        valid = valid && result.isValid();
        var newType = nextInstVar.getType();
        instVar.setType(newType);

        return new TypeCheckResult(valid, newType);
    }

    /**
     * @param charExpr
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(CharExpr charExpr) {
        return new TypeCheckResult(true, charExpr.getType());

    }

    /**
     * @param boolExpr
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(BoolExpr boolExpr) {
        return new TypeCheckResult(true, boolExpr.getType());
    }

    /**
     * @param binary
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult typeCheck(Binary binary) {

        var valid = true;

        var lResult = binary.getlExpression().accept(this);
        var rResult = binary.getrExpression().accept(this);

        var errorToThrow = new TypeMismatchException(
                "The Operator: " + binary.getOperator() + " is undefined for the argument types: "
                        + lResult.getType() + ", " + rResult.getType()
                        + TypeHelper.generateLocationString(binary.line, binary.column, fileName));

        // Following vars are there to determine the type of the binary expression
        final Operator operator = binary.getOperator();

        final boolean isCompareOperator = (binary.getOperator() == Operator.EQUAL
                || operator == Operator.NOTEQUAL || operator == Operator.LESS
                || operator == Operator.LESSEQUAL || operator == Operator.GREATER
                || operator == Operator.GREATEREQUAL);

        final boolean isLogicalOperator = (operator == Operator.AND || operator == Operator.OR);
        final boolean isArithmeticOperator = (operator == Operator.PLUS || operator == Operator.MINUS
                || operator == Operator.MULT || operator == Operator.DIV);
        // Unser Compiler kann ja nur BaseType-Operatoren verarbeiten und auch nur 2
        // gleiche Typen
        // TODO: Chars dürfen mit Ints verglichen werden
        // TODO: ReferenceTypes dürfen mit Equal und NotEqual verglichen werden
        if (lResult.getType() instanceof ReferenceType || !lResult.getType().equals(rResult.getType())) {
            errors.add(errorToThrow);
            valid = false;
        } else {
            BaseType lType = (BaseType) lResult.getType();

            switch (lType.getIdentifier()) {
                case BOOL -> {
                    if (!isLogicalOperator && !isCompareOperator) {
                        errors.add(errorToThrow);
                        valid = false;
                    }
                }
                case INT -> {
                    if (!isArithmeticOperator && !isCompareOperator) {
                        errors.add(errorToThrow);
                        valid = false;
                    }
                }
                default -> {
                    errors.add(errorToThrow);
                }

            }

        }

        if (valid) {
            if (isLogicalOperator || isCompareOperator) {
                binary.setType(new BaseType(Primitives.BOOL));
            } else {
                binary.setType(lResult.getType());
            }
        } else {
            binary.setType(new BaseType(Primitives.VOID));
        }

        valid = valid && lResult.isValid() && rResult.isValid();

        return new TypeCheckResult(valid, binary.getType());
    }
}
