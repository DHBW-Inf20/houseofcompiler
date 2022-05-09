package codegen;

import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        CodeGen codeGen = new CodeGen();

        Vector<ClassDecl> classes = new Vector<>();

        classes.add(new ClassDecl("Hund", new Vector<>(), new Vector<>(), new Vector<>()));
        classes.add(new ClassDecl("Katze", new Vector<>(), new Vector<>(), new Vector<>()));

        Program program = new Program(classes);


        codeGen.generateBytecode(program);
    }
}
