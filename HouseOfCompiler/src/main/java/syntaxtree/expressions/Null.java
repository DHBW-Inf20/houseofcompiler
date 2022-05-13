package syntaxtree.expressions;

import common.Type;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class Null implements IExpression{

    private Type type;

    public Type getType() {
        return type;
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(SemanticVisitor visitor) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Null aThis = (Null) o;
        return Objects.equals(type, aThis.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

}
