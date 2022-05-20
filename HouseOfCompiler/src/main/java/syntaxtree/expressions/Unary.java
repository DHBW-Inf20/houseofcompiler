package syntaxtree.expressions;

import java.util.Objects;

import common.Operator;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class Unary implements IExpression {

    private IExpression expression;
    private Operator operator;
    private Type type;
    public int line;
    public int column;

    public Unary(IExpression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
    }

    public Unary(IExpression expression, Operator operator, int line, int column) {
        this.expression = expression;
        this.operator = operator;
        this.line = line;
        this.column = column;
    }

    /**
     * @return IExpression
     */
    public IExpression getExpression() {
        return expression;
    }

    /**
     * @return Operator
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
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
        Unary unary = (Unary) o;
        return expression.equals(unary.expression) && operator == unary.operator && Objects.equals(type, unary.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(expression, operator, type);
    }

}
