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
        if (stmtExprContext.assign() != null) {
            var rExpression = ExpressionAdapter.adapt(stmtExprContext.assign().expression());
            IExpression lExpression;
            if (stmtExprContext.assign().instVar() != null)
                lExpression = InstVarAdapter.adapt(stmtExprContext.assign().instVar());
            else
                lExpression = new LocalOrFieldVar(stmtExprContext.assign().Identifier().getText());
            return new Assign(lExpression, rExpression);
        }
        else if (stmtExprContext.newDecl() != null) {
            return NewDeclAdapter.adapt(stmtExprContext.newDecl());
        }
        else { //methodCall
            return MethodCallAdapter.adapt(stmtExprContext.methodCall());
        }
    }
}
