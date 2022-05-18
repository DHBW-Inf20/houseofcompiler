package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Unary;

public class UnaryAdapter {
    public static Unary adapt(JavaSubsetParser.UnaryExprContext unaryExprContext){
        return new Unary(
                ExpressionAdapter.adapt(unaryExprContext.expression()),
                Operator.NOT
        );
    }
}
