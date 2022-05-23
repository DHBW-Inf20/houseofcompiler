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
    public int line;
    public int column;

    public ReturnStmt(IExpression expression) {
        this.expression = expression;
    }

    public ReturnStmt(IExpression expression, int line, int column) {
        this.expression = expression;
        this.line = line;
        this.column = column;
    }

    public ReturnStmt(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public ReturnStmt(Type type, IExpression expression) {
        this.expression = expression;
        this.type = type;
    }

    /**
     * @return IExpression
     */
    public IExpression getExpression() {
        return expression;
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
        ReturnStmt that = (ReturnStmt) o;
        return expression.equals(that.expression) && Objects.equals(type, that.type);
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
        return "return " + expression + "(" + type + ")";
    }
}
