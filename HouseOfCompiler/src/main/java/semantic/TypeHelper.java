package semantic;

import java.util.ArrayList;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import context.Context;
import context.FieldContext;
import context.MethodContext;
import semantic.exceptions.TypeMismatchException;
import syntaxtree.statementexpression.MethodCall;

public class TypeHelper {
    public static final Type voidType = null;

    public static boolean typeExists(Type type, Context con) {

        if (type instanceof BaseType) {
            return true;
        }
        var objectClass = (ReferenceType) type;
        var declaredClassnames = con.getClasses();
        return declaredClassnames.containsKey(objectClass.getIdentifier());
    }

    public static boolean isBool(Type type) {
        var boolType = new BaseType(Primitives.BOOL);
        return type.equals(boolType);
    }

    private Type getUpperBound(Type blockType, Type type) {

        return null;
    }

    public static FieldContext getFieldInType(String identifier, Type type, Context context) {
        if (type instanceof ReferenceType) {
            var objectClass = (ReferenceType) type;
            var declaredClassnames = context.getClasses();
            var classContext = declaredClassnames.get(objectClass.getIdentifier());
            return classContext.getFields().get(identifier);
        } else {
            throw new TypeMismatchException("Field " + identifier + " is missing in Type " + type);

        }

    }

    public static ArrayList<MethodContext> getMethodsInType(String identifier, Type type, Context context) {
        if (type instanceof ReferenceType) {
            var objectClass = (ReferenceType) type;
            var declaredClassnames = context.getClasses();
            var classContext = declaredClassnames.get(objectClass.getIdentifier());
            return classContext.getMethods().get(identifier);
        } else {
            throw new TypeMismatchException("Method " + identifier + " is missing in Type " + type);

        }
    }

    public static MethodContext getMethodInType(MethodCall methodCall, Type type, Context context) {
        if (type instanceof ReferenceType) {
            var objectClass = (ReferenceType) type;
            var declaredClassnames = context.getClasses();
            var classContext = declaredClassnames.get(objectClass.getIdentifier());
            var methods = classContext.getMethods().get(methodCall.getIdentifier());
            for (var method : methods) {
                if (method.getParameterTypes().size() == methodCall.getArguments().size()) {
                    boolean isSame = true;
                    for (int i = 0; i < method.getParameterTypes().size(); i++) {
                        var parameterType = method.getParameterTypes().get(i);
                        var argument = methodCall.getArguments().get(i);
                        if (!parameterType.equals(argument.getType())) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) {
                        return method;
                    }
                }
            }
            throw new TypeMismatchException("No declared Method " + methodCall.getIdentifier() + " with Arguments: "
                    + methodCall.printTypes() + " in Type " + type);
        } else {
            throw new TypeMismatchException("Base Type " + type + " does not have Methods");
        }
    }

}
