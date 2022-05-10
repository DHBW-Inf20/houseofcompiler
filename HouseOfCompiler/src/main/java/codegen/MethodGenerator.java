package codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodDecl;
import visitor.CodeVisitor;

public class MethodGenerator extends CodeVisitor implements Opcodes {

    public ClassWriter cw;
    public MethodVisitor mv;

    public MethodGenerator(ClassWriter cw) {
        this.cw = cw;
    }

    @Override
    public void visit(ConstructorDecl constructor) {
        // TODO
    }

    @Override
    public void visit(MethodDecl method) {
        // TODO
    }
}
