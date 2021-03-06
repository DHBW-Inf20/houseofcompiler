package syntaxtree.structure;

import java.util.Objects;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.statements.Block;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.codevisitor.MethodCodeVisitor;

public class ConstructorDecl implements Visitable {

    private Type type;
    public int line;
    public int column;
    private PrintableVector<MethodParameter> parameterDeclarations;
    private AccessModifier accessModifier;
    private Block block;

    public ConstructorDecl(AccessModifier accessModifier, PrintableVector<MethodParameter> parameterDeclarations,
            Block statement) {
        this.accessModifier = accessModifier;
        this.parameterDeclarations = parameterDeclarations;
        this.block = statement;
        this.type = new BaseType(Primitives.VOID);
    }

    public ConstructorDecl(AccessModifier accessModifier, PrintableVector<MethodParameter> parameterDeclarations,
            Block statement, int line, int col) {
        this.accessModifier = accessModifier;
        this.parameterDeclarations = parameterDeclarations;
        this.block = statement;
        this.type = new BaseType(Primitives.VOID);

        this.line = line;
        this.column = col;
    }

    public ConstructorDecl() {
        this.accessModifier = AccessModifier.PUBLIC;
        this.parameterDeclarations = new PrintableVector<>();
        this.block = new Block();
        this.type = new BaseType(Primitives.VOID);
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @return PrintableVector<MethodParameter>
     */
    public PrintableVector<MethodParameter> getParameterDeclarations() {
        return parameterDeclarations;
    }

    /**
     * @return Block
     */
    public Block getBlock() {
        return block;
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
        ConstructorDecl that = (ConstructorDecl) o;
        return Objects.equals(type, that.type) && parameterDeclarations.equals(that.parameterDeclarations)
                && accessModifier == that.accessModifier && block.equals(that.block);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, parameterDeclarations, accessModifier, block);
    }

    /**
     * @return AccessModifier
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
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
     * @param visitor
     */
    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(accessModifier).append(" ").append(type).append("\n");
        sb.append("\t\tparams:").append(parameterDeclarations).append("\n");
        sb.append("\t\tblock:").append(block).append("\n");
        return sb.toString();
    }
}
