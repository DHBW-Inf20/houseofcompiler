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
}
