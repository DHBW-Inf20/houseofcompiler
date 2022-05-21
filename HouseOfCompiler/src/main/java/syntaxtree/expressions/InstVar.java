package syntaxtree.expressions;

import java.util.Objects;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class InstVar implements IExpression {

    private String identifier;
    private IExpression expression;
    private Type type;
    private boolean _static = false;
    public int line;
    public int column;

    public InstVar(String identifier, IExpression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public InstVar(String identifier, IExpression expression, int line, int column) {
        this.identifier = identifier;
        this.expression = expression;
        this.line = line;
        this.column = column;
    }

    public InstVar(IExpression expression, String identifier) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public InstVar(Type type, String identifier, IExpression expression) {
        this.identifier = identifier;
        this.expression = expression;
        this.type = type;
    }

    public InstVar(Type type, IExpression expression, String identifier) {
        this.identifier = identifier;
        this.expression = expression;
        this.type = type;
    }

    public InstVar(String type, IExpression expression, String identifier) {
        this.identifier = identifier;
        this.expression = expression;
        this.type = new ReferenceType(type);
    }

    /**
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return IExpression
     */
    public IExpression getExpression() {
        return expression;
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
     * @param type
     */
    public void setType(Primitives type) {
        this.type = new BaseType(type);
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
        InstVar instVar = (InstVar) o;
        return identifier.equals(instVar.identifier) && expression.equals(instVar.expression)
                && Objects.equals(type, instVar.type) && (_static == instVar._static);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(identifier, expression, type, _static);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return (_static ? "STATIC " : "") + expression + "." + identifier + "(" + type + ")[instvar]";
    }

    public boolean isStatic() {
        return _static;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        if (accessModifier == null) {
            _static = false;
            return;
        }
        switch (accessModifier) {
            case PRIVATE_STATIC, PUBLIC_STATIC -> {
                this._static = true;
            }
            default -> {
                this._static = false;
            }
        }
    }

}
