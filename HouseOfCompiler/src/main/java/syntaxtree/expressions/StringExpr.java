package syntaxtree.expressions;

import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class StringExpr implements IExpression {

    private String value;
    private Type type;

    public StringExpr(String value) {
        this.value = value;
        this.type = new ReferenceType("java/lang/String");
    }

    /**
     * @return String
     */
    public String getValue() {
        return value;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        // return null;
        return visitor.typeCheck(this);
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(MethodCodeVisitor visitor) {
        // visitor.visit(this);
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StringExpr other = (StringExpr) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
