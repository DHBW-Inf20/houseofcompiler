package syntaxtree.statements;

import common.Type;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class IfStmt implements IStatement {

    private IExpression condition;
    private IStatement blockIf;
    private IStatement blockElse;
    private Type type;

    public IfStmt(IExpression condition, IStatement blockIf, IStatement blockElse) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = blockElse;
    }

    public IExpression getCondition() {
        return condition;
    }

    public IStatement getBlockIf() {
        return blockIf;
    }

    public IStatement getBlockElse() {
        return blockElse;
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
    public Type accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IfStmt ifStmt = (IfStmt) o;
        return condition.equals(ifStmt.condition) && blockIf.equals(ifStmt.blockIf) && Objects.equals(blockElse, ifStmt.blockElse) && Objects.equals(type, ifStmt.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, blockIf, blockElse, type);
    }
}
