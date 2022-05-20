package parser.adapter;

import common.AccessModifier;
import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.statements.Block;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodParameter;

import java.util.Locale;

public class ConstructorAdapter {
    public static ConstructorDecl adapt(JavaSubsetParser.ConstuctorDeclContext constuctorDeclContext){
        PrintableVector<MethodParameter> parameters = new PrintableVector<MethodParameter>();
        if (constuctorDeclContext.parameterList() != null) {
            constuctorDeclContext.parameterList().parameter().forEach(parameterContext ->
                    parameters.add(ParameterAdapter.adapt(parameterContext))
            );
        }
        Block block = BlockAdapter.adapt(constuctorDeclContext.block());
        return new ConstructorDecl(
                AccessModifier.valueOf(
                        constuctorDeclContext.AccessModifier().getText().toUpperCase(Locale.ROOT)
                ),
                parameters,
                block,
                constuctorDeclContext.start.getLine(),
                constuctorDeclContext.start.getCharPositionInLine()
        );
    }
}
