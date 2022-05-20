package syntaxtree.statements;

import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class Block implements IStatement {

    private Type type;
    public int line;
    public int column;
    private PrintableVector<IStatement> statements;

    public Block(PrintableVector<IStatement> statements) {
        this.statements = statements;
    }

    public Block(PrintableVector<IStatement> statements, int line, int col) {
        this.statements = statements;
        this.line = line;
        this.column = col;
    }

    public Block() {
        statements = new PrintableVector<>();
    }

    public Block(int line, int col) {
        statements = new PrintableVector<>();
        this.line = line;
        this.column = col;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @return PrintableVector<IStatement>
     */
    public PrintableVector<IStatement> getStatements() {
        return statements;
    }

    /**
     * @param type
     */
    public void setType(Primitives type) {
        this.type = new BaseType(type);
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
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Block block1 = (Block) o;
        return Objects.equals(type, block1.type) && statements.equals(block1.statements);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, statements);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(type != null ? type.toString() : "");
        sb.append("{");
        sb.append(statements);
        sb.append('}');
        return sb.toString();
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
}
