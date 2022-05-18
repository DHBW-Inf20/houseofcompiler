package syntaxtree.statementexpression;

import java.util.Objects;

import common.PrintableVector;
import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class MethodCall implements IStatementExpression {

    public String identifier;
    public IExpression receiver;
    public PrintableVector<IExpression> arguments;
    public Type type;

    public MethodCall(String identifier, IExpression receiver, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
    }

    public MethodCall(IExpression receiver, String identifier, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
    }

    public MethodCall(Type type, IExpression receiver, String identifier, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
        this.type = type;
    }

    public MethodCall(String identifier, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.receiver = null;
        this.arguments = arguments;
    }

    public String getIdentifier() {
        return identifier;
    }

    public IExpression getReceiver() {
        return receiver;
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MethodCall that = (MethodCall) o;
        return identifier.equals(that.identifier) && receiver.equals(that.receiver) && arguments.equals(that.arguments)
                && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, receiver, arguments, type);
    }

    public String printTypes() {
        String returnString = "(";
        for (var expression : arguments) {
            returnString += expression.getType() + ", ";
        }
        // delete the last ", "
        returnString = returnString.substring(0, returnString.length() - 2);
        returnString += ")";
        return returnString;

    }

    @Override
    public String toString() {
        String returnString = "";
        if (receiver != null) {
            returnString += receiver.toString() + ".";
        }
        returnString += identifier;
        returnString += "( " + arguments.toString() + " )";
        return returnString;
    }
}
