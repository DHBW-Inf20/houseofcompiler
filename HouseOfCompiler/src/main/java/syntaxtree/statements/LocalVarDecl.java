package syntaxtree.statements;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class LocalVarDecl implements IStatement {

    Type type;
    String identifier;
    IExpression expression;

    public int line;
    public int column;

    public LocalVarDecl(String identifier) {
        this.identifier = identifier;
    }

    public LocalVarDecl(String identifier, int line, int column) {
        this.identifier = identifier;
        this.line = line;
        this.column = column;
    }

    public LocalVarDecl(Type type, String identifier, IExpression expression) {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
    }

    public LocalVarDecl(String identifier, IExpression expression, int line, int column) {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
        this.line = line;
        this.column = column;
    }

    public LocalVarDecl(Type type, String identifier, IExpression expression, int line, int column) {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
        this.line = line;
        this.column = column;
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
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LocalVarDecl that = (LocalVarDecl) o;
        return Objects.equals(type, that.type) && identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, identifier);
    }
}
