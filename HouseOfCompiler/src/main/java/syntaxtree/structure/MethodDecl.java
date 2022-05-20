package syntaxtree.structure;

import java.util.Objects;

import common.AccessModifier;
import common.PrintableVector;
import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.statements.Block;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.codevisitor.MethodCodeVisitor;

public class MethodDecl implements Visitable {

    private String identifier;
    private Type type;
    public int line;
    public int column;
    private PrintableVector<MethodParameter> parameters;
    private Block block;
    private AccessModifier accessModifier;

    public MethodDecl(String identifier, PrintableVector<MethodParameter> parameters, Block statement,
            AccessModifier accessModifier) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.block = statement;
        this.accessModifier = accessModifier;
    }

    public MethodDecl(AccessModifier accessModifier, Type type, String identifier,
            PrintableVector<MethodParameter> parameters, Block block) {
        this.type = type;
        this.identifier = identifier;
        this.parameters = parameters;
        this.accessModifier = accessModifier;
        this.block = block;
    }

    public MethodDecl(AccessModifier accessModifier, Type type, String identifier,
            PrintableVector<MethodParameter> parameters, Block block, int line, int column) {
        this.type = type;
        this.identifier = identifier;
        this.parameters = parameters;
        this.accessModifier = accessModifier;
        this.block = block;
        this.line = line;
        this.column = column;
    }

    public MethodDecl(Type type, String identifier, PrintableVector<MethodParameter> parameters, Block block) {
        this.type = type;
        this.identifier = identifier;
        this.parameters = parameters;
        this.accessModifier = AccessModifier.PACKAGE_PRIVATE;
        this.block = block;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public PrintableVector<MethodParameter> getParameters() {
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MethodDecl that = (MethodDecl) o;
        return identifier.equals(that.identifier) && Objects.equals(type, that.type)
                && parameters.equals(that.parameters) && block.equals(that.block)
                && accessModifier == that.accessModifier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type, parameters, block, accessModifier);
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(accessModifier).append(" ").append(type).append(" ").append(identifier).append("\n");
        sb.append("\t\tparams:").append(parameters).append("\n");
        sb.append("\t\tblock:").append(block).append("\n");
        return sb.toString();
    }
}
