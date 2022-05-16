package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.statements.*;

public class StatementAdapter {
    public static IStatement adapt(JavaSubsetParser.StatementContext statementContext){
        if(statementContext.returnStmt() != null)
            return new ReturnStmt(ExpressionAdapter.adapt(statementContext.returnStmt().expression()));
        else if (statementContext.localVarDecl() != null)
            return new LocalVarDecl(statementContext.localVarDecl().Identifier().getText());
        else if (statementContext.block() != null)
            return BlockAdapter.adapt(statementContext.block());
        else if (statementContext.whileStmt() != null)
            return new WhileStmt(
                    ExpressionAdapter.adapt(statementContext.whileStmt().expression()),
                    BlockAdapter.adapt(statementContext.whileStmt().block())
            );
        else if (statementContext.ifElseStmt() != null)
            return null; //FIXME implement if else statement
        else //StatementExpression
            return StatementExpressionAdapter.adapt(statementContext.stmtExpr());
    }
}
