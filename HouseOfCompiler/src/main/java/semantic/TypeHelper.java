package semantic;

import java.util.ArrayList;
import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import common.Type;
import context.ConstructorContext;
import context.Context;
import context.FieldContext;
import context.MethodContext;
import semantic.exceptions.TypeMismatchException;
import syntaxtree.expressions.Null;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;

public class TypeHelper {
    public static final Type voidType = null;

    /**
     * @param type
     * @param con
     * @return boolean
     */
    public static boolean typeExists(Type type, Context con) {

        if (type instanceof BaseType) {
            return true;
        }
        var objectClass = (ReferenceType) type;
        var declaredClassnames = con.getClasses();
        return declaredClassnames.containsKey(objectClass.getIdentifier());
    }

    /**
     * @param type
     * @return boolean
     */
    public static boolean isBool(Type type) {
        var boolType = new BaseType(Primitives.BOOL);

        return Objects.equals(boolType, type);
    }

    /**
     * @param blockType
     * @param type
     * @return Type
     */
    private Type getUpperBound(Type blockType, Type type) {

        return null;
    }

    /**
     * @param identifier
     * @param type
     * @param context
     * @return FieldContext
     */
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

    /**
     * @param identifier
     * @param type
     * @param context
     * @return ArrayList<MethodContext>
     */
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

    /**
     * @param methodCall
     * @param type
     * @param context
     * @return MethodContext
     */
    public static MethodContext getMethodInType(MethodCall methodCall, Type type, Context context) {
        if (type instanceof ReferenceType) {
            var objectClass = (ReferenceType) type;
            var declaredClassnames = context.getClasses();
            var classContext = declaredClassnames.get(objectClass.getIdentifier());
            if (classContext == null) {
                classContext = context.getClasses().get(context.getImports().get(objectClass.getIdentifier()));
            }
            if (classContext == null) {
                throw new TypeMismatchException("No declared Method " + methodCall.getIdentifier() + " with Arguments: "
                        + methodCall.printTypes() + " in Type " + type);
            }
            var foundMethods = new PrintableVector<MethodContext>();
            var methods = classContext.getMethods().get(methodCall.getIdentifier());
            for (var method : methods) {
                if (method.getParameterTypes().size() == methodCall.getArguments().size()) {
                    boolean isSame = true;
                    for (int i = 0; i < method.getParameterTypes().size(); i++) {
                        var parameterType = method.getParameterTypes().get(i);
                        var argument = methodCall.getArguments().get(i);
                        if (!((argument instanceof Null && parameterType instanceof ReferenceType)
                                || (!(argument instanceof Null) && parameterType.equals(argument.getType())))) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) {
                        foundMethods.add(method);
                    }
                }
            }
            if (foundMethods.size() == 0) {
                throw new TypeMismatchException("No declared Method " + methodCall.getIdentifier() + " with Arguments: "
                        + methodCall.printTypes() + " in Type " + type);
            } else if (foundMethods.size() == 1) {
                for (int i = 0; i < foundMethods.get(0).getParameterTypes().size(); i++) {
                    var parameterType = foundMethods.get(0).getParameterTypes().get(i);
                    var argument = methodCall.getArguments().get(i);
                    if (argument instanceof Null) {
                        ((Null) argument).setType(parameterType);
                    }
                }
                return foundMethods.get(0);
            } else {
                throw new TypeMismatchException("Cannot resolve Method-Call with Arguments: " + methodCall.printTypes()
                        + " in Type " + type + ". Multiple Methods found: \n" + foundMethods);
            }
        } else {
            throw new TypeMismatchException("Base Type " + type + " does not have Methods");
        }
    }

    /**
     * @param newDecl
     * @param context
     * @return ConstructorContext
     */
    public static ConstructorContext getConstructor(NewDecl newDecl, Context context) {
        var objectClass = (ReferenceType) newDecl.getType();
        var declaredClassnames = context.getClasses();
        var classContext = declaredClassnames.get(objectClass.getIdentifier());
        var constructors = classContext.getConstructors();
        for (var constructor : constructors) {
            if (constructor.getParameterTypes().size() == newDecl.getArguments().size()) {
                boolean isSame = true;
                for (int i = 0; i < constructor.getParameterTypes().size(); i++) {
                    var parameterType = constructor.getParameterTypes().get(i);
                    var argument = newDecl.getArguments().get(i);
                    if (!parameterType.equals(argument.getType())) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    return constructor;
                }
            }
        }
        throw new TypeMismatchException("No declared Constructor with Arguments: " + newDecl.printTypes() + " in Type "
                + newDecl.getType());
    }

    /**
     * @param row
     * @param column
     * @param fileName
     * @return String
     */
    public static String generateLocationString(int row, int column, String fileName) {
        return " (" + fileName + ":" + row + ":" + (column + 1) + ")";
    }

}
