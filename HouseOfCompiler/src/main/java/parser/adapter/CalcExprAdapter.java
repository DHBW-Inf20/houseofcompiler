package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.IExpression;

public class CalcExprAdapter {
    public static IExpression adapt(JavaSubsetParser.CalcExprContext calcExprContext){
        IExpression leftExpression;
        Operator operator;
        IExpression rightExpression;
        if(calcExprContext.calcExpr() != null &&
                calcExprContext.LineOperator() != null &&
                calcExprContext.dotExpr() != null){
            leftExpression = CalcExprAdapter.adapt(calcExprContext.calcExpr());
            operator = adaptCalcOperator(calcExprContext);
            rightExpression = DotExprAdapter.adapt(calcExprContext.dotExpr());
            return new Binary(leftExpression, operator, rightExpression);
        }
        else {
            return DotExprAdapter.adapt(calcExprContext.dotExpr());
        }
    }

    private static Operator adaptCalcOperator(JavaSubsetParser.CalcExprContext calcExprContext){
        if (calcExprContext.LineOperator().getText().equals("+"))
            return Operator.PLUS;
        else
            return Operator.MINUS;

    }
}
