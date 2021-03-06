package syntaxtree.expressions;

import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class CharExpr implements IExpression {

    private char value;
    private Type type;
    public int line;
    public int column;

    public CharExpr(char value) {
        this.value = value;
        this.type = new BaseType(Primitives.CHAR);
    }

    /**
     * @return char
     */
    public char getValue() {
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
        CharExpr that = (CharExpr) o;
        return value == that.value && Objects.equals(type, that.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "'" + value + "'";
    }
}
