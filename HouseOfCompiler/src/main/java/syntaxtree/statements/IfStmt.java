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
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(condition, blockIf, blockElse, type);
    }
}
