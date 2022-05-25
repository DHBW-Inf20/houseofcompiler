package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.statementexpression.CrementStmtExpr;
import syntaxtree.statementexpression.IStatementExpression;

public class CrementExprAdapter {
    public static IStatementExpression adapt(JavaSubsetParser.CrementExprContext crementExprContext){
        if(crementExprContext.incExpr() != null)
            if (crementExprContext.incExpr().preIncExpr() != null)
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(crementExprContext.incExpr().preIncExpr().assignableExpr()),
                        Operator.INCPRE
                );
            else
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(crementExprContext.incExpr().sufIncExpr().assignableExpr()),
                        Operator.INCSUF
                );
        else
            if (crementExprContext.decExpr().preDecExpr() != null)
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(crementExprContext.decExpr().preDecExpr().assignableExpr()),
                        Operator.DECPRE
                );
            else
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(crementExprContext.decExpr().sufDecExpr().assignableExpr()),
                        Operator.DECSUF
                );
    }
}
