package syntaxtree.statementexpression;

import common.Type;
import syntaxtree.expressions.IExpression;

import java.util.Objects;
import java.util.Vector;

public class NewDecl implements IStatementExpression{

    private Vector<IExpression> arguments;
    private Type type;

    public NewDecl(Vector<IExpression> arguments) {
        this.arguments = arguments;
    }

    public Vector<IExpression> getArguments() {
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
        NewDecl newDecl = (NewDecl) o;
        return arguments.equals(newDecl.arguments) && Objects.equals(type, newDecl.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments, type);
    }
}
