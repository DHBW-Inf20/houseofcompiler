package semantic;

import codegen.MethodGenerator;
import syntaxtree.structure.*;
import visitor.SemanticVisitor;


public class SemanticCheck implements SemanticVisitor {

    public static Program generateTast(Program program){
        SemanticCheck semanticCheck = new SemanticCheck();
        program.accept(semanticCheck);
        return program;
    }

    @Override
    public void visit(Program program) {
        for (ClassDecl classDecl : program.getClasses()) { //32
            classDecl.accept(this);
        }
        System.out.println();
    }

    @Override
    public void visit(ClassDecl clazz) {
        System.out.println("ClassDecl");

        clazz.getFieldDelcarations().forEach(field -> field.accept(this));

        if (clazz.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(this);
        } else {
            clazz.getConstructorDeclarations().forEach(constructor -> {
                constructor.accept(this);
            });
        }
    }

    @Override
    public void visit(FieldDecl field) { //36
        if (field.getType() != null) field.getType().accept(this); //all wrong
        System.out.print(" ");
        if (field.getIdentifier() != null) field.getIdentifier();
        System.out.print(";");
    }

    @Override
    public void visit(ConstructorDecl constructor) { //??

    }

    @Override
    public void visit(MethodDecl method) { //43

    }
}
