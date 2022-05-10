package visitor;

public interface Visitable {
    void accept(CodeVisitor visitor);
    void accept(SemanticVisitor visitor);
}
