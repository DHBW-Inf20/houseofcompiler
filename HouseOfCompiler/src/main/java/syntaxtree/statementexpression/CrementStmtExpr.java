package syntaxtree.statementexpression;

import java.util.Objects;

import common.BaseType;
import common.Operator;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class CrementStmtExpr implements IStatementExpression {

    private IExpression expression;
    private Operator operator;
    private Type type;
    public int line;
    public int column;

    public CrementStmtExpr(IExpression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
    }

    public CrementStmtExpr(IExpression expression, Operator operator, int line, int col) {
        this.expression = expression;
        this.operator = operator;
        this.line = line;
        this.column = col;
    }

    public CrementStmtExpr(Type type, IExpression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
        this.type = type;
    }

    /**
     * @return IExpression
     */
    public IExpression getExpression() {
        return expression;
    }

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
     * @param className
     */
    public void setType(String className) {
        this.type = new ReferenceType(className);
    }

    /**
     * @param type
     */
    public void setType(Primitives type) {
        this.type = new BaseType(type);
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
        CrementStmtExpr assign = (CrementStmtExpr) o;
        return expression.equals(assign.expression)
                && Objects.equals(type, assign.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(expression, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        switch (operator) {
            case INCPRE:
                return "++" + expression.toString() + " (" + this.type + ")";
            case DECPRE:
                return "--" + expression.toString() + " (" + this.type + ")";
            case INCSUF:
                return expression.toString() + "++" + " (" + this.type + ")";
            case DECSUF:
                return expression.toString() + "--" + " (" + this.type + ")";
            default:
                return "CrementWithWrongOperator???";
        }
    }
}
