package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;

public class InstVarAdapter implements IExpression {
    public static InstVar adapter(JavaSubsetParser.InstVarContext instVarContext){
        return new InstVar(
                instVarContext.Identifier(3).getText(),
                ExpressionAdapter.adapt(instVarContext.Identifier(2))
                //testen ob hier 0 oder 2 rein muss
        );
    }
}
