package semantic;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import context.Context;

public class TypeHelper {
    public static  final Type voidType = null;

    public static boolean typeExists(Type type, Context con){

        if(type instanceof BaseType){
            return true;
        }
        var objectClass = (ReferenceType)type;
        var declaredClassnames = con.getClasses();
        return declaredClassnames.containsKey(objectClass.getIdentifier());
    }

    public static boolean isBool(Type type) {
        var boolType = Primitives.BOOL;
        return type.equals(boolType);
    }

    private Type getUpperBound(Type blockType, Type type) {

        return null;
    }

}
