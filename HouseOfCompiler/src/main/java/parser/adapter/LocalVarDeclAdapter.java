package parser.adapter;

import common.Type;
import parser.generated.JavaSubsetParser;
import syntaxtree.statements.LocalVarDecl;

public class LocalVarDeclAdapter {
    public static LocalVarDecl adapt(JavaSubsetParser.LocalVarDeclContext localVarDeclContext) {
        Type type = TypeAdapter.adapt(localVarDeclContext.type());
        LocalVarDecl localVarDecl;
        if (localVarDeclContext.expression() != null) {
            localVarDecl = new LocalVarDecl(
                    localVarDeclContext.Identifier().getText(),
                    ExpressionAdapter.adapt(localVarDeclContext.expression()),
                    localVarDeclContext.start.getLine(),
                    localVarDeclContext.start.getCharPositionInLine());
        } else {
            localVarDecl = new LocalVarDecl(
                    localVarDeclContext.Identifier().getText(),
                    localVarDeclContext.start.getLine(),
                    localVarDeclContext.start.getCharPositionInLine());
        }
        localVarDecl.setType(type);
        return localVarDecl;
    }
}
