package syntaxtree.structure;

import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.Visitable;

public class MethodParameter implements Visitable {

    private Type type;
    public int line;
    public int column;
    private String identifier;

    public MethodParameter(String identifier) {
        this.identifier = identifier;
    }

    public MethodParameter(Type type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public MethodParameter(Type type, String identifier, int line, int column) {
        this.type = type;
        this.identifier = identifier;
        this.line = line;
        this.column = column;
    }

    public MethodParameter(Primitives type, String identifier) {
        this.type = new BaseType(type);
        this.identifier = identifier;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
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
        MethodParameter that = (MethodParameter) o;
        return Objects.equals(type, that.type) && identifier.equals(that.identifier);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, identifier);
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
     * @return String
     */
    @Override
    public String toString() {
        return type + " " + identifier;
    }

}
