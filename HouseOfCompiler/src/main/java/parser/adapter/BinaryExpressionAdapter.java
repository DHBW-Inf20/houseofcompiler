package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.IExpression;

public class BinaryExpressionAdapter {

        /**
         * @param binaryExprContext
         * @return Binary
         */
        public static Binary adapt(JavaSubsetParser.BinaryExprContext binaryExprContext) {
                IExpression leftExpression;
                IExpression rightExpression;
                leftExpression = SubExpressionAdapter.adapt(
                                binaryExprContext.subExpression());
                rightExpression = ExpressionAdapter.adapt(
                                binaryExprContext.expression());
                Operator operator = OperatorAdapter.adapt(binaryExprContext.operator());
                return new Binary(leftExpression,
                                rightExpression,
                                operator, binaryExprContext.start.getLine(),
                                binaryExprContext.start.getCharPositionInLine());
        }
}
