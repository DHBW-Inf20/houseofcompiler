package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.statements.IStatement;
import syntaxtree.statements.ReturnStmt;

public class StatementAdapter {

    /**
     * @param statementContext
     * @return IStatement
     */
    public static IStatement adapt(JavaSubsetParser.StatementContext statementContext) {
        var line = statementContext.start.getLine();
        var column = statementContext.start.getCharPositionInLine();
        if (statementContext.returnStmt() != null)
            return new ReturnStmt(ExpressionAdapter.adapt(statementContext.returnStmt().expression()), line, column);
        else if (statementContext.localVarDecl() != null)
            return LocalVarDeclAdapter.adapt(statementContext.localVarDecl());
        else if (statementContext.block() != null)
            return BlockAdapter.adapt(statementContext.block());
        else if (statementContext.whileStmt() != null)
            return WhileStmtAdapter.adapt(statementContext.whileStmt());
        else if (statementContext.ifElseStmt() != null)
            return IfStmtAdapter.adapt(statementContext.ifElseStmt());
        else // StatementExpression
            return StatementExpressionAdapter.adapt(statementContext.stmtExpr());
    }
}
