package codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;
import visitor.Visitor;

public class CodeGen implements Visitor, Opcodes {

    private FieldVisitor fv;
    private MethodVisitor mv;

    public void generateBytecode(Program program) {
        program.accept(this);
    }

    @Override
    public void visit(Program program) {
        System.out.println("Program");
        program.getClasses().forEach(clazz -> clazz.accept(this));
    }

    @Override
    public void visit(ClassDecl clazz) {
        System.out.println("Class: " + clazz.getIdentifier());
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES |ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_5, ACC_PUBLIC, clazz.getIdentifier(), null, "java/lang/Object", null);
    }
}
