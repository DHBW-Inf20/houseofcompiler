package syntaxtree.structure;

import java.util.Objects;

import common.PrintableVector;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.codevisitor.ClassCodeVisitor;

public class ClassDecl implements Visitable {

    private String identifier;
    private PrintableVector<FieldDecl> fieldDelcarations;
    private PrintableVector<MethodDecl> methodDeclarations;
    private PrintableVector<ConstructorDecl> constructorDeclarations;

    public ClassDecl(String identifier, PrintableVector<FieldDecl> fieldDelcarations,
            PrintableVector<ConstructorDecl> constructorDeclarations, PrintableVector<MethodDecl> methodDeclarations) {
        this.identifier = identifier;
        this.fieldDelcarations = fieldDelcarations;
        this.methodDeclarations = methodDeclarations;
        this.constructorDeclarations = constructorDeclarations;
    }

    /**
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return PrintableVector<FieldDecl>
     */
    public PrintableVector<FieldDecl> getFieldDelcarations() {
        return fieldDelcarations;
    }

    /**
     * @return PrintableVector<MethodDecl>
     */
    public PrintableVector<MethodDecl> getMethodDeclarations() {
        return methodDeclarations;
    }

    /**
     * @return PrintableVector<ConstructorDecl>
     */
    public PrintableVector<ConstructorDecl> getConstructorDeclarations() {
        return constructorDeclarations;
    }

    /**
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ClassDecl classDecl = (ClassDecl) o;
        return identifier.equals(classDecl.identifier) && fieldDelcarations.equals(classDecl.fieldDelcarations)
                && methodDeclarations.equals(classDecl.methodDeclarations)
                && constructorDeclarations.equals(classDecl.constructorDeclarations);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(identifier, fieldDelcarations, methodDeclarations, constructorDeclarations);
    }

    /**
     * @param visitor
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(ClassCodeVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return String
     */
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
