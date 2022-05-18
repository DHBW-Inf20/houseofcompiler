package common;

import common.Type;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.Program;
import visitor.SemanticVisitor;

public class ReferenceType implements Type {

   private String identifier;

    public ReferenceType(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return (String) identifier;
    }

  
}
