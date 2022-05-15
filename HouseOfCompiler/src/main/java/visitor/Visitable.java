package visitor;

import syntaxtree.expressions.Binary;
import visitor.codevisitor.ClassCodeVisitor;
import visitor.codevisitor.MethodCodeVisitor;
import visitor.codevisitor.ProgramCodeVisitor;

public interface Visitable {
    default void accept(ProgramCodeVisitor visitor) {}
    default void accept(ClassCodeVisitor visitor) {}
    default void accept(MethodCodeVisitor visitor) {}
    Binary accept(SemanticVisitor visitor);
}
