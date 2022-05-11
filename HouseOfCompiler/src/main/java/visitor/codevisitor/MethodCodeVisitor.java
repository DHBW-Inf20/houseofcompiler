package visitor.codevisitor;

import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodDecl;

public interface MethodCodeVisitor {
    void visit(ConstructorDecl constructor);
    void visit(MethodDecl method);
}
