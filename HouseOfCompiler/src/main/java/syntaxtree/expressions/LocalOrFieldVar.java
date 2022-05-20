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

    public LocalOrFieldVar(String identifier, int line, int column) {
        this.identifier = identifier;
        this.line = line;
        this.column = column;
    }

    public LocalOrFieldVar(Type type, String identifier) {
        this.identifier = identifier;
        this.type = type;
    }

    /**
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
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
        LocalOrFieldVar that = (LocalOrFieldVar) o;
        return identifier.equals(that.identifier) && Objects.equals(type, that.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(identifier, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return identifier + " (" + type + ")[lofv]";
    }
}
