package codegen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import context.Context;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.This;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statements.Block;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.Program;

public class Test {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        ProgramGenerator codeGen = new ProgramGenerator();

        PrintableVector<ClassDecl> classes = new PrintableVector<>();

        FieldDecl field = new FieldDecl("testField", AccessModifier.PUBLIC);
        field.setType(new BaseType(Primitives.INT));
        PrintableVector<FieldDecl> fields = new PrintableVector<>();
        fields.add(field);

        Block block = new Block();

        var testField = new InstVar("testField", new This());
        testField.setType(Primitives.INT);

        Assign assign = new Assign(testField, new IntegerExpr(6));
        assign.setType(Primitives.VOID);
        block.getStatements().add(assign);

        MethodDecl method = new MethodDecl("testMethod", new PrintableVector<>(), block, AccessModifier.PUBLIC);
        method.setType(new BaseType(Primitives.INT));
        PrintableVector<MethodDecl> methods = new PrintableVector<>();
        methods.add(method);

        classes.add(new ClassDecl("Test", fields, new PrintableVector<>(), methods));

        Program program = new Program(classes);

        System.out.println(new Context(program).toString());

        HashMap<String, byte[]> bytecodeClasses = codeGen.generateBytecode(program);

        for (String clazz : bytecodeClasses.keySet()) {
            System.out.println();
            System.out.println("Klasse: " + clazz);
            System.out.println("Bytecode: " + new String(bytecodeClasses.get(clazz)));
            File file = new File("../" + clazz + ".class");
            if (!file.exists())
                file.createNewFile();
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(bytecodeClasses.get(clazz));
            }
        }
    }
}
