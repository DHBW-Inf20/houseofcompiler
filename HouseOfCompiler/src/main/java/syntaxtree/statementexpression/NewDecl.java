package syntaxtree.statementexpression;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;

import java.util.Objects;
import common.PrintableVector;
import common.ReferenceType;
import syntaxtree.structure.MethodDecl;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class NewDecl implements IStatementExpression{

    private PrintableVector<IExpression> arguments;
    private Type type;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewDecl newDecl = (NewDecl) o;
        return arguments.equals(newDecl.arguments) && Objects.equals(type, newDecl.type) && Objects.equals(identifier, newDecl.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments, type, identifier);
    }
}
