package syntaxtree.expressions;

import java.util.Objects;

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

    public InstVar(String identifier, IExpression expression) {
        this.identifier = identifier;
        this.expression = expression;
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

    public String getIdentifier() {
        return identifier;
    }

    public IExpression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setType(Primitives type) {
        this.type = new BaseType(type);
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
        InstVar instVar = (InstVar) o;
        return identifier.equals(instVar.identifier) && expression.equals(instVar.expression)
                && Objects.equals(type, instVar.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, expression, type);
    }

    @Override
    public String toString() {
        return expression + "." + identifier + "(" + type + ")";
    }

}
