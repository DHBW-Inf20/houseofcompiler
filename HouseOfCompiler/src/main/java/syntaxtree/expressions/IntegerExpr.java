package syntaxtree.expressions;

import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class IntegerExpr implements IExpression {

    private int value;
    private Type type;
public int line;
public int column;

    public IntegerExpr(int value) {
        this.value = value;
        this.type = new BaseType(Primitives.INT);
    }

    public int getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        IntegerExpr that = (IntegerExpr) o;
        return value == that.value && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    @Override
    public String toString() {
        return value + "";
    }
}
