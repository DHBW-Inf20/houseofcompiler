package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.structure.MethodParameter;

public class ParameterAdapter {

    /**
     * @param parameterContext
     * @return MethodParameter
     */
    public static MethodParameter adapt(JavaSubsetParser.ParameterContext parameterContext) {
        var parameter = new MethodParameter(
                TypeAdapter.adapt(parameterContext.type()),
                parameterContext.Identifier().getText(),
                parameterContext.start.getLine(),
                parameterContext.start.getCharPositionInLine());
        return parameter;
    }
}
