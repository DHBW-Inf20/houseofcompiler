package syntaxtree.expressions;

import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class BoolExpr implements IExpression {

    private boolean value;
    private Type type;
    public int line;
    public int column;

    public BoolExpr(boolean value) {
        this.value = value;
        this.type = new BaseType(Primitives.BOOL);
    }

    /**
     * @return boolean
     */
    public boolean getValue() {
        return value;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
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
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BoolExpr boolExpr = (BoolExpr) o;
        return value == boolExpr.value && Objects.equals(type, boolExpr.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}
