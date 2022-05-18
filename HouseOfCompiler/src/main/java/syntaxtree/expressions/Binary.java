package syntaxtree.expressions;

import java.util.Objects;

import common.Operator;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class Binary implements IExpression {

    private IExpression lExpression;
    private IExpression rExpression;
    private Operator operator;
    private Type type;

    public Binary(IExpression lExpression, IExpression rExpression, Operator operator) {
        this.lExpression = lExpression;
        this.rExpression = rExpression;
        this.operator = operator;
    }

    public Binary(IExpression lExpression, Operator operator, IExpression rExpression) {
        this.lExpression = lExpression;
        this.rExpression = rExpression;
        this.operator = operator;
        this.type = null;
    }

    public IExpression getlExpression() {
        return lExpression;
    }

    public IExpression getrExpression() {
        return rExpression;
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
        Binary binary = (Binary) o;
        return lExpression.equals(binary.lExpression) && rExpression.equals(binary.rExpression)
                && operator == binary.operator && Objects.equals(type, binary.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lExpression, rExpression, operator, type);
    }
}
