package syntaxtree.statements;

import common.Type;
import syntaxtree.expressions.IExpression;

import java.util.Objects;

public class WhileStmt implements IStatement{

    private Type type;
    private IExpression expression;
    private Block block;

    public WhileStmt(IExpression expression, Block block) {
        this.expression = expression;
        this.block = block;
    }

    public Type getType() {
        return type;
    }

    public IExpression getExpression() {
        return expression;
    }

    public Block getBlock() {
        return block;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhileStmt whileStmt = (WhileStmt) o;
        return Objects.equals(type, whileStmt.type) && expression.equals(whileStmt.expression) && block.equals(whileStmt.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, expression, block);
    }
}
