package codegen;

import syntaxtree.ClassDecl;
import syntaxtree.Program;

import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        CodeGen codeGen = new CodeGen();

        Program program = new Program();

        program.classes = new Vector<>();
        program.classes.add(new ClassDecl());
        program.classes.add(new ClassDecl());

        codeGen.generateBytecode(program);
    }
}
