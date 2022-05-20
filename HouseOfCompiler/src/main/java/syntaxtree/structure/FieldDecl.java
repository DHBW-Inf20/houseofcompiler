package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.codevisitor.ClassCodeVisitor;

import java.util.Objects;


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

    public FieldDecl(AccessModifier accessModifier, Type type, String identifier){
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.type = type;
    }

    public FieldDecl(AccessModifier accessModifier, Type type, String identifier, int line, int col){
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.type = type;
        this.line = line;
        this.column = col;
    }

    public FieldDecl(Type type, String identifier){
        this.identifier = identifier;
        this.accessModifier = AccessModifier.PACKAGE_PRIVATE;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type){
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldDecl fieldDecl = (FieldDecl) o;
        return identifier.equals(fieldDecl.identifier) && accessModifier == fieldDecl.accessModifier && Objects.equals(type, fieldDecl.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, accessModifier, type);
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    @Override
    public void accept(ClassCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(accessModifier).append(" ").append(type).append(" " + identifier).append("\n");
        return sb.toString();
    }
}
