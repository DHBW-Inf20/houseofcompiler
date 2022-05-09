package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.statements.Block;

import java.util.Objects;
import java.util.Vector;

public class MethodDecl {

    private String identifier;
    private Type type;
    private Vector<MethodParameter> parameters;
    private Block statement;
    private AccessModifier accessModifier;

    public MethodDecl(String identifier, Vector<MethodParameter> parameters, Block statement, AccessModifier accessModifier) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.statement = statement;
        this.accessModifier = accessModifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public Vector<MethodParameter> getParameters() {
        return parameters;
    }

    public Block getStatement() {
        return statement;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodDecl that = (MethodDecl) o;
        return identifier.equals(that.identifier) && Objects.equals(type, that.type) && parameters.equals(that.parameters) && statement.equals(that.statement) && accessModifier == that.accessModifier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type, parameters, statement, accessModifier);
    }
}
