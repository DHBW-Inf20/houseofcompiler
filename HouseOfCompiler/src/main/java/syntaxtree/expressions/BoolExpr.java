package syntaxtree.expressions;

import common.BaseType;
import common.Primitives;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class BoolExpr implements IExpression{

    private boolean value;
    private Type type;

    public BoolExpr(boolean value) {
        this.value = value;
        this.type = new BaseType(Primitives.BOOL);
    }

    public boolean getValue() {
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
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
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
