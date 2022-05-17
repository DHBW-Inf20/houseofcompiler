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

    @Override
    public void visit(Program program) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(ClassDecl clazz) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(FieldDecl field) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(ConstructorDecl constructor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(MethodDecl method) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void accept(SemanticVisitor v) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReferenceType other = (ReferenceType) obj;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        return true;
    }
}
