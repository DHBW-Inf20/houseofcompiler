package codegen;

import codegen.context.Context;
import codegen.utils.GenUtils;
import common.Type;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;

import common.PrintableVector;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.stream.Collectors;

public class MethodGenerator implements MethodCodeVisitor {

    private final ClassWriter cw;
    private MethodVisitor mv;

    private final Context context;

    private final String className;

    private String lastExpressionIdentifier;


    public MethodGenerator(String className, ClassWriter cw, Context context) {
        this.className = className;
        this.cw = cw;
        this.context = context;
    }

    @Override
    public void visit(ConstructorDecl constructorDecl) {
        PrintableVector<Type> parameterTypes = constructorDecl.getParameterDeclarations().stream().map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(constructorDecl.getAccessModifier()), "<init>", GenUtils.generateDescriptor(parameterTypes, constructorDecl.getType()), null, null);
        mv.visitCode();

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        constructorDecl.getBlock().accept(this);
        mv.visitInsn(Opcodes.RETURN); // Temp
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    @Override
    public void visit(MethodDecl methodDecl) {
        PrintableVector<Type> parameterTypes = methodDecl.getParameters().stream().map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(methodDecl.getAccessModifier()), methodDecl.getIdentifier(), GenUtils.generateDescriptor(parameterTypes, methodDecl.getType()), null, null);
        mv.visitCode();

        methodDecl.getBlock().accept(this);
        mv.visitInsn(Opcodes.RETURN); // Temp
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**************
     * Statements *
     **************/

    @Override
    public void visit(Block block) {
        block.getStatements().forEach(statement -> statement.accept(this));
    }

    @Override
    public void visit(IfStmt ifStmt) {

    }

    @Override
    public void visit(LocalVarDecl localVarDecl) {

    }

    @Override
    public void visit(ReturnStmt returnStmt) {

    }

    @Override
    public void visit(WhileStmt whileStmt) {

    }

    /************************
     * StatementExpressions *
     ************************/

    @Override
    public void visit(Assign assign) {
        IExpression lExpression = assign.getlExpression();
        IExpression rExpression = assign.getrExpression();
        if (lExpression instanceof InstVar) {
            // lExpression.identifier ist immer ein Field?
            InstVar instVar = (InstVar) lExpression;
            instVar.getExpression().accept(this);
            String lIdentifier = lastExpressionIdentifier;
            rExpression.accept(this);
            mv.visitFieldInsn(Opcodes.PUTFIELD, lIdentifier, instVar.getIdentifier(), GenUtils.generateDescriptor(instVar.getType()));

        }
    }

    @Override
    public void visit(MethodCall methodCall) {

    }

    @Override
    public void visit(NewDecl newDecl) {

    }

    /***************
     * Expressions *
     ***************/

    @Override
    public void visit(Binary binary) {

    }

    @Override
    public void visit(BoolExpr boolExpr) {

    }

    @Override
    public void visit(CharExpr charExpr) {

    }

    @Override
    public void visit(InstVar instVar) {

    }

    @Override
    public void visit(IntegerExpr integerExpr) {
        mv.visitIntInsn(Opcodes.BIPUSH, integerExpr.getValue());
    }

    @Override
    public void visit(LocalOrFieldVar localOrFieldVar) {

    }

    @Override
    public void visit(Null nullExpr) {

    }

    @Override
    public void visit(This thisExpr) {
        lastExpressionIdentifier = className;
        mv.visitVarInsn(Opcodes.ALOAD, 0);
    }

    @Override
    public void visit(Unary unary) {

    }
}
