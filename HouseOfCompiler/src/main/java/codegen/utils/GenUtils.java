package codegen.utils;

import common.AccessModifier;
import common.BaseType;
import common.ReferenceType;
import common.Type;
import org.objectweb.asm.Opcodes;

import common.PrintableVector;
import syntaxtree.expressions.IExpression;

import java.util.stream.Collectors;

public class GenUtils {

    public static int resolveAccessModifier(AccessModifier accessModifier) {
        return switch (accessModifier) {
            case PUBLIC -> Opcodes.ACC_PUBLIC;
            case PRIVATE -> Opcodes.ACC_PRIVATE;
            case PROTECTED -> Opcodes.ACC_PROTECTED;
            case PACKAGE_PRIVATE -> 0;
        };
    }

    public static String generateDescriptor(Type type) {
        return getTypeTerm(type);
    }

    public static String generateDescriptor(PrintableVector<Type> arguments, Type returnType) {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        arguments.forEach(type -> builder.append(getTypeTerm(type)));
        builder.append(')');
        builder.append(getTypeTerm(returnType));
        return builder.toString();
    }

    public static PrintableVector<Type> expressionsToTypes(PrintableVector<IExpression> expressions) {
        return expressions.stream().map(IExpression::getType).collect(Collectors.toCollection(PrintableVector::new));
    }

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
