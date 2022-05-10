package codegen;

import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        ProgramGenerator codeGen = new ProgramGenerator();

        Vector<ClassDecl> classes = new Vector<>();

        classes.add(new ClassDecl("Hund", new Vector<>(), new Vector<>(), new Vector<>()));
        classes.add(new ClassDecl("Katze", new Vector<>(), new Vector<>(), new Vector<>()));

        Program program = new Program(classes);


        HashMap<String, byte[]> bytecodeClasses = codeGen.generateBytecode(program);

        for (String clazz : bytecodeClasses.keySet()) {
            System.out.println();
            System.out.println("Klasse: " + clazz);
            System.out.println("Bytecode: " + new String(bytecodeClasses.get(clazz)));
        }
    }
}
