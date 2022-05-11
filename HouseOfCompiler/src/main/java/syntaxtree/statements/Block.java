package syntaxtree.statements;

import common.BaseType;
import common.Primitives;
import common.Type;

import java.util.Objects;
import common.PrintableVector;

public class Block implements IStatement{

    private Type type;
    private PrintableVector<IStatement> block;

    public Block(PrintableVector<IStatement> block) {
        this.block = block;
    }

    public Block() {
        block = new PrintableVector<>();
        type = new BaseType(Primitives.VOID);
    }

    public Type getType() {
        return type;
    }

    public PrintableVector<IStatement> getBlock() {
        return block;
    }

    public void setType(Primitives type) {
        this.type = new BaseType(type);
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block1 = (Block) o;
        return Objects.equals(type, block1.type) && block.equals(block1.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, block);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(type.toString());
        sb.append("{");
        sb.append(block);
        sb.append('}');
        return sb.toString();
    }
}
