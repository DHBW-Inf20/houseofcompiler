package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.BoolExpr;
import syntaxtree.expressions.CharExpr;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.Null;
import syntaxtree.expressions.StringExpr;

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
            if (valueContext.BooleanValue().getText().equals("true"))
                return new BoolExpr(true);
            else
                return new BoolExpr(false);
        } else if (valueContext.StringValue() != null) {
            return new StringExpr(valueContext.StringValue().getText().substring(1,
                    valueContext.StringValue().getText().length() - 1));
        } else
            return new Null();
    }
}
