package codegen;

import codegen.utils.GenUtils;
import common.Type;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;
import visitor.CodeVisitor;

import java.util.Vector;
import java.util.stream.Collectors;

public class MethodGenerator extends CodeVisitor implements Opcodes {

    public ClassWriter cw;
    public MethodVisitor mv;

    public MethodGenerator(ClassWriter cw) {
        this.cw = cw;
    }

    @Override
    public void visit(ConstructorDecl constructor) {
        Vector<Type> parameter = constructor.getParameterDeclarations().stream().map(MethodParameter::getType).collect(Collectors.toCollection(Vector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(constructor.getAccessModifier()), "<init>", GenUtils.generateDescriptor(parameter, constructor.getType()), null, null);
        mv.visitCode();

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        // TODO: visit Block
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    @Override
    public void visit(MethodDecl method) {
        // TODO
    }
}
