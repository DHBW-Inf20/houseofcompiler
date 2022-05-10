package codegen;

import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import common.PrintableVector;

public class Test {

    public static void main(String[] args) throws IOException {
        ProgramGenerator codeGen = new ProgramGenerator();

        PrintableVector<ClassDecl> classes = new PrintableVector<>();

        classes.add(new ClassDecl("Hund", new PrintableVector<>(), new PrintableVector<>(), new PrintableVector<>()));
        classes.add(new ClassDecl("Katze", new PrintableVector<>(), new PrintableVector<>(), new PrintableVector<>()));

        Program program = new Program(classes);


        HashMap<String, byte[]> bytecodeClasses = codeGen.generateBytecode(program);

        for (String clazz : bytecodeClasses.keySet()) {
            System.out.println();
            System.out.println("Klasse: " + clazz);
//            System.out.println("Bytecode: " + new String(bytecodeClasses.get(clazz)));
            File file = new File("../" + clazz + ".class");
            if (!file.exists()) file.createNewFile();
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(bytecodeClasses.get(clazz));
            }
        }
    }
}
