package visitor;

import common.Type;
import visitor.codevisitor.ClassCodeVisitor;
import visitor.codevisitor.MethodCodeVisitor;
import visitor.codevisitor.ProgramCodeVisitor;

public interface Visitable {
    default void accept(ProgramCodeVisitor visitor) {}
    default void accept(ClassCodeVisitor visitor) {}
    default void accept(MethodCodeVisitor visitor) {}
    Type accept(SemanticVisitor visitor);
}
