package syntaxtree.expressions;

import common.BaseType;
import common.Primitives;
import common.Type;

import java.util.Objects;


public class InstVar implements IExpression{

    private String identifier;
    private IExpression expression;
    private Type type;

    public InstVar(String identifier, IExpression expression) {
        this.identifier = identifier;
        this.expression = expression;
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

    public void setType(Primitives type){
        this.type = new BaseType(type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstVar instVar = (InstVar) o;
        return identifier.equals(instVar.identifier) && expression.equals(instVar.expression) && Objects.equals(type, instVar.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, expression, type);
    }


}
