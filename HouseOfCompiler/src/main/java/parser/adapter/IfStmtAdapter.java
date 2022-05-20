package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.statements.IfStmt;

public class IfStmtAdapter {

    /**
     * @param ifElseStmtContext
     * @return IfStmt
     */
    public static IfStmt adapt(JavaSubsetParser.IfElseStmtContext ifElseStmtContext) {
        if (ifElseStmtContext.elseStmt() != null) {
            return new IfStmt(
                    ExpressionAdapter.adapt(ifElseStmtContext.ifStmt().expression()),
                    StatementAdapter.adapt(ifElseStmtContext.ifStmt().statement()),
                    StatementAdapter.adapt(ifElseStmtContext.elseStmt().statement()),
                    ifElseStmtContext.start.getLine(),
                    ifElseStmtContext.start.getCharPositionInLine());
        } else {
            return new IfStmt(
                    ExpressionAdapter.adapt(ifElseStmtContext.ifStmt().expression()),
                    StatementAdapter.adapt(ifElseStmtContext.ifStmt().statement()),
                    ifElseStmtContext.start.getLine(),
                    ifElseStmtContext.start.getCharPositionInLine());
        }
    }
}
