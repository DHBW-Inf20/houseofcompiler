package syntaxtree.statements;

import common.Type;

import java.util.Objects;
import java.util.Vector;

public class Block implements IStatement{

    private Type type;
    private Vector<IStatement> block;

    public Block(Vector<IStatement> block) {
        this.block = block;
    }

    public Type getType() {
        return type;
    }

    public Vector<IStatement> getBlock() {
        return block;
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
}
