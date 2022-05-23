package codegen;

import java.util.stream.Collectors;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import codegen.utils.GenUtils;
import codegen.utils.LocalVarStack;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import context.Context;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.BoolExpr;
import syntaxtree.expressions.CharExpr;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.Null;
import syntaxtree.expressions.StringExpr;
import syntaxtree.expressions.This;
import syntaxtree.expressions.Unary;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.Block;
import syntaxtree.statements.IfStmt;
import syntaxtree.statements.LocalVarDecl;
import syntaxtree.statements.ReturnStmt;
import syntaxtree.statements.WhileStmt;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MainMethodDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;
import visitor.codevisitor.MethodCodeVisitor;

public class MethodGenerator implements MethodCodeVisitor {

    private final static int TRUE = Opcodes.ICONST_1;
    private final static int FALSE = Opcodes.ICONST_0;

    private final String className;
    private final Context context;

    private final ClassWriter cw;
    private MethodVisitor mv;

    private final LocalVarStack localVars;

    private String lastClass;

    public MethodGenerator(String className, Context context, ClassWriter cw) {
        this.className = className;
        this.cw = cw;
        this.context = context;

        localVars = new LocalVarStack();
    }

    /**
     * @param constructorDecl
     */
    @Override
    public void visit(ConstructorDecl constructorDecl) {
        PrintableVector<Type> parameterTypes = constructorDecl.getParameterDeclarations().stream()
                .map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(constructorDecl.getAccessModifier()), "<init>",
                GenUtils.generateDescriptor(parameterTypes, constructorDecl.getType()), null, null);
        mv.visitCode();

        localVars.push("this");
        constructorDecl.getParameterDeclarations().forEach(parameter -> localVars.push(parameter.getIdentifier()));

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        constructorDecl.getBlock().accept(this);
        mv.visitInsn(Opcodes.RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * @param methodDecl
     */
    @Override
    public void visit(MethodDecl methodDecl) {
        PrintableVector<Type> parameterTypes = methodDecl.getParameters().stream().map(MethodParameter::getType)
                .collect(Collectors.toCollection(PrintableVector::new));

        mv = cw.visitMethod(GenUtils.resolveAccessModifier(methodDecl.getAccessModifier()), methodDecl.getIdentifier(),
                GenUtils.generateDescriptor(parameterTypes, methodDecl.getType()), null, null);
        mv.visitCode();

        localVars.push("this");
        methodDecl.getParameters().forEach(parameter -> localVars.push(parameter.getIdentifier()));

        methodDecl.getBlock().accept(this);
        if (methodDecl.getType() instanceof BaseType) {
            if (((BaseType) methodDecl.getType()).getIdentifier() == Primitives.VOID) {
                mv.visitInsn(Opcodes.RETURN);
            }
        }

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    @Override
    public void visit(MainMethodDecl mainDecl) {
        mv = cw.visitMethod(GenUtils.resolveAccessModifier(mainDecl.getAccessModifier()), mainDecl.getIdentifier(),
                "([Ljava/lang/String;)V", null, null);
        mv.visitCode();

        localVars.push("this");
        localVars.push("+args");

        mainDecl.getBlock().accept(this);
        mv.visitInsn(Opcodes.RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**************
     * Statements *
     **************/

    @Override
    public void visit(Block block) {
        localVars.startBlock();
        block.getStatements().forEach(statement -> {
            statement.accept(this);
            if (statement instanceof MethodCall) {
                if (!(((MethodCall) statement).getType() instanceof BaseType)
                        || ((BaseType) ((MethodCall) statement).getType()).getIdentifier() != Primitives.VOID) {
                    mv.visitInsn(Opcodes.POP);
                }
            }
        });
        localVars.endBlock();
    }

    /**
     * @param ifStmt
     */
    @Override
    public void visit(IfStmt ifStmt) {
        Label falseLabel = new Label();

        ifStmt.getCondition().accept(this);
        mv.visitJumpInsn(Opcodes.IFEQ, falseLabel); // == false

        Label end = new Label();

        ifStmt.getBlockIf().accept(this);
        mv.visitJumpInsn(Opcodes.GOTO, end);

        mv.visitLabel(falseLabel);
        if (ifStmt.getBlockElse() != null) {
            ifStmt.getBlockElse().accept(this);
        }

        mv.visitLabel(end);
    }

    /**
     * @param localVarDecl
     */
    @Override
    public void visit(LocalVarDecl localVarDecl) {
        if (localVarDecl.getExpression() != null) {
            localVarDecl.getExpression().accept(this);
            if (localVarDecl.getType() instanceof BaseType) {
                mv.visitVarInsn(Opcodes.ISTORE, localVars.push(localVarDecl.getIdentifier()));
            } else {
                mv.visitVarInsn(Opcodes.ASTORE, localVars.push(localVarDecl.getIdentifier()));
            }
        } else {
            localVars.push(localVarDecl.getIdentifier());
        }
    }

    /**
     * @param returnStmt
     */
    @Override
    public void visit(ReturnStmt returnStmt) {
        IExpression expression = returnStmt.getExpression();
        if (expression == null) {
            mv.visitInsn(Opcodes.RETURN);
        } else {
            expression.accept(this);
            if (expression.getType() instanceof BaseType) {
                mv.visitInsn(Opcodes.IRETURN);
            } else {
                mv.visitInsn(Opcodes.ARETURN);
            }
        }
    }

    /**
     * @param whileStmt
     */
    @Override
    public void visit(WhileStmt whileStmt) {
        Label loop = new Label();
        Label end = new Label();

        mv.visitLabel(loop);

        whileStmt.getExpression().accept(this);
        mv.visitJumpInsn(Opcodes.IFEQ, end);

        whileStmt.getBlock().accept(this);
        mv.visitJumpInsn(Opcodes.GOTO, loop);

        mv.visitLabel(end);
    }

    /************************
     * StatementExpressions *
     ************************/

    @Override
    public void visit(Assign assign) {
        IExpression lExpression = assign.getlExpression();
        IExpression rExpression = assign.getrExpression();

        if (lExpression instanceof InstVar) {
            this.visitInstVar((InstVar) lExpression, false);
            String owner = this.lastClass;
            rExpression.accept(this);
            mv.visitFieldInsn(Opcodes.PUTFIELD, owner, ((InstVar) lExpression).getIdentifier(),
                    GenUtils.generateDescriptor((lExpression).getType()));
        } else if (lExpression instanceof LocalOrFieldVar) {
            int index = localVars.get(((LocalOrFieldVar) lExpression).getIdentifier());
            if (index >= 0) { // local var
                rExpression.accept(this);
                if (rExpression.getType() instanceof BaseType) {
                    mv.visitVarInsn(Opcodes.ISTORE, index);
                } else {
                    mv.visitVarInsn(Opcodes.ASTORE, index);
                }
            } else { // field var
                mv.visitVarInsn(Opcodes.ALOAD, 0);
                rExpression.accept(this);
                mv.visitFieldInsn(Opcodes.PUTFIELD, className, ((LocalOrFieldVar) lExpression).getIdentifier(),
                        GenUtils.generateDescriptor((lExpression).getType()));
            }
        }
    }

    /**
     * @param methodCall
     */
    @Override
    public void visit(MethodCall methodCall) {
        methodCall.getReceiver().accept(this);
        methodCall.getArguments().forEach(parameter -> parameter.accept(this));
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, ((ReferenceType) methodCall.getReceiver().getType()).getIdentifier(),
                methodCall.getIdentifier(), GenUtils
                        .generateDescriptor(GenUtils.expressionsToTypes(methodCall.getArguments()),
                                methodCall.getType()),
                false);

        if (methodCall.getType() instanceof ReferenceType) {
            this.lastClass = ((ReferenceType) methodCall.getType()).getIdentifier();
        }
    }

    /**
     * @param newDecl
     */
    @Override
    public void visit(NewDecl newDecl) {

        this.lastClass = newDecl.getIdentifier();
        mv.visitTypeInsn(Opcodes.NEW, newDecl.getIdentifier());
        mv.visitInsn(Opcodes.DUP);
        newDecl.getArguments().forEach(expression -> expression.accept(this));
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, newDecl.getIdentifier(), "<init>",
                GenUtils.generateDescriptor(GenUtils.expressionsToTypes(newDecl.getArguments()),
                        new BaseType(Primitives.VOID)),
                false);
    }

    /***************
     * Expressions *
     ***************/

    @Override
    public void visit(Unary unary) {
        switch (unary.getOperator()) {
            case NOT -> visitBoolLogic(unary);
        }
    }

    /**
     * @param unary
     */
    private void visitBoolLogic(Unary unary) {
        Label trueLabel = new Label();
        Label falseLabel = new Label();

        switch (unary.getOperator()) {
            case NOT -> {
                unary.getExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IFNE, falseLabel); // == true -> false
            }
        }

        Label end = new Label();

        mv.visitLabel(trueLabel);
        mv.visitInsn(TRUE);
        mv.visitJumpInsn(Opcodes.GOTO, end);

        mv.visitLabel(falseLabel);
        mv.visitInsn(FALSE);

        mv.visitLabel(end);
    }

    /**
     * @param binary
     */
    @Override
    public void visit(Binary binary) {
        switch (binary.getOperator()) {
            case PLUS, MINUS, MULT, DIV, MOD -> visitArithmetic(binary);
            case GREATER, LESS, GREATEREQUAL, LESSEQUAL, EQUAL, NOTEQUAL, AND, OR -> visitBoolLogic(binary);
        }
    }

    /**
     * @param binary
     */
    private void visitArithmetic(Binary binary) {
        binary.getlExpression().accept(this);
        binary.getrExpression().accept(this);

        switch (binary.getOperator()) {
            case PLUS -> mv.visitInsn(Opcodes.IADD);
            case MINUS -> mv.visitInsn(Opcodes.ISUB);
            case MULT -> mv.visitInsn(Opcodes.IMUL);
            case DIV -> mv.visitInsn(Opcodes.IDIV);
            case MOD -> mv.visitInsn(Opcodes.IREM);
        }
    }

    /**
     * @param binary
     */
    private void visitBoolLogic(Binary binary) {

        Label trueLabel = new Label();
        Label falseLabel = new Label();

        switch (binary.getOperator()) {
            case GREATER -> {
                binary.getlExpression().accept(this);
                binary.getrExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IF_ICMPLE, falseLabel);
            }
            case LESS -> {
                binary.getlExpression().accept(this);
                binary.getrExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IF_ICMPGE, falseLabel);
            }
            case GREATEREQUAL -> {
                binary.getlExpression().accept(this);
                binary.getrExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IF_ICMPLT, falseLabel);
            }
            case LESSEQUAL -> {
                binary.getlExpression().accept(this);
                binary.getrExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IF_ICMPGT, falseLabel);
            }
            case AND -> {
                binary.getlExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IFEQ, falseLabel); // lExpression == false -> false
                binary.getrExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IFEQ, falseLabel); // rExpression == false -> false
            }
            case OR -> {
                binary.getlExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IFNE, trueLabel); // lExpression == true -> true
                binary.getrExpression().accept(this);
                mv.visitJumpInsn(Opcodes.IFEQ, falseLabel); // rExpression == false -> false
            }
            case EQUAL -> {
                binary.getlExpression().accept(this);
                binary.getrExpression().accept(this);
                if (binary.getlExpression().getType() instanceof BaseType
                        && binary.getrExpression().getType() instanceof BaseType) {
                    mv.visitJumpInsn(Opcodes.IF_ICMPNE, falseLabel);
                } else {
                    mv.visitJumpInsn(Opcodes.IF_ACMPNE, falseLabel);
                }
            }
            case NOTEQUAL -> {
                binary.getlExpression().accept(this);
                binary.getrExpression().accept(this);
                if (binary.getlExpression().getType() instanceof BaseType
                        && binary.getrExpression().getType() instanceof BaseType) {
                    mv.visitJumpInsn(Opcodes.IF_ICMPEQ, falseLabel);
                } else {
                    mv.visitJumpInsn(Opcodes.IF_ACMPEQ, falseLabel);
                }
            }
        }

        Label end = new Label();

        mv.visitLabel(trueLabel);
        mv.visitInsn(TRUE);
        mv.visitJumpInsn(Opcodes.GOTO, end);

        mv.visitLabel(falseLabel);
        mv.visitInsn(FALSE);

        mv.visitLabel(end);
    }

    /**
     * @param boolExpr
     */
    @Override
    public void visit(BoolExpr boolExpr) {
        if (boolExpr.getValue()) {
            mv.visitInsn(TRUE);
        } else {
            mv.visitInsn(FALSE);
        }
    }

    /**
     * @param charExpr
     */
    @Override
    public void visit(CharExpr charExpr) {
        char value = charExpr.getValue();

        if (value <= Byte.MAX_VALUE) {
            mv.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value <= Short.MAX_VALUE) {
            mv.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            mv.visitLdcInsn(value);
        }
    }

    /**
     * @param integerExpr
     */
    @Override
    public void visit(IntegerExpr integerExpr) {
        int value = integerExpr.getValue();

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            mv.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            mv.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            mv.visitLdcInsn(value);
        }
    }

    @Override
    public void visit(StringExpr stringExpr) {
        mv.visitLdcInsn(stringExpr.getValue());
    }

    /**
     * @param instVar
     */
    @Override
    public void visit(InstVar instVar) {
        this.visitInstVar(instVar, true);
    }

    public void visitInstVar(InstVar instVar, boolean getField) {
        IExpression expression = instVar.getExpression();
        expression.accept(this);
        this.lastClass = ((ReferenceType) expression.getType()).getIdentifier();
        if (getField) {
            if (instVar.isStatic()) {
                mv.visitFieldInsn(Opcodes.GETSTATIC, this.lastClass, instVar.getIdentifier(),
                        GenUtils.generateDescriptor(instVar.getType()));
            } else {
                mv.visitFieldInsn(Opcodes.GETFIELD, this.lastClass, instVar.getIdentifier(),
                        GenUtils.generateDescriptor(instVar.getType()));
            }
        }
    }

    /**
     * @param localOrFieldVar
     */
    @Override
    public void visit(LocalOrFieldVar localOrFieldVar) {
        int index = localVars.get(localOrFieldVar.getIdentifier());
        if (index >= 0) { // local var
            if (localOrFieldVar.getType() instanceof BaseType) {
                mv.visitVarInsn(Opcodes.ILOAD, index);
            } else {
                mv.visitVarInsn(Opcodes.ALOAD, index);
            }
        } else if (context.getClasses().get(className).getFields().containsKey(localOrFieldVar.getIdentifier())) { // field
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitFieldInsn(Opcodes.GETFIELD, className, localOrFieldVar.getIdentifier(),
                    GenUtils.generateDescriptor(localOrFieldVar.getType()));
        }
        if (localOrFieldVar.getType() instanceof ReferenceType) {
            this.lastClass = localOrFieldVar.getIdentifier();
        }
    }

    /**
     * @param nullExpr
     */
    @Override
    public void visit(Null nullExpr) {
        mv.visitInsn(Opcodes.ACONST_NULL);
    }

    /**
     * @param thisExpr
     */
    @Override
    public void visit(This thisExpr) {
        this.lastClass = className;
        mv.visitVarInsn(Opcodes.ALOAD, 0);
    }
}
