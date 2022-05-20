package syntaxtree.expressions;

import java.util.Objects;

import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class This implements IExpression {

    private Type type;
    public int line;
    public int column;

    public This() {
    }

    public This(String className) {
        this.type = new ReferenceType(className);
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
     * @param className
     */
    public void setType(String className) {
        this.type = new ReferenceType(className);
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
        This aThis = (This) o;
        return Objects.equals(type, aThis.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "this(" + type + ")";
    }

}
