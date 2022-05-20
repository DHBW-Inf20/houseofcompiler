package context;

import java.util.stream.Collectors;

import codegen.utils.GenUtils;
import common.AccessModifier;
import common.PrintableVector;
import common.Type;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodParameter;

public class ConstructorContext {

    private AccessModifier accessModifier;
    private Type type;
    private PrintableVector<Type> parameterTypes;

    public ConstructorContext(ConstructorDecl constructor) {
        this.accessModifier = constructor.getAccessModifier();
        this.type = constructor.getType();
        this.parameterTypes = constructor.getParameterDeclarations().stream().map(MethodParameter::getType)
                .collect(Collectors.toCollection(PrintableVector::new));
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
     * @return PrintableVector<Type>
     */
    public PrintableVector<Type> getParameterTypes() {
        return parameterTypes;
    }

    /**
     * @return String
     */
    public String getDescriptor() {
        return GenUtils.generateDescriptor(parameterTypes, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return accessModifier + " " + getDescriptor();
    }
}
