package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.statements.ForStmt;

public class ForStmtAdapter {

    /**
     * @param whileStmtContext
     * @return WhileStmt
     */
    public static ForStmt adapt(JavaSubsetParser.ForStmtContext forStmtContext) {

        var line = forStmtContext.start.getLine();
        var column = forStmtContext.start.getCharPositionInLine();

        final boolean isStatementExpressionInit = forStmtContext.localVarDecl() == null;
        var init = isStatementExpressionInit ? StatementExpressionAdapter.adapt(forStmtContext.stmtExpr(0))
                : LocalVarDeclAdapter.adapt(forStmtContext.localVarDecl());

        var condition = ExpressionAdapter.adapt(forStmtContext.expression());
        var update = StatementExpressionAdapter.adapt(forStmtContext.stmtExpr(isStatementExpressionInit ? 1 : 0));
        var body = StatementAdapter.adapt(forStmtContext.statement());

        return new ForStmt(init, condition, update, body, line, column);

    }
}
