package visitor.codevisitor;

import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.FieldDecl;

public interface ClassCodeVisitor {
    void visit(ClassDecl clazz);
    void visit(FieldDecl field);
}
