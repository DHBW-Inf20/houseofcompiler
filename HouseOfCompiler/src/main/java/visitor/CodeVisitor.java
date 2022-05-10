package visitor;


import syntaxtree.structure.*;

public class CodeVisitor {
    public void visit(Program program) {}

    public void visit(ClassDecl clazz) {}
    public void visit(FieldDecl field) {}
    public void visit(ConstructorDecl constructor) {}
    public void visit(MethodDecl method) {
    }
}