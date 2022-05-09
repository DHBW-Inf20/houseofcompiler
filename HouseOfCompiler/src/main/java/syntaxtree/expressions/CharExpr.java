package syntaxtree.expressions;

import common.Type;

import java.util.Objects;

public class CharExpr implements IExpression{

    private char value;
    private Type type;

    public CharExpr(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
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
        CharExpr that = (CharExpr) o;
        return value == that.value && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}
