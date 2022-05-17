package semantic;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.InvalidASTException;
import semantic.exceptions.TypeMismatchException;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.*;
import visitor.SemanticVisitor;


public class SemanticCheck implements SemanticVisitor {

    public static Program generateTast(Program program){
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
        for (ClassDecl classDecl : toCheck.getClasses()) {
            classDecl.accept(this);
        }
        System.out.println();

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ClassDecl toCheck) {
        System.out.println("ClassDecl");

        toCheck.getFieldDelcarations().forEach(field -> field.accept(this));

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
        if (toCheck.getType() != null) toCheck.setType(toCheck.getType()); // ???
        System.out.print(" ");
        if (toCheck.getType() != null) {
            //field.getIdentifier().accept(this);
            throw new AlreadyDefinedException("The field variable " + toCheck.getType() + " has already been defined");
        }

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ConstructorDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Assign toCheck) {
        IExpression lExpression = toCheck.getlExpression();
        IExpression rExpression = toCheck.getrExpression();
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodParameter toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(WhileStmt whileStmt) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ReturnStmt returnStmt) {
        return null;
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
        return null;
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
        return null;
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
