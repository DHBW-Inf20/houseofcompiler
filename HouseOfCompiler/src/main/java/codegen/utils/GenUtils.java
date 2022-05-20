package codegen.utils;

import java.util.stream.Collectors;

import org.objectweb.asm.Opcodes;

import common.AccessModifier;
import common.BaseType;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import syntaxtree.expressions.IExpression;

public class GenUtils {

    /**
     * @param accessModifier
     * @return int
     */
    public static int resolveAccessModifier(AccessModifier accessModifier) {
        return switch (accessModifier) {
            case PUBLIC -> Opcodes.ACC_PUBLIC;
            case PRIVATE -> Opcodes.ACC_PRIVATE;
            case PROTECTED -> Opcodes.ACC_PROTECTED;
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
