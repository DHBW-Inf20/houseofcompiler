package syntaxtree.structure;

import common.Type;

import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.CodeVisitor;

import java.util.Objects;
import java.util.Vector;

public class ClassDecl implements Visitable {

    private String identifier;
    private Type type;
    private Vector<FieldDecl> fieldDelcarations;
    private Vector<MethodDecl> methodDeclarations;
    private Vector<ConstructorDecl> constructorDeclarations;

    public ClassDecl(String identifier, Vector<FieldDecl> fieldDelcarations, Vector<MethodDecl> methodDeclarations, Vector<ConstructorDecl> constructorDeclarations) {
        this.identifier = identifier;
        this.fieldDelcarations = fieldDelcarations;
        this.methodDeclarations = methodDeclarations;
        this.constructorDeclarations = constructorDeclarations;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public Vector<FieldDecl> getFieldDelcarations() {
        return fieldDelcarations;
    }

    public Vector<MethodDecl> getMethodDeclarations() {
        return methodDeclarations;
    }

    public Vector<ConstructorDecl> getConstructorDeclarations() {
        return constructorDeclarations;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDecl classDecl = (ClassDecl) o;
        return identifier.equals(classDecl.identifier) && Objects.equals(type, classDecl.type) && fieldDelcarations.equals(classDecl.fieldDelcarations) && methodDeclarations.equals(classDecl.methodDeclarations) && constructorDeclarations.equals(classDecl.constructorDeclarations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type, fieldDelcarations, methodDeclarations, constructorDeclarations);
    }

    @Override
    public void accept(SemanticVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visit(this);
    }
}
