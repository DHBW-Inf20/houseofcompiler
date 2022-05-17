package context;

import codegen.utils.GenUtils;
import common.AccessModifier;
import common.Type;
import syntaxtree.structure.FieldDecl;

public class FieldContext {

    private AccessModifier accessModifier;
    private Type type;

    public FieldContext(FieldDecl field) {
        accessModifier = field.getAccessModifier();
        type = field.getType();
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Type getType() {
        return type;
    }

    public String getDescriptor() {
        return GenUtils.generateDescriptor(type);
    }

    @Override
    public String toString() {
        return accessModifier + " " + getDescriptor();
    }
}
