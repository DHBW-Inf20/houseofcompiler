package syntaxtree.statements;

import common.Type;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class LocalVarDecl implements IStatement{

    Type type;
    String identifier;
    IExpression expression;

    public LocalVarDecl(String identifier) {
        this.identifier = identifier;
    }

    public LocalVarDecl(Type type, String identifier, IExpression expression) {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public IExpression getExpression() {
        return expression;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Binary accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalVarDecl that = (LocalVarDecl) o;
        return Objects.equals(type, that.type) && identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, identifier);
    }
}
