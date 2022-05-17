package context;

import codegen.utils.GenUtils;
import common.AccessModifier;
import common.PrintableVector;
import common.Type;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;

import java.util.stream.Collectors;

public class MethodContext {

    private AccessModifier accessModifier;
    private Type type;
    private PrintableVector<Type> parameterTypes;

    public MethodContext(MethodDecl method) {
        this.accessModifier = method.getAccessModifier();
        this.type = method.getType();
        this.parameterTypes = method.getParameters().stream().map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Type getType() {
        return type;
    }

    public PrintableVector<Type> getParameterTypes() {
        return parameterTypes;
    }

    public String getDescriptor() {
        return GenUtils.generateDescriptor(parameterTypes, type);
    }

    @Override
    public String toString() {
        return accessModifier + " " + getDescriptor();
    }
}
