package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.structure.MethodParameter;

public class ParameterAdapter {
    public static MethodParameter adapt(JavaSubsetParser.ParameterContext parameterContext){
        return new MethodParameter(
                TypeAdapter.adapt(parameterContext.type()),
                parameterContext.Identifier().getText()
        );
    }
}
