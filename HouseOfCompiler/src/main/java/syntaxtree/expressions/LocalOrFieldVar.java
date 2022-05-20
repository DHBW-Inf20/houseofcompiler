package syntaxtree.expressions;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class LocalOrFieldVar implements IExpression {

    private String identifier;
    private Type type;
public int line;
public int column;

    public LocalOrFieldVar(String identifier) {
        this.identifier = identifier;
    }

    public LocalOrFieldVar(Type type, String identifier) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
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
        LocalOrFieldVar that = (LocalOrFieldVar) o;
        return identifier.equals(that.identifier) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type);
    }

    @Override
    public String toString() {
        return identifier + " (" + type + ")[lofv]";
    }
}
