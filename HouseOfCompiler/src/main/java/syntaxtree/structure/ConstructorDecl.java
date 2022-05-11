package syntaxtree.structure;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.Type;
import syntaxtree.statements.Block;
import visitor.SemanticVisitor;
import visitor.Visitable;

import java.util.Objects;
import common.PrintableVector;
import visitor.codevisitor.MethodCodeVisitor;

public class ConstructorDecl implements Visitable {

    private Type type;
    private PrintableVector<MethodParameter> parameterDeclarations;
    private AccessModifier accessModifier;
    private Block block;

    public ConstructorDecl(AccessModifier accessModifier, PrintableVector<MethodParameter> parameterDeclarations, Block statement) {
        this.accessModifier = accessModifier;
        this.parameterDeclarations = parameterDeclarations;
        this.block = statement;
        type = new BaseType(Primitives.VOID);
    }

    public ConstructorDecl() {
        this.accessModifier = AccessModifier.PUBLIC;
        this.parameterDeclarations = new PrintableVector<>();
        this.block = new Block();
        type = new BaseType(Primitives.VOID);
    }

    public Type getType() {
        return type;
    }

    public PrintableVector<MethodParameter> getParameterDeclarations() {
        return parameterDeclarations;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructorDecl that = (ConstructorDecl) o;
        return Objects.equals(type, that.type) && parameterDeclarations.equals(that.parameterDeclarations) && accessModifier == that.accessModifier && block.equals(that.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parameterDeclarations, accessModifier, block);
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    @Override
    public Type accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(accessModifier).append(" ").append(type).append("\n");
        sb.append("\t\tparams:").append(parameterDeclarations).append("\n");
        sb.append("\t\tblock:").append(block).append("\n");
        return sb.toString();
    }
}
