package syntaxtree.expressions;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

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
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
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
