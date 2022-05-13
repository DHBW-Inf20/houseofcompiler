package syntaxtree.expressions;

import parser.generated.JavaSubsetParser;

public class ValueAdapter {
    public static IExpression adapt(JavaSubsetParser.ValueContext valueContext){
        if(valueContext.IntValue() != null)
            return new IntegerExpr(Integer.parseInt(valueContext.IntValue().getText()));
        else if (valueContext.CharValue() != null)
            return new CharExpr(valueContext.CharValue().getText().charAt(0));
        else if (valueContext.BooleanValue().getText() == "true"){
            return new BoolExpr(true);
        }
        else {
            return new BoolExpr(false);
        }
    }
}
