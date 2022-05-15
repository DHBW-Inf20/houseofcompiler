package syntaxtree.structure;

import syntaxtree.expressions.Binary;
import visitor.SemanticVisitor;
import visitor.Visitable;

import java.util.Objects;
import common.PrintableVector;
import visitor.codevisitor.ClassCodeVisitor;

public class ClassDecl implements Visitable {

    private String identifier;
    private PrintableVector<FieldDecl> fieldDelcarations;
    private PrintableVector<MethodDecl> methodDeclarations;
    private PrintableVector<ConstructorDecl> constructorDeclarations;

    public ClassDecl(String identifier, PrintableVector<FieldDecl> fieldDelcarations,  PrintableVector<ConstructorDecl> constructorDeclarations, PrintableVector<MethodDecl> methodDeclarations) {
        this.identifier = identifier;
        this.fieldDelcarations = fieldDelcarations;
        this.methodDeclarations = methodDeclarations;
        this.constructorDeclarations = constructorDeclarations;
    }

    public String getIdentifier() {
        return identifier;
    }


    public PrintableVector<FieldDecl> getFieldDelcarations() {
        return fieldDelcarations;
    }

    public PrintableVector<MethodDecl> getMethodDeclarations() {
        return methodDeclarations;
    }

    public PrintableVector<ConstructorDecl> getConstructorDeclarations() {
        return constructorDeclarations;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDecl classDecl = (ClassDecl) o;
        return identifier.equals(classDecl.identifier)  && fieldDelcarations.equals(classDecl.fieldDelcarations) && methodDeclarations.equals(classDecl.methodDeclarations) && constructorDeclarations.equals(classDecl.constructorDeclarations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, fieldDelcarations, methodDeclarations, constructorDeclarations);
    }

    @Override
    public Binary accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void accept(ClassCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("\"").append(identifier).append("\"\n");
        sb.append("\tfieldDelcarations:\n\t").append(fieldDelcarations).append("\n");
        sb.append("\tmethodDeclarations:\n\t").append(methodDeclarations).append("\n");
        sb.append("\tconstructorDeclarations:\n\t").append(constructorDeclarations).append("\n");
        return sb.toString();
    }
}
