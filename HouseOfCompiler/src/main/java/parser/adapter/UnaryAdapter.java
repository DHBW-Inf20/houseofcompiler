package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Unary;

public class UnaryAdapter {

    /**
     * @param notExprContext
     * @return Unary
     */
    public static Unary adapt(JavaSubsetParser.NotExprContext notExprContext) {
        notExprContext.start.getLine();
        notExprContext.start.getCharPositionInLine();
        return new Unary(
                ExpressionAdapter.adapt(notExprContext.expression()),
                Operator.NOT,
                notExprContext.start.getLine(),
                notExprContext.start.getCharPositionInLine());
    }
}
