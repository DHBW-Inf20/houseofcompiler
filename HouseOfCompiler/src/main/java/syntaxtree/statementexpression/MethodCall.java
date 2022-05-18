package syntaxtree.statementexpression;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;

import java.util.Objects;
import common.PrintableVector;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class MethodCall implements IStatementExpression{

    public String identifier;
    public IExpression reciever;
    public PrintableVector<IExpression> arguments;
    public Type type;

    public MethodCall(String identifier, IExpression target, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.reciever = target;
        this.arguments = arguments;
    }

    public MethodCall(IExpression target, String identifier,  PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.reciever = target;
        this.arguments = arguments;
    }

    public MethodCall(String identifier, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.reciever = null;
        this.arguments = arguments;
    }

    public String getIdentifier() {
        return identifier;
    }

    public IExpression getReciever() {
        return reciever;
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
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodCall that = (MethodCall) o;
        return identifier.equals(that.identifier) && reciever.equals(that.reciever) && arguments.equals(that.arguments) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, reciever, arguments, type);
    }
}
