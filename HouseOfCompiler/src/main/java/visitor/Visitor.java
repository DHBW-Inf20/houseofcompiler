package visitor;


import syntaxtree.ClassDecl;
import syntaxtree.Program;

public interface Visitor {
    void visit(Program program);
    void visit(ClassDecl clazz);
}