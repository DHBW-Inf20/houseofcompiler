package syntaxtree.structure;

import syntaxtree.expressions.Binary;
import visitor.SemanticVisitor;
import visitor.Visitable;

import java.util.Objects;
import common.PrintableVector;
import visitor.codevisitor.ProgramCodeVisitor;

public class Program implements Visitable {
    private PrintableVector<ClassDecl> classes;


    public Program(PrintableVector<ClassDecl> classes) {
        this.classes = classes;
    }

    public PrintableVector<ClassDecl> getClasses() {
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
    public Binary accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void accept(ProgramCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Program:\n");
        sb.append("classes:\n").append(classes);
        return sb.toString();
    }
}
