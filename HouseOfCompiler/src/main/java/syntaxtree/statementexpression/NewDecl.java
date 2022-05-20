package syntaxtree.statementexpression;

import java.util.Objects;

import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class NewDecl implements IStatementExpression {

    private PrintableVector<IExpression> arguments;
    private Type type;
public int line;
public int column;
    private String identifier;

    public NewDecl(String identifier, PrintableVector<IExpression> arguments) {
        this.arguments = arguments;
        this.identifier = identifier;
        this.type = new ReferenceType(identifier);
    }

    public PrintableVector<IExpression> getArguments() {
        return arguments;
    }

    public String getIdentifier() {
        return identifier;
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
        NewDecl newDecl = (NewDecl) o;
        return arguments.equals(newDecl.arguments) && Objects.equals(type, newDecl.type)
                && Objects.equals(identifier, newDecl.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments, type, identifier);
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
}
