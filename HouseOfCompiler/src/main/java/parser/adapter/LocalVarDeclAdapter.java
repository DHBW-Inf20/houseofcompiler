package parser.adapter;

import common.Type;
import parser.generated.JavaSubsetParser;
import syntaxtree.statements.LocalVarDecl;

public class LocalVarDeclAdapter {
    public static LocalVarDecl adapt(JavaSubsetParser.LocalVarDeclContext localVarDeclContext) {
        Type type = TypeAdapter.adapt(localVarDeclContext.type());
        var localVarDecl = new LocalVarDecl(
                localVarDeclContext.Identifier().getText(),
                localVarDeclContext.start.getLine(),
                localVarDeclContext.start.getCharPositionInLine());
        localVarDecl.setType(type);
        return localVarDecl;
    }
}
