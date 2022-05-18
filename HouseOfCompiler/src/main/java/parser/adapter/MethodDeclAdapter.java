package parser.adapter;

import common.*;
import parser.generated.JavaSubsetParser;
import syntaxtree.statements.Block;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;

public class MethodDeclAdapter {
    public static MethodDecl adapt(JavaSubsetParser.MethodDeclContext methodDeclContext) {
        var parameters = new PrintableVector<MethodParameter>();
        if (methodDeclContext.parameterList() != null) {
            methodDeclContext.parameterList().parameter().forEach(parameterContext ->
                    parameters.add(ParameterAdapter.adapt(parameterContext))
            );
        }
        var block = BlockAdapter.adapt(methodDeclContext.block());
        Type type = new BaseType(Primitives.VOID);
        if (methodDeclContext.type() != null)
                type = TypeAdapter.adapt(methodDeclContext.type());
        AccessModifier accessModifier = AccessModifier.PACKAGE_PRIVATE;
        if (methodDeclContext.AccessModifier() != null){
            accessModifier = AccessModifier.valueOf(methodDeclContext.AccessModifier().getText());
        }
        var methodDecl = new MethodDecl(
                accessModifier,
                type,
                methodDeclContext.Identifier().getText(),
                parameters,
                block
        );
        return methodDecl;
    }
}
