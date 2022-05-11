package semantic;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import semantic.exceptions.AlreadyDefinedException;
import syntaxtree.statementexpression.Assign;
import syntaxtree.structure.*;
import visitor.SemanticVisitor;

import java.util.ArrayList;
import java.util.List;


public class SemanticCheck implements SemanticVisitor {

    private List<Tuple<String, Type>> currentLocalVars = new ArrayList<>();

    public Program Check(Program program) {
        visit(program);
        return program;
    }

    private boolean compareTypes(Type type1, Type type2) {
        return (type1.equals(type2) ||
                type1.equals(new ReferenceType("Object"))) ||
                (type1.equals(new BaseType(Primitives.INT)) &&
                        type2.equals(new BaseType(Primitives.CHAR)));
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
        return assign.getType();
    }

    @Override
    public Type visit(MethodParameter methodParameter) {
        //code
        return methodParameter.getType();
    }
}
