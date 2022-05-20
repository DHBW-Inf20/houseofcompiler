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

    /**
     * @return AccessModifier
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * @return String
     */
    public String getDescriptor() {
        return GenUtils.generateDescriptor(type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return accessModifier + " " + getDescriptor();
    }
}
