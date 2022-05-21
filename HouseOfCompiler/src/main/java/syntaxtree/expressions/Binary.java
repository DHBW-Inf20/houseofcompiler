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
    public int line;
    public int column;

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

    public Binary(IExpression leftExpression, IExpression rightExpression, Operator operator, int line,
            int col) {
        this.lExpression = leftExpression;
        this.rExpression = rightExpression;
        this.operator = operator;
        this.line = line;
        this.column = col;
    }

    /**
     * @return IExpression
     */
    public IExpression getlExpression() {
        return lExpression;
    }

    /**
     * @return IExpression
     */
    public IExpression getrExpression() {
        return rExpression;
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
        Binary binary = (Binary) o;
        return lExpression.equals(binary.lExpression) && rExpression.equals(binary.rExpression)
                && operator == binary.operator && Objects.equals(type, binary.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(lExpression, rExpression, operator, type);
    }

    @Override
    public String toString(){
        return "("+type+") "+ lExpression + " " + operator + " " + rExpression;
    }
}
