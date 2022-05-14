package codegen;

import codegen.context.Context;
import codegen.utils.GenUtils;
import codegen.utils.LocalVarStack;
import common.BaseType;
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

import java.util.Stack;
import java.util.stream.Collectors;

public class MethodGenerator implements MethodCodeVisitor {

    private final String className;
    private final Context context;


    private final ClassWriter cw;
    private MethodVisitor mv;


    private final LocalVarStack localVars;

    private String lastClassName;


    public MethodGenerator(String className, Context context, ClassWriter cw) {
        this.className = className;
        this.cw = cw;
        this.context = context;

        localVars = new LocalVarStack();
    }

    @Override
    public void visit(ConstructorDecl constructorDecl) {
        constructorDecl.getParameterDeclarations().forEach(parameter -> localVars.push(parameter.getIdentifier()));
        PrintableVector<Type> parameterTypes = constructorDecl.getParameterDeclarations().stream().map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(constructorDecl.getAccessModifier()), "<init>", GenUtils.generateDescriptor(parameterTypes, constructorDecl.getType()), null, null);
        mv.visitCode();

        localVars.push("this");
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        constructorDecl.getBlock().accept(this);
        mv.visitInsn(Opcodes.RETURN); // Temp

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    @Override
    public void visit(MethodDecl methodDecl) {
        methodDecl.getParameters().forEach(parameter -> localVars.push(parameter.getIdentifier()));
        PrintableVector<Type> parameterTypes = methodDecl.getParameters().stream().map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(methodDecl.getAccessModifier()), methodDecl.getIdentifier(), GenUtils.generateDescriptor(parameterTypes, methodDecl.getType()), null, null);
        mv.visitCode();

        localVars.push("this");
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
        localVars.startBlock();
        block.getStatements().forEach(statement -> statement.accept(this));
        localVars.endBlock();
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
            lExpression.accept(this);
            String lClass = lastClassName;
            rExpression.accept(this);
            mv.visitFieldInsn(Opcodes.PUTFIELD, lClass, ((InstVar) lExpression).getIdentifier(), GenUtils.generateDescriptor(((InstVar) lExpression).getType()));
        } else if (lExpression instanceof LocalOrFieldVar) {
            int index = localVars.get(((LocalOrFieldVar) lExpression).getIdentifier());
            if (index >= 0) { // local var
                rExpression.accept(this);
                mv.visitVarInsn(Opcodes.ISTORE, index);
            } else { // field var
                lExpression.accept(this);
                String lClass = lastClassName;
                rExpression.accept(this);
                mv.visitFieldInsn(Opcodes.PUTFIELD, lClass, ((LocalOrFieldVar) lExpression).getIdentifier(), GenUtils.generateDescriptor(((LocalOrFieldVar) lExpression).getType()));
            }
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
        instVar.getExpression().accept(this);
    }

    @Override
    public void visit(IntegerExpr integerExpr) {
        mv.visitIntInsn(Opcodes.BIPUSH, integerExpr.getValue());
    }

    @Override
    public void visit(LocalOrFieldVar localOrFieldVar) {
        int index = localVars.get(localOrFieldVar.getIdentifier());
        if (index >= 0) { // local var
            if (localOrFieldVar.getType() instanceof BaseType) {
                mv.visitVarInsn(Opcodes.ILOAD, index);
            } else {
                mv.visitVarInsn(Opcodes.ALOAD, index);
            }
        } else { // field var
            mv.visitFieldInsn(Opcodes.GETFIELD, className, localOrFieldVar.getIdentifier(), GenUtils.generateDescriptor(localOrFieldVar.getType()));
        }
    }

    @Override
    public void visit(Null nullExpr) {

    }

    @Override
    public void visit(This thisExpr) {
        lastClassName = className;
        mv.visitVarInsn(Opcodes.ALOAD, 0);
    }

    @Override
    public void visit(Unary unary) {

    }
}
