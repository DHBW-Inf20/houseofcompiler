package syntaxtree.expressions;

import java.util.Objects;

import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class This implements IExpression {

    private Type type;

    public This() {
    }

    public This(String className) {
        this.type = new ReferenceType(className);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setType(String className) {
        this.type = new ReferenceType(className);
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
        This aThis = (This) o;
        return Objects.equals(type, aThis.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

}
