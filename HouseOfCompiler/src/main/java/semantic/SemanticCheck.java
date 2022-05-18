package semantic;

import java.util.LinkedHashSet;

import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import context.Context;
import context.ScopeContext;
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.FieldNotFoundException;
import semantic.exceptions.InvalidASTException;
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

    private ScopeContext currentLocalScope;

    public static Program generateTast(Program program) {
        SemanticCheck semanticCheck = new SemanticCheck();
        program.accept(semanticCheck);
        return program;
    }

    private boolean compareTypes(Type type1, Type type2) {
        return (type1.equals(type2) ||
                type1.equals(new ReferenceType("Object"))) ||
                (type1.equals(new BaseType(Primitives.INT)) &&
                        type2.equals(new BaseType(Primitives.CHAR)));
    }

    private Tuple<Type, Type> typeAssign(IExpression expression1, IExpression expression2) { // where to set type of
                                                                                             // these ?

        Type typedExpression1 = expression1.getType(); // set type
        Type typedExpression2 = expression2.getType(); // set type
        if (!(typedExpression1 instanceof LocalOrFieldVar || typedExpression1 instanceof InstVar)) { // what here
            throw new InvalidASTException("Left side of the assign is not assignable");
        }
        if (!compareTypes(typedExpression1, typedExpression2)) {
            throw new TypeMismatchException("Type " + typedExpression2 + " cannot be assigned to " +
                    typedExpression1);
        }
        return new Tuple<>(typedExpression1, typedExpression2);
    }

    @Override
    public TypeCheckResult typeCheck(Program toCheck) {

        context = new Context(toCheck);
        currentLocalScope = new ScopeContext();
        for (ClassDecl classDecl : toCheck.getClasses()) {
            classDecl.accept(this);
        }

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ClassDecl toCheck) {
        var valid = true;
        this.currentClass = toCheck; // For the Class-Context
        PrintableVector<String> identifiers = new PrintableVector<>();

        for (FieldDecl field : toCheck.getFieldDelcarations()) {
            var result = field.accept(this);
            valid = valid && result.isValid();
            identifiers.add(field.getIdentifier());
        }

        LinkedHashSet<String> identifierSet = new LinkedHashSet<>(identifiers);

        if (identifierSet.size() != identifiers.size()) {
            throw new AlreadyDefinedException("Multiple FieldDeclaration of same identifier");
        }

        if (toCheck.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(this);
        } else {
            toCheck.getConstructorDeclarations().forEach(constructor -> {
                constructor.accept(this);
            });
        }
        toCheck.getMethodDeclarations().forEach(method -> method.accept(this));

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(FieldDecl toCheck) {
        var valid = true;
        valid = valid && TypeHelper.typeExists(toCheck.getType(), context);

        return new TypeCheckResult(valid, toCheck.getType());
    }

    @Override
    public TypeCheckResult typeCheck(ConstructorDecl toCheck) {
        boolean valid = true;
        currentLocalScope.pushScope();
        for (MethodParameter parameter : toCheck.getParameterDeclarations()) {
            var result = parameter.accept(this);
            valid = valid && result.isValid();
            currentLocalScope.addLocalVar(parameter);
        }
        var result = toCheck.getBlock().accept(this);
        currentLocalScope.popScope();
        valid = result.isValid() && valid;
        return new TypeCheckResult(valid, toCheck.getType());
    }

    @Override
    public TypeCheckResult typeCheck(MethodDecl methodDecl) {
        var valid = true;

        currentLocalScope.pushScope();
        for (var parameter : methodDecl.getParameters()) {
            var result = parameter.accept(this);
            valid = valid && result.isValid();
            currentLocalScope.addLocalVar(parameter);
        }
        var result = methodDecl.getBlock().accept(this);
        currentLocalScope.popScope();
        var resultType = result.getType();
        if (resultType == null) {
            resultType = new BaseType(Primitives.VOID);
        }
        if (!resultType.equals(methodDecl.getType())) {
            throw new TypeMismatchException("Function: " + methodDecl.getIdentifier() + " with type "
                    + methodDecl.getType() + " has mismatching return Type: " + resultType);
        }
        return new TypeCheckResult(valid, resultType);
    }

    @Override
    public TypeCheckResult typeCheck(Assign toCheck) {

        IExpression lExpression = toCheck.getlExpression();
        IExpression rExpression = toCheck.getrExpression();

        // This check currently handles things like :
        /**
         * private int i;
         * void foo(int i){
         * i = i;
         * }
         */
        if (lExpression.equals(rExpression)) {
            throw new TypeMismatchException("Cannot assign to self");
        }
        var valid = true;

        var lResult = lExpression.accept(this);
        var rResult = rExpression.accept(this);

        if (!lExpression.getType().equals(rExpression.getType())) {
            throw new TypeMismatchException(
                    "Mismatch types in Assign-Statement got: \"" + lResult.getType() + "\" and \""
                            + rResult.getType() + "\"");
        } else {
            toCheck.setType(lExpression.getType());
        }
        valid = valid && lResult.isValid() && rResult.isValid();

        return new TypeCheckResult(valid, null); // return type is null to get the return type sufficently
    }

    @Override
    public TypeCheckResult typeCheck(MethodParameter toCheck) {
        if (TypeHelper.typeExists(toCheck.getType(), this.context))
            return new TypeCheckResult(true, toCheck.getType());
        throw new TypeUnkown("Type: " + toCheck.getType() + " is unknown");
    }

    @Override
    public TypeCheckResult typeCheck(WhileStmt whileStmt) {

        // check type in the while expression/condition
        var conditionBool = whileStmt.getExpression().accept(this);

        if (!TypeHelper.isBool(conditionBool.getType())) {
            throw new TypeMismatchException("While Condition expected type BOOL but got " + conditionBool.getType());
        }
        // check block
        var blockResult = whileStmt.getBlock().accept(this);
        whileStmt.setType(blockResult.getType());
        var valid = conditionBool.isValid() && blockResult.isValid() && TypeHelper.isBool(conditionBool.getType());
        return new TypeCheckResult(valid, blockResult.getType());
    }

    @Override
    public TypeCheckResult typeCheck(ReturnStmt returnStmt) {

        var returnExpression = returnStmt.getExpression().accept(this);
        returnStmt.setType(returnExpression.getType());

        return new TypeCheckResult(true, returnStmt.getType());
    }

    @Override
    public TypeCheckResult typeCheck(LocalVarDecl localVarDecl) {

        var valid = true;

        if (localVarDecl.getExpression() != null) {
            TypeCheckResult result = localVarDecl.getExpression().accept(this);

            var resultType = result.getType();

            if (!resultType.equals(localVarDecl.getType())) {
                throw new TypeMismatchException("LocalVarDecl: " + localVarDecl.getIdentifier() + " with type "
                        + localVarDecl.getType() + " has mismatching Initializer-Type : " + resultType);
            }

            valid = result.isValid() && valid;
        }

        currentLocalScope.addLocalVar(localVarDecl);
        return new TypeCheckResult(valid, null);
    }

    @Override
    public TypeCheckResult typeCheck(IfStmt ifStmt) {
        return null;
    }

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
                    if (blockReturnType != result.getType()) { // wenn es 2 verschiedene return types gibt, dann ist es
                                                               // fehlerhaft
                        throw new TypeMismatchException(
                                "Return types are mismatching in a single Block, got:" + blockReturnType
                                        + " and " + result.getType());
                    }
                }
            }
            valid = valid && result.isValid();

        }
        currentLocalScope.popScope();
        block.setType(blockReturnType);
        return new TypeCheckResult(valid, blockReturnType);
    }

    @Override
    public TypeCheckResult typeCheck(NewDecl newDecl) {
        var valid = true;

        var newClass = newDecl.getType();

        if (!TypeHelper.typeExists(newClass, this.context)) {
            throw new TypeUnkown("Type: " + newClass + " is unknown");
        }

        for (var arguments : newDecl.getArguments()) {
            var result = arguments.accept(this);
            valid = valid && result.isValid();
        }

        var constructor = TypeHelper.getConstructor(newDecl, this.context);

        return new TypeCheckResult(valid, newDecl.getType());
    }

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

    @Override
    public TypeCheckResult typeCheck(Unary unary) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(This aThis) {
        aThis.setType(currentClass.getIdentifier());
        return new TypeCheckResult(true, aThis.getType());
    }

    @Override
    public TypeCheckResult typeCheck(Null aNull) {
        return null;
    }

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

        throw new VariableNotDeclaredException(
                "Variable: " + localOrFieldVar.getIdentifier() + " is not declared in this scope");
    }

    @Override
    public TypeCheckResult typeCheck(IntegerExpr integerExpr) {
        return new TypeCheckResult(true, integerExpr.getType());
    }

    @Override
    public TypeCheckResult typeCheck(InstVar instVar) {

        var valid = true;

        // TODO: Currently we only check the instVars of the current class i think!!!

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
            throw new TypeMismatchException(
                    "Type: " + type + ", is a BaseType and does not offer any Instance Variables or Methods");
        }
        var nextInstVar = TypeHelper.getFieldInType(instVar.getIdentifier(), type, this.context);

        // Check if the identifier exists in current Type
        if (nextInstVar == null) {
            throw new FieldNotFoundException("Field: " + instVar.getIdentifier() + " not found in Class: " + type);
        }
        valid = valid && result.isValid();
        var newType = nextInstVar.getType();
        instVar.setType(newType);

        return new TypeCheckResult(valid, newType);
    }

    @Override
    public TypeCheckResult typeCheck(CharExpr charExpr) {
        return new TypeCheckResult(true, charExpr.getType());

    }

    @Override
    public TypeCheckResult typeCheck(BoolExpr boolExpr) {
        return new TypeCheckResult(true, boolExpr.getType());
    }

    @Override
    public TypeCheckResult typeCheck(Binary binary) {

        var valid = true;

        var lResult = binary.getlExpression().accept(this);
        var rResult = binary.getrExpression().accept(this);

        valid = valid && lResult.isValid() && rResult.isValid();

        if (!lResult.getType().equals(rResult.getType())) {
            throw new TypeMismatchException(
                    "Mismatch types in Binary-Statement got: \"" + lResult.getType() + "\" and \""
                            + rResult.getType() + "\"");
        } else {
            binary.setType(lResult.getType());
        }

        binary.getlExpression();
        return null;
    }
}
