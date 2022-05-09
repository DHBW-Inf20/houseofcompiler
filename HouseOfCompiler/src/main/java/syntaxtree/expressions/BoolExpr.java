package syntaxtree.expressions;

import common.Type;

import java.util.Objects;

public class BoolExpr implements IExpression{

    private boolean value;
    private Type type;

    public BoolExpr(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
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
        BoolExpr boolExpr = (BoolExpr) o;
        return value == boolExpr.value && Objects.equals(type, boolExpr.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}
