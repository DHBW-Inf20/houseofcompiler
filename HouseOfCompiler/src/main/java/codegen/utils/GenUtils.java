package codegen.utils;

import java.util.stream.Collectors;

import common.*;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import syntaxtree.expressions.IExpression;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.IStatementExpression;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.IStatement;

public class GenUtils {

    public static void clearReturn(IStatementExpression statementExpr, MethodVisitor mv) {
        if (!(statementExpr.getType() instanceof BaseType)
                || ((BaseType) statementExpr.getType()).getIdentifier() != Primitives.VOID) {
            mv.visitInsn(Opcodes.POP);
        }
    }

    public static void clearReturn(IStatement statement, MethodVisitor mv) {
        if (statement instanceof MethodCall || statement instanceof NewDecl || statement instanceof Assign) {
            clearReturn((IStatementExpression) statement, mv);
        }
    }

    public static void clearReturn(IExpression expression, MethodVisitor mv) {
        if (expression instanceof MethodCall || expression instanceof NewDecl || expression instanceof Assign) {
            clearReturn((IStatementExpression) expression, mv);
        }
    }

    /**
     * @param accessModifier
     * @return int
     */
    public static int resolveAccessModifier(AccessModifier accessModifier) {
        return switch (accessModifier) {
            case PUBLIC -> Opcodes.ACC_PUBLIC;
            case PRIVATE -> Opcodes.ACC_PRIVATE;
            case PROTECTED -> Opcodes.ACC_PROTECTED;
            case PRIVATE_STATIC -> Opcodes.ACC_PRIVATE | Opcodes.ACC_STATIC;
            case PUBLIC_STATIC -> Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC;
            case PACKAGE_PRIVATE -> 0;
        };
    }

    /**
     * @param type
     * @return String
     */
    public static String generateDescriptor(Type type) {
        return getTypeTerm(type);
    }

    /**
     * @param arguments
     * @param returnType
     * @return String
     */
    public static String generateDescriptor(PrintableVector<Type> arguments, Type returnType) {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        arguments.forEach(type -> builder.append(getTypeTerm(type)));
        builder.append(')');
        builder.append(getTypeTerm(returnType));
        return builder.toString();
    }

    /**
     * @param expressions
     * @return PrintableVector<Type>
     */
    public static PrintableVector<Type> expressionsToTypes(PrintableVector<IExpression> expressions) {
        return expressions.stream().map(IExpression::getType).collect(Collectors.toCollection(PrintableVector::new));
    }

    /**
     * @param type
     * @return String
     */
    private static String getTypeTerm(Type type) {
        if (type instanceof BaseType) {
            return switch (((BaseType) type).getIdentifier()) {
                case VOID -> "V";
                case INT -> "I";
                case CHAR -> "C";
                case BOOL -> "Z";
            };
        }
        if (type instanceof ReferenceType) {
            return String.format("L%s;", ((ReferenceType) type).getIdentifier());
        }
        return "";
    }
}
