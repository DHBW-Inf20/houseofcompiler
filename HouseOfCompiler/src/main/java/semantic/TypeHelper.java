package semantic;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;

public class TypeHelper {
    public static  final Type voidType = null;

    public static boolean typeExists(Type type){

        if(type instanceof BaseType){
            return true;
        }
        var objectClass = (ReferenceType)type;
        //var declaredClassname =
    }
}
