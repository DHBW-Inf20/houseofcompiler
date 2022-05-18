package common;

import common.Primitives;
import common.Type;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.Program;
import visitor.SemanticVisitor;

public class BaseType implements Type {
   private Primitives identifier;

    public BaseType(Primitives identifier) {
        this.identifier = identifier;
    }

    

    public Primitives getIdentifier() {
        return (Primitives) this.identifier;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(identifier.toString());
        return sb.toString();
    }




}
