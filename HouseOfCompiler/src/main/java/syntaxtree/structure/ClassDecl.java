package syntaxtree.structure;

import common.Type;

import visitor.Visitable;
import visitor.Visitor;

import java.util.Vector;

public class ClassDecl implements Visitable {

    private String identifier;
    private Type type;
    private Vector<FieldDecl> fieldDelcarations;
    private Vector<MethodDecl> methodDeclarations;
    private Vector<ConstructorDecl> constructorDeclarations;


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
