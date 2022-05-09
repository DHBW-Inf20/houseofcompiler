package visitor;


import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

public interface Visitor {
    void visit(Program program);
    void visit(ClassDecl clazz);
}