package syntaxtree.structure;

import common.*;

import visitor.SemanticVisitor;
import visitor.Visitable;


import java.util.Objects;

public class MethodParameter implements Visitable {

    private Type type;
    private String identifier;

    public MethodParameter(Type type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public MethodParameter() {

    }

    public MethodParameter(String identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodParameter that = (MethodParameter) o;
        return Objects.equals(type, that.type) && identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, identifier);
    }



    @Override
    public Type accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }
}
