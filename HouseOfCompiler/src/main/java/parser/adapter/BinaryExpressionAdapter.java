package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.IExpression;

import java.util.Locale;

public class BinaryExpressionAdapter {
    public static Binary adapt(JavaSubsetParser.BinaryExprContext binaryExprContext){
        IExpression leftExpression = SubExpressionAdapter.adapt(
                binaryExprContext.subExpression()
        );
        IExpression rightExpression = ExpressionAdapter.adapt(
                binaryExprContext.expression()
        );
        Operator operator = Operator.valueOf(
                binaryExprContext.operator().getText().toUpperCase(Locale.ROOT));

        return new Binary(leftExpression,
                rightExpression,
                operator);
    }
}
