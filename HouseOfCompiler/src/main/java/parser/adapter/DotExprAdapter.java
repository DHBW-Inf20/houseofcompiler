package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.MethodCall;

public class DotExprAdapter {
    public static IExpression adapt(JavaSubsetParser.DotExprContext dotExprContext){
        if(dotExprContext.dotExpr() != null &&
        dotExprContext.DotOperator() != null &&
        dotExprContext.dotSubExpr() != null){
            IExpression leftExpression = adapt(dotExprContext.dotExpr());
            Operator operator = adaptCalcOperator(dotExprContext);
            IExpression rightExpression = adaptDotSubExpression(dotExprContext.dotSubExpr());
            return new Binary(leftExpression, operator, rightExpression);
        }
        else
            return adaptDotSubExpression(dotExprContext.dotSubExpr());
    }

    private static IExpression adaptDotSubExpression(JavaSubsetParser.DotSubExprContext dotSubExprContext){
        if(dotSubExprContext.IntValue() != null)
            return new IntegerExpr(Integer.parseInt(dotSubExprContext.IntValue().getText()));
        else if (dotSubExprContext.Identifier() != null)
            return new LocalOrFieldVar(dotSubExprContext.Identifier().getText());
        else if (dotSubExprContext.instVar() != null)
            return InstVarAdapter.adapt(dotSubExprContext.instVar());
        else if (dotSubExprContext.methodCall() != null)
            return MethodCallAdapter.adapt(dotSubExprContext.methodCall());
        else
            return CalcExprAdapter.adapt(dotSubExprContext.calcExpr());
    }

    private static Operator adaptCalcOperator(JavaSubsetParser.DotExprContext dotExprContext){
        if(dotExprContext.DotOperator().getText().equals("*"))
            return Operator.MULT;
        else if (dotExprContext.DotOperator().getText().equals("/"))
            return Operator.DIV;
        else
            return Operator.MOD;
    }
}
