package parser.adapter;

import common.AccessModifier;
import common.PrintableVector;
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
        var type = TypeAdapter.adapt(methodDeclContext.type());
        var methodDecl = new MethodDecl(
                AccessModifier.valueOf(methodDeclContext.AccessModifier().getText()),
                type,
                methodDeclContext.Identifier().getText(),
                parameters,
                block
        );
        return methodDecl;
    }
}
