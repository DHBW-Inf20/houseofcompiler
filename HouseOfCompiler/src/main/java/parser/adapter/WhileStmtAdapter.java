package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.statements.WhileStmt;

public class WhileStmtAdapter {
    public static WhileStmt adapt(JavaSubsetParser.WhileStmtContext whileStmtContext) {
        return new WhileStmt(
                ExpressionAdapter.adapt(whileStmtContext.expression()),
                BlockAdapter.adapt(whileStmtContext.block()),
                whileStmtContext.start.getLine(),
                whileStmtContext.start.getCharPositionInLine());
    }
}
