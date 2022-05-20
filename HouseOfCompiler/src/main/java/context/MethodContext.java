package context;

import java.util.stream.Collectors;

import codegen.utils.GenUtils;
import common.AccessModifier;
import common.PrintableVector;
import common.Type;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;

public class MethodContext {

    private AccessModifier accessModifier;
    private Type type;
    private PrintableVector<Type> parameterTypes;

    public MethodContext(MethodDecl method) {
        this.accessModifier = method.getAccessModifier();
        this.type = method.getType();
        this.parameterTypes = method.getParameters().stream().map(MethodParameter::getType)
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
