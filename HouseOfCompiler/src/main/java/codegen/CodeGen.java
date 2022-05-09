package codegen;

import syntaxtree.ClassDecl;
import syntaxtree.Program;
import visitor.Visitor;

public class CodeGen implements Visitor {

    public void generateBytecode(Program program) {
        program.accept(this);
    }

    @Override
    public void visit(Program program) {
        System.out.println("Program");
        for (ClassDecl classDecl : program.classes) {
            classDecl.accept(this);
        }
    }

    @Override
    public void visit(ClassDecl clazz) {
        System.out.println("ClassDecl");
    }
}
