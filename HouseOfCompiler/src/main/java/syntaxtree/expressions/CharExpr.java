package syntaxtree.expressions;

import common.BaseType;
import common.Primitives;
import common.Type;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class CharExpr implements IExpression{

    private char value;
    private Type type;

    public CharExpr(char value) {
        this.value = value;
        this.type = new BaseType(Primitives.CHAR);
    }

    public char getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type accept(SemanticVisitor visitor) {
        return visitor.visit(this);
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
