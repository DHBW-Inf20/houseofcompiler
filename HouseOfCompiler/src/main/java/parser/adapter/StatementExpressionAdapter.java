package parser.adapter;

import common.PrintableVector;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.IStatementExpression;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;

public class StatementExpressionAdapter {
    public static IStatementExpression adapt(JavaSubsetParser.StmtExprContext stmtExprContext){
        if (stmtExprContext.assign() != null)
            return AssignAdapter.adapt(stmtExprContext.assign());
        else if (stmtExprContext.newDecl() != null)
            return NewDeclAdapter.adapt(stmtExprContext.newDecl());
        else //methodCall
            return MethodCallAdapter.adapt(stmtExprContext.methodCall());
    }
}
