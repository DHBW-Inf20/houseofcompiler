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

    /**
     * @return Type
     */
    public Type getType() {
        return type;
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
    public IExpression getExpression() {
        return expression;
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
        LocalVarDecl that = (LocalVarDecl) o;
        return Objects.equals(type, that.type) && identifier.equals(that.identifier);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, identifier);
    }
}
