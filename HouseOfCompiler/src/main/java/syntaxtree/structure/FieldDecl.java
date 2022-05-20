package syntaxtree.structure;

import java.util.Objects;

import common.AccessModifier;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.codevisitor.ClassCodeVisitor;

public class FieldDecl implements Visitable {

    private String identifier;
    private AccessModifier accessModifier;
    private Type type;
    public int line;
    public int column;

    public FieldDecl(String identifier, AccessModifier accessModifier) {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
    }

    public FieldDecl(String identifier, AccessModifier accessModifier, int line, int col) {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.column = col;
        this.line = line;
    }

    public FieldDecl(AccessModifier accessModifier, Type type, String identifier) {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.type = type;
    }

    public FieldDecl(AccessModifier accessModifier, Type type, String identifier, int line, int col) {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.type = type;
        this.line = line;
        this.column = col;
    }

    public FieldDecl(Type type, String identifier) {
        this.identifier = identifier;
        this.accessModifier = AccessModifier.PACKAGE_PRIVATE;
        this.type = type;
    }

    /**
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return AccessModifier
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
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
        FieldDecl fieldDecl = (FieldDecl) o;
        return identifier.equals(fieldDecl.identifier) && accessModifier == fieldDecl.accessModifier
                && Objects.equals(type, fieldDecl.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(identifier, accessModifier, type);
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
        sb.append(accessModifier).append(" ").append(type).append(" " + identifier).append("\n");
        return sb.toString();
    }
}
