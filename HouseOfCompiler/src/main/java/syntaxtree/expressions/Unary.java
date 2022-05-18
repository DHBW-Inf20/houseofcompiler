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

    public Unary(IExpression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
    }

    public IExpression getExpression() {
        return expression;
    }

    public Operator getOperator() {
        return operator;
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
        Unary unary = (Unary) o;
        return expression.equals(unary.expression) && operator == unary.operator && Objects.equals(type, unary.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, operator, type);
    }

}
