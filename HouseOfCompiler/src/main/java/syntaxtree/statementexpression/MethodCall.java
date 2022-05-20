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
    public int line;
    public int column;

    public MethodCall(String identifier, IExpression receiver, PrintableVector<IExpression> arguments) {
        this.identifier = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
    }

    public MethodCall(String identifier, IExpression receiver, PrintableVector<IExpression> arguments, int line,
            int column) {
        this.identifier = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
        this.line = line;
        this.column = column;
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

    /**
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return IExpression
     */
    public IExpression getReceiver() {
        return receiver;
    }

    /**
     * @return PrintableVector<IExpression>
     */
    public PrintableVector<IExpression> getArguments() {
        return arguments;
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
        MethodCall that = (MethodCall) o;
        return identifier.equals(that.identifier) && receiver.equals(that.receiver) && arguments.equals(that.arguments)
                && Objects.equals(type, that.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(identifier, receiver, arguments, type);
    }

    /**
     * @return String
     */
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

    /**
     * @return String
     */
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
