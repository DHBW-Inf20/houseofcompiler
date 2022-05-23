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
                if(binaryExprContext.calcExpr() != null){
                        return (Binary) CalcExprAdapter.adapt(binaryExprContext.calcExpr());
                }
                else{
                        leftExpression = SubExpressionAdapter.adapt(
                                        binaryExprContext.nonCalcExpr().subExpression());
                        rightExpression = ExpressionAdapter.adapt(
                                        binaryExprContext.nonCalcExpr().expression());
                        Operator operator = NonCalcOperatorAdapter.adapt(binaryExprContext.nonCalcExpr().nonCalcOperator());
                        return new Binary(leftExpression,
                                        rightExpression,
                                        operator, binaryExprContext.start.getLine(),
                                        binaryExprContext.start.getCharPositionInLine());
                }
        }
}
