package codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import visitor.CodeVisitor;

public class ClassGenerator extends CodeVisitor implements Opcodes {

    private final ClassWriter cw;

    public ClassGenerator() {
        this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
    }

    public byte[] getBytecode() {
        return cw.toByteArray();
    }

    @Override
    public void visit(ClassDecl clazz) {
        System.out.println("Class: " + clazz.getIdentifier());
        cw.visit(V1_5, ACC_PUBLIC, clazz.getIdentifier(), null, "java/lang/Object", null);

        clazz.getFieldDelcarations().forEach(field -> field.accept(this));

        if (clazz.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(new MethodGenerator(cw));
        } else {
            clazz.getConstructorDeclarations().forEach(constructor -> constructor.accept(new MethodGenerator(cw)));
        }

        clazz.getMethodDeclarations().forEach(method -> method.accept(new MethodGenerator(cw)));

        cw.visitEnd();
    }

    @Override
    public void visit(FieldDecl field) {
        // TODO
    }
}
