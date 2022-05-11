package syntaxtree.statementexpression;

import common.Type;
import syntaxtree.expressions.IExpression;

import java.util.Objects;
import common.PrintableVector;

public class MethodCall implements IStatementExpression{

    public String identifier;
    public IExpression target;
    public PrintableVector<IExpression> arguments;
    public Type type;

    public MethodCall(String identifier, IExpression target, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.target = target;
        this.arguments = arguments;
    }

    public String getIdentifier() {
        return identifier;
    }

    public IExpression getTarget() {
        return target;
    }

    public PrintableVector<IExpression> getArguments() {
        return arguments;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodCall that = (MethodCall) o;
        return identifier.equals(that.identifier) && target.equals(that.target) && arguments.equals(that.arguments) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, target, arguments, type);
    }
}
