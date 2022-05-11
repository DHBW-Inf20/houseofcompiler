package visitor.codevisitor;

import syntaxtree.structure.Program;

public interface ProgramCodeVisitor {
    void visit(Program program);
}
