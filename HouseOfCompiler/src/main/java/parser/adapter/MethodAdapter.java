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
        if (methodDeclContext.parameterList() != null){
                methodDeclContext.parameterList().parameter().forEach(parameterContext ->
                        parameters.add(ParameterAdapter.adapt(parameterContext))
                );
        }

        Block block = BlockAdapter.adapt(methodDeclContext.block());
        //TODO wenn typen festgelegt werden sollen muss hier noch folgendermaßen abgefragt und andernfalls void festgelegt werden.
        //if (methodDeclContext.type() != null)
        return new MethodDecl(
                methodDeclContext.Identifier().getText(),
                parameters,
                block,
                AccessModifier.valueOf(methodDeclContext.AccessModifier().getText())
        );

    }
}
