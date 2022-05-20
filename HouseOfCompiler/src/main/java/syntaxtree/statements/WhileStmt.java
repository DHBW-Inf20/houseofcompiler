package syntaxtree.statements;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class WhileStmt implements IStatement {

    private Type type;
    public int line;
    public int column;
    private IExpression expression;
    private Block block;

    public WhileStmt(IExpression expression, Block block) {
        this.expression = expression;
        this.block = block;
    }

    public WhileStmt(IExpression expression, Block block, int line, int column) {
        this.expression = expression;
        this.block = block;
        this.line = line;
        this.column = column;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @return IExpression
     */
    public IExpression getExpression() {
        return expression;
    }

    /**
     * @return Block
     */
    public Block getBlock() {
        return block;
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
        WhileStmt whileStmt = (WhileStmt) o;
        return Objects.equals(type, whileStmt.type) && expression.equals(whileStmt.expression)
                && block.equals(whileStmt.block);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, expression, block);
    }
}
