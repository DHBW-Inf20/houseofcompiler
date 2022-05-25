package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.statementexpression.CrementStmtExpr;
import syntaxtree.statementexpression.IStatementExpression;

public class CrementExprAdapter {
    public static IStatementExpression adapt(JavaSubsetParser.CrementExprContext crementExprContext) {
        int line = crementExprContext.getStart().getLine();
        int column = crementExprContext.getStart().getCharPositionInLine();
        if (crementExprContext.incExpr() != null)
            if (crementExprContext.incExpr().preIncExpr() != null)
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(crementExprContext.incExpr().preIncExpr().assignableExpr()),
                        Operator.INCPRE,
                        line,
                        column);
            else
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(crementExprContext.incExpr().sufIncExpr().assignableExpr()),
                        Operator.INCSUF,
                        line,
                        column);
        else if (crementExprContext.decExpr().preDecExpr() != null)
            return new CrementStmtExpr(
                    AssignableExpressionAdapter.adapt(crementExprContext.decExpr().preDecExpr().assignableExpr()),
                    Operator.DECPRE,
                    line,
                    column);
        else
            return new CrementStmtExpr(
                    AssignableExpressionAdapter.adapt(crementExprContext.decExpr().sufDecExpr().assignableExpr()),
                    Operator.DECSUF,
                    line,
                    column);
    }
}
