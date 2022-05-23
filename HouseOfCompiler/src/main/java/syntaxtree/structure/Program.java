package syntaxtree.structure;

import java.util.Objects;

import common.PrintableVector;
import context.Context;
import semantic.TypeCheckResult;
import visitor.SemanticVisitor;
import visitor.Visitable;
import visitor.codevisitor.ProgramCodeVisitor;

public class Program implements Visitable {
    private PrintableVector<ClassDecl> classes;

    private Context context;

    public Program(PrintableVector<ClassDecl> classes) {
        this.classes = classes;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    /**
     * @return PrintableVector<ClassDecl>
     */
    public PrintableVector<ClassDecl> getClasses() {
        return classes;
    }

    /**
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Program program = (Program) o;
        return classes.equals(program.classes);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(classes);
    }

    /**
     * @param visitor
     * @return TypeCheckResult
     */
    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(ProgramCodeVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Program:\n");
        sb.append("classes:\n").append(classes);
        return sb.toString();
    }
}
