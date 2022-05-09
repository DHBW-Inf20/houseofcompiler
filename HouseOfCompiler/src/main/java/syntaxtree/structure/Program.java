package syntaxtree.structure;

import visitor.Visitable;
import visitor.Visitor;

import java.util.Objects;
import java.util.Vector;

public class Program implements Visitable {
    private Vector<ClassDecl> classes;


    public Program(Vector<ClassDecl> classes) {
        this.classes = classes;
    }

    public Vector<ClassDecl> getClasses() {
        return classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return classes.equals(program.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classes);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
