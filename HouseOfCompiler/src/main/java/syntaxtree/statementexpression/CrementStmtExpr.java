package syntaxtree.statementexpression;

import common.*;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class CrementStmtExpr implements IStatementExpression {

    private IExpression stmtExpr;
    private Operator operator;
    private Type type;
    public int line;
    public int column;

    public CrementStmtExpr(IExpression stmtExpr, Operator operator) {
        this.stmtExpr = stmtExpr;
        this.operator = operator;
    }

    public CrementStmtExpr(IExpression stmtExpr, Operator operator, int line, int col) {
        this.stmtExpr = stmtExpr;
        this.operator = operator;
        this.line = line;
        this.column = col;
    }

    public CrementStmtExpr(Type type, IExpression stmtExpr, Operator operator) {
        this.stmtExpr = stmtExpr;
        this.operator = operator;
        this.type = type;
    }

    /**
     * @return IExpression
     */
    public IExpression getExpr() {
        return stmtExpr;
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
        return stmtExpr.equals(assign.stmtExpr)
                && Objects.equals(type, assign.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(stmtExpr, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return this.type + ": " + stmtExpr + ";\n";
    }
}
