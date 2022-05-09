package syntaxtree;

import visitor.Visitable;
import visitor.Visitor;

import java.util.Vector;

public class Program implements Visitable {
    public Vector<ClassDecl> classes;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
