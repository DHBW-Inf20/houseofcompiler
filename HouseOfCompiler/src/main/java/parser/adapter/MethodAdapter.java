package parser.adapter;

import common.AccessModifier;
import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.statements.Block;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;

public class MethodAdapter {
    public static MethodDecl adapt(JavaSubsetParser.MethodDeclContext methodDeclContext){
        PrintableVector<MethodParameter> parameters = new PrintableVector<MethodParameter>();
        methodDeclContext.parameterList().parameter().forEach(parameterContext ->
            parameters.add(ParameterAdapter.adapt(parameterContext))
        );
        Block block = BlockAdapter.adapt(methodDeclContext.block());
        return new MethodDecl(
                methodDeclContext.Identifier().get(1).getText(),
                parameters,
                block,
                AccessModifier.valueOf(methodDeclContext.AccessModifier().getText())
        );
    }
}
