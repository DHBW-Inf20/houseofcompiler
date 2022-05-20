package visitor;

import semantic.TypeCheckResult;
import visitor.codevisitor.ClassCodeVisitor;
import visitor.codevisitor.MethodCodeVisitor;
import visitor.codevisitor.ProgramCodeVisitor;

public interface Visitable {
    default void accept(ProgramCodeVisitor visitor) {
    }

    default void accept(ClassCodeVisitor visitor) {
    }

    default void accept(MethodCodeVisitor visitor) {
    }

    TypeCheckResult accept(SemanticVisitor visitor);
}
