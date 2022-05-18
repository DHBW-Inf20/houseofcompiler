package semantic;

import java.util.LinkedHashSet;

import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import context.Context;
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.InvalidASTException;
import semantic.exceptions.TypeMismatchException;
import semantic.exceptions.TypeUnkown;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.*;
import visitor.SemanticVisitor;


public class SemanticCheck implements SemanticVisitor {
    private Context context;

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

    private Tuple<Type, Type> typeAssign(IExpression expression1, IExpression expression2) { //where to set type of these ?

        Type typedExpression1 = expression1.getType(); //set type
        Type typedExpression2 = expression2.getType(); // set type
        if (!(typedExpression1 instanceof LocalOrFieldVar || typedExpression1 instanceof InstVar)) { //what here
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


        for (ClassDecl classDecl : toCheck.getClasses()) {
            classDecl.accept(this);
        }
        System.out.println();

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ClassDecl toCheck) {
        var valid = true;

        PrintableVector<String> identifiers = new PrintableVector<>();
        

        for (FieldDecl field : toCheck.getFieldDelcarations()) {
            var result = field.accept(this);
            valid = valid && result.isValid();
            identifiers.add(field.getIdentifier());
        }

        LinkedHashSet<String> identifierSet = new LinkedHashSet<>(identifiers);

        if(identifierSet.size() != identifiers.size()){
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
        for (MethodParameter parameter: toCheck.getParameterDeclarations()){
            var result = parameter.accept(this);
            valid = valid && result.isValid();
        }
        var result = toCheck.getBlock().accept(this);
        valid = result.isValid() && valid;
        return new TypeCheckResult(valid, toCheck.getType());
    }

    @Override
    public TypeCheckResult typeCheck(MethodDecl methodDecl) {
        var valid = true;

        for (var parameter: methodDecl.getParameters()){
            var result = parameter.accept(this);
            valid = valid && result.isValid();
        }
        var result = methodDecl.getBlock().accept(this);
        System.out.println(methodDecl.getType());
        System.out.println(result.getType());
        if(!result.getType().equals(methodDecl.getType())){
            throw new TypeMismatchException("Function: " + methodDecl.getIdentifier() + " with type " + methodDecl.getType() + " has unmatching return Type" );
        }
        return new TypeCheckResult(valid, result.getType());
    }

    @Override
    public TypeCheckResult typeCheck(Assign toCheck) {
        IExpression lExpression = toCheck.getlExpression();
        IExpression rExpression = toCheck.getrExpression();
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodParameter toCheck) {
        if (TypeHelper.typeExists(toCheck.getType(),this.context))
            return new TypeCheckResult(true, toCheck.getType());

        throw new TypeUnkown("type Unkown in parameter");
    }

    @Override
    public TypeCheckResult typeCheck(WhileStmt whileStmt) {
        var condResult = whileStmt.getBlock().accept(this);
        if (!TypeHelper.isBool(condResult.getType())){
            throw new TypeMismatchException("Bool excepted");
        }
        var blockResult = whileStmt.getBlock().accept(this);

        var valid = condResult.isValid() && blockResult.isValid() && TypeHelper.isBool(condResult.getType());
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
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(IfStmt ifStmt) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Block block) {
        var statements = block.getStatements();
        var valid = true;
        Type returnType = null;
        for (var statement : statements) {
            var result = statement.accept(this);
            if(statement instanceof ReturnStmt){
                if(returnType == null){
                    returnType = result.getType();
                }else{
                    if(returnType != result.getType()){
                        throw new TypeMismatchException("Wrong return type");
                    }
                }
            }
            valid = valid && result.isValid();
            
        }
        block.setType(returnType);
        return new TypeCheckResult(valid, returnType);
    }


    @Override
    public TypeCheckResult typeCheck(NewDecl newDecl) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodCall methodCall) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Unary unary) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(This aThis) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Null aNull) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(LocalOrFieldVar localOrFieldVar) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(IntegerExpr integerExpr) {
        return new TypeCheckResult(true, new BaseType(Primitives.INT));
    }

    @Override
    public TypeCheckResult typeCheck(InstVar instVar) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(CharExpr charExpr) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(BoolExpr boolExpr) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Binary binary) {
        return null;
    }
}
