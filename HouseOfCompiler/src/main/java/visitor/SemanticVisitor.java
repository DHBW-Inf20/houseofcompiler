package visitor;


import syntaxtree.structure.*;

public interface SemanticVisitor {
    void visit(Program program);

    void visit(ClassDecl clazz);

    void visit(FieldDecl field);

    void visit(ConstructorDecl constructor);

    void visit(MethodDecl method);
}