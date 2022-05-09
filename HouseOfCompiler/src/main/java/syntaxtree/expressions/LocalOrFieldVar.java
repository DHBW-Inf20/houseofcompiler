package syntaxtree.expressions;

import common.Type;

import java.util.Objects;

public class LocalOrFieldVar implements IExpression{

    private String identifier;
    private Type type;

    public LocalOrFieldVar(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalOrFieldVar that = (LocalOrFieldVar) o;
        return identifier.equals(that.identifier) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type);
    }
}
