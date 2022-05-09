package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.statements.Block;

import java.util.Objects;
import java.util.Vector;

public class ConstructorDecl {

    private Type type;
    private Vector<MethodParameter> parameterDeclarations;
    private AccessModifier accessModifier;
    private Block statement;

    public ConstructorDecl(Vector<MethodParameter> parameterDeclarations, Block statement) {
        this.parameterDeclarations = parameterDeclarations;
        this.statement = statement;
    }

    public Type getType() {
        return type;
    }

    public Vector<MethodParameter> getParameterDeclarations() {
        return parameterDeclarations;
    }

    public Block getStatement() {
        return statement;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructorDecl that = (ConstructorDecl) o;
        return Objects.equals(type, that.type) && parameterDeclarations.equals(that.parameterDeclarations) && accessModifier == that.accessModifier && statement.equals(that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parameterDeclarations, accessModifier, statement);
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

}
