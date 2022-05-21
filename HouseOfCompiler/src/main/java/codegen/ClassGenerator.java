package codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import codegen.utils.GenUtils;
import context.Context;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import visitor.codevisitor.ClassCodeVisitor;

public class ClassGenerator implements ClassCodeVisitor {

    private final ClassWriter cw;

    private Context context;

    public ClassGenerator(Context context) {
        this.context = context;
        this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
    }

    /**
     * @return byte[]
     */
    public byte[] getBytecode() {
        return cw.toByteArray();
    }

    /**
     * @param clazz
     */
    @Override
    public void visit(ClassDecl clazz) {
        cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC, clazz.getIdentifier(), null, "java/lang/Object", null);

        clazz.getFieldDelcarations().forEach(field -> field.accept(this));

        if (clazz.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(new MethodGenerator(clazz.getIdentifier(), context, cw));
        } else {
            clazz.getConstructorDeclarations().forEach(
                    constructor -> constructor.accept(new MethodGenerator(clazz.getIdentifier(), context, cw)));
        }

        clazz.getMethodDeclarations()
                .forEach(method -> method.accept(new MethodGenerator(clazz.getIdentifier(), context, cw)));

        cw.visitEnd();
    }

    /**
     * @param field
     */
    @Override
    public void visit(FieldDecl field) {
        cw.visitField(GenUtils.resolveAccessModifier(field.getAccessModifier()), field.getIdentifier(),
                GenUtils.generateDescriptor(field.getType()), null, null).visitEnd();

    }
}
