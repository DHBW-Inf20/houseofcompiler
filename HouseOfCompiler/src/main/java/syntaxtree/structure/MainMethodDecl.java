package syntaxtree.structure;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import syntaxtree.statements.Block;

public class MainMethodDecl extends MethodDecl {

    public MainMethodDecl(Block block) {
        super(AccessModifier.PUBLIC_STATIC, new BaseType(Primitives.VOID), "main",
                new PrintableVector<MethodParameter>(),
                block);
    }

}
