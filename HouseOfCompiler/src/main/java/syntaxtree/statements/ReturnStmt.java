package syntaxtree.statements;

import common.Type;
import syntaxtree.expressions.IExpression;

import java.util.Objects;

public class ReturnStmt implements IStatement {

    private IExpression expression;
    private Type type;

    public ReturnStmt(IExpression expression) {
        this.expression = expression;
    }

    public IExpression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnStmt that = (ReturnStmt) o;
        return expression.equals(that.expression) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, type);
    }
}
