package semantic;

import codegen.MethodGenerator;
import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.InvalidASTException;
import semantic.exceptions.TypeMismatchException;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.Assign;
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

    private Tuple<Type, Type> typeAssign(IExpression expression1, IExpression expression2) {
       Type typedExpression1 = expression1.getType(); //set type
        //or
        Type typedExpression2 = expression2.getType(); // set type
        if (!(typedExpression1 instanceof LocalOrFieldVar || typedExpression1 instanceof InstVar)) {
            throw new InvalidASTException("Left side of the assign is not assignable");
        }
        if (!compareTypes(typedExpression1.getObjectType(), typedExpression2.getObjectType())) {
            throw new TypeMismatchException("Type " + typedExpression2.getObjectType().getName() + " cannot be assigned to " +
                    typedExpression1.getObjectType().getName());
        }
        return new Tuple<>(typedExpression1, typedExpression2);
    }

    @Override
    public Type visit(Program program) {
        for (ClassDecl classDecl : program.getClasses()) {
            classDecl.accept(this);
        }
        System.out.println();

        return null;
    }

    @Override
    public Type visit(ClassDecl clazz) {
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
    public Type visit(FieldDecl field) {
        if (field.getType() != null) field.setType(field.getType());
        System.out.print(" ");
        if (field.getType() != null) {
            //field.getIdentifier().accept(this);
            throw new AlreadyDefinedException("The field variable " + field.getType() + " has already been defined");
        }

        // field.getExpressions();
    }

    @Override
    public Type visit(ConstructorDecl constructor) {
        constructor.getParameterDeclarations().forEach(methodParam -> methodParam.accept(this));


    }

    @Override
    public Type visit(MethodDecl method) {
        compareTypes(method.getType(), method.accept(this));


    }

    @Override
    public Type visit(Assign assign) {
        IExpression lExpression = assign.getlExpression();
        IExpression rExpression = assign.getrExpression();

        return assign.getType();
    }

    @Override
    public Type visit(MethodParameter methodParameter) {
        //code
        return methodParameter.getType();
    }
}
