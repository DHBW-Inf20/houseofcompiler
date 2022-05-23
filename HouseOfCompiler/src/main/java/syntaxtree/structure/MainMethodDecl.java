package syntaxtree.structure;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import syntaxtree.statements.Block;
import visitor.codevisitor.MethodCodeVisitor;

public class MainMethodDecl extends MethodDecl {

    public MainMethodDecl(Block block) {
        super(AccessModifier.PUBLIC_STATIC, new BaseType(Primitives.VOID), "main",
                new PrintableVector<MethodParameter>(),
                block);
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }
}
