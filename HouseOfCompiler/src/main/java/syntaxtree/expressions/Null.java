package syntaxtree.expressions;

import common.Type;

import java.util.Objects;

public class Null implements IExpression{

    private Type type;

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
        Null aThis = (Null) o;
        return Objects.equals(type, aThis.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

}
