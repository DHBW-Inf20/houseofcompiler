package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.statements.Block;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.CodeVisitor;

import java.util.Objects;
import java.util.Vector;

public class MethodDecl implements Visitable {

    private String identifier;
    private Type type;
    private Vector<MethodParameter> parameters;
    private Block block;
    private AccessModifier accessModifier;

    public MethodDecl(String identifier, Vector<MethodParameter> parameters, Block statement, AccessModifier accessModifier) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.block = statement;
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

    public Block getBlock() {
        return block;
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
        return identifier.equals(that.identifier) && Objects.equals(type, that.type) && parameters.equals(that.parameters) && block.equals(that.block) && accessModifier == that.accessModifier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type, parameters, block, accessModifier);
    }

    @Override
    public void accept(SemanticVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visit(this);
    }
}
