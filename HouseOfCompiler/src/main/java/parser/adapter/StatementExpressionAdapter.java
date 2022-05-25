package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.statementexpression.IStatementExpression;

public class StatementExpressionAdapter {

    /**
     * @param stmtExprContext
     * @return IStatementExpression
     */
    public static IStatementExpression adapt(JavaSubsetParser.StmtExprContext stmtExprContext) {
        if (stmtExprContext.assign() != null)
            return AssignAdapter.adapt(stmtExprContext.assign());
        else if (stmtExprContext.newDecl() != null)
            return NewDeclAdapter.adapt(stmtExprContext.newDecl());
        else if (stmtExprContext.crementExpr() != null)
            return CrementExprAdapter
        else // methodCall
            return MethodCallAdapter.adapt(stmtExprContext.methodCall());
    }
}
