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
    public Program visit(Program program) {
        for (ClassDecl classDecl : program.getClasses()) {
            classDecl.accept(this);
        }
        System.out.println();

        return null;
    }

    @Override
    public ClassDecl visit(ClassDecl clazz) {
        System.out.println("ClassDecl");

        clazz.getFieldDelcarations().forEach(field -> field.accept(this));

        if (clazz.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(this);
        } else {
            clazz.getConstructorDeclarations().forEach(constructor -> {
                constructor.accept(this);
            });
        }
        clazz.getMethodDeclarations().forEach(method -> method.accept(this));

        return null;
    }

    @Override
    public FieldDecl visit(FieldDecl field) {
        if (field.getType() != null) field.setType(field.getType());
        System.out.print(" ");
        if (field.getType() != null) {
            //field.getIdentifier().accept(this);
            throw new AlreadyDefinedException("The field variable " + field.getType() + " has already been defined");
        }

        // field.getExpressions();
        return field;
    }

    @Override
    public ConstructorDecl visit(ConstructorDecl constructor) {
        constructor.getParameterDeclarations().forEach(methodParam -> methodParam.accept(this));


        return constructor;
    }

    @Override
    public MethodDecl visit(MethodDecl method) {
        compareTypes(method.getType(), method.accept(this));


        return method;
    }

    @Override
    public Assign visit(Assign assign) {
        IExpression lExpression = assign.getlExpression();
        IExpression rExpression = assign.getrExpression();

        return assign;
    }

    @Override
    public MethodParameter visit(MethodParameter methodParameter) {
        //code
        return methodParameter;
    }

    @Override
    public WhileStmt visit(WhileStmt whileStmt) {
        return null;
    }

    @Override
    public ReturnStmt visit(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public LocalVarDecl visit(LocalVarDecl localVarDecl) {
        return null;
    }

    @Override
    public IfStmt visit(IfStmt ifStmt) {
        return null;
    }

    @Override
    public Block visit(Block block) {
        return null;
    }

    @Override
    public NewDecl visit(NewDecl newDecl) {
        return null;
    }

    @Override
    public MethodCall visit(MethodCall methodCall) {
        return null;
    }

    @Override
    public Unary visit(Unary unary) {
        return null;
    }

    @Override
    public This visit(This aThis) {
        return null;
    }

    @Override
    public Null visit(Null aNull) {
        return null;
    }

    @Override
    public LocalOrFieldVar visit(LocalOrFieldVar localOrFieldVar) {
        return null;
    }

    @Override
    public IntegerExpr visit(IntegerExpr integerExpr) {
        return null;
    }

    @Override
    public InstVar visit(InstVar instVar) {
        return null;
    }

    @Override
    public CharExpr visit(CharExpr charExpr) {
        return null;
    }

    @Override
    public BoolExpr visit(BoolExpr boolExpr) {
        return null;
    }

    @Override
    public Binary visit(Binary binary) {
        return null;
    }
}
