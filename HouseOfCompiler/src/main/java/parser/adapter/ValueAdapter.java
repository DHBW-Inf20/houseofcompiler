package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.*;

public class ValueAdapter {

    /**
     * @param valueContext
     * @return IExpression
     */
    public static IExpression adapt(JavaSubsetParser.ValueContext valueContext) {
        if (valueContext.IntValue() != null)
            return new IntegerExpr(Integer.parseInt(valueContext.IntValue().getText()));
        else if (valueContext.CharValue() != null)
            return new CharExpr(valueContext.CharValue().getText().charAt(1));
        else if (valueContext.BooleanValue() != null) {
            if (valueContext.BooleanValue().getText() == "true")
                return new BoolExpr(true);
            else
                return new BoolExpr(false);
        }
        else
            return new Null();
    }
}
