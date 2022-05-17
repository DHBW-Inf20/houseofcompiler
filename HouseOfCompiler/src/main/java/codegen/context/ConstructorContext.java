package codegen.context;

import codegen.utils.GenUtils;
import common.AccessModifier;
import common.PrintableVector;
import common.Type;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;

import java.util.stream.Collectors;

public class ConstructorContext {

    private AccessModifier accessModifier;
    private Type type;
    private PrintableVector<Type> parameterTypes;

    public ConstructorContext(ConstructorDecl constructor) {
        this.accessModifier = constructor.getAccessModifier();
        this.type = constructor.getType();
        this.parameterTypes = constructor.getParameterDeclarations().stream().map(MethodParameter::getType).collect(Collectors.toCollection(PrintableVector::new));
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
