package codegen;

import codegen.context.Context;
import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
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

        FieldDecl field = new FieldDecl("testField", AccessModifier.PUBLIC, null);
        field.setType(new BaseType(Primitives.INT));
        PrintableVector<FieldDecl> fields = new PrintableVector<>();
        fields.add(field);

        MethodDecl method = new MethodDecl("testMethod", new PrintableVector<>(), null, AccessModifier.PUBLIC);
        method.setType(new BaseType(Primitives.INT));
        PrintableVector<MethodDecl> methods = new PrintableVector<>();
        methods.add(method);

        classes.add(new ClassDecl("Hund", fields, methods, new PrintableVector<>()));
//        classes.add(new ClassDecl("Katze", new PrintableVector<>(), new PrintableVector<>(), new PrintableVector<>()));

        Program program = new Program(classes);

        System.out.println(new Context(program).toString());


        HashMap<String, byte[]> bytecodeClasses = codeGen.generateBytecode(program);

        for (String clazz : bytecodeClasses.keySet()) {
            System.out.println();
            System.out.println("Klasse: " + clazz);
            System.out.println("Bytecode: " + new String(bytecodeClasses.get(clazz)));
            File file = new File("../" + clazz + ".class");
            if (!file.exists()) file.createNewFile();
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(bytecodeClasses.get(clazz));
            }
        }
    }
}
