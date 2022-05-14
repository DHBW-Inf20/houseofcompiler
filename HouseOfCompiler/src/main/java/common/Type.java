package common;

import visitor.SemanticVisitor;

public interface Type extends SemanticVisitor {
    public void accept(SemanticVisitor v);
}