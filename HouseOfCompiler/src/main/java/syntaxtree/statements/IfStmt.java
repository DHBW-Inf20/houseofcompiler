package syntaxtree.statements;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class IfStmt implements IStatement {

    private IExpression condition;
    private IStatement blockIf;
    private IStatement blockElse;
    private Type type;
    public int line;
    public int column;

    public IfStmt(IExpression condition, IStatement blockIf, IStatement blockElse) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = blockElse;
    }

    public IfStmt(IExpression condition, IStatement blockIf, IStatement blockElse, int line, int column) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = blockElse;
        this.line = line;
        this.column = column;
    }

    public IfStmt(IExpression condition, IStatement blockIf, int line, int column) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = null;
        this.line = line;
        this.column = column;
    }

    /**
     * @return IExpression
     */
    public IExpression getCondition() {
        return condition;
    }

    /**
     * @return IStatement
     */
    public IStatement getBlockIf() {
        return blockIf;
    }

    /**
     * @return IStatement
     */
    public IStatement getBlockElse() {
        return blockElse;
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
        IfStmt ifStmt = (IfStmt) o;
        return condition.equals(ifStmt.condition) && blockIf.equals(ifStmt.blockIf)
                && Objects.equals(blockElse, ifStmt.blockElse) && Objects.equals(type, ifStmt.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(condition, blockIf, blockElse, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "if(" + condition + ")\n" + blockIf + (blockElse != null ? "else\n" + blockElse : "");
    }
}
