package codegen.context;

import common.AccessModifier;
import common.Type;
import syntaxtree.structure.MethodDecl;

public class MethodContext {

    private AccessModifier accessModifier;
    private Type type;

    public MethodContext(MethodDecl method) {
        accessModifier = method.getAccessModifier();
        type = method.getType();
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return accessModifier + " " + type;
    }
}
