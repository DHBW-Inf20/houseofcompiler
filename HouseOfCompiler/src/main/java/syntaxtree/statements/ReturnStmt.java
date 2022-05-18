package syntaxtree.statements;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class ReturnStmt implements IStatement {

    private IExpression expression;
    private Type type;

    public ReturnStmt(IExpression expression) {
        this.expression = expression;
    }

    public ReturnStmt(Type type, IExpression expression) {
        this.expression = expression;
        this.type = type;
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
        ReturnStmt that = (ReturnStmt) o;
        return expression.equals(that.expression) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, type);
    }
}
