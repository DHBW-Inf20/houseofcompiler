package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.IStatementExpression;
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
        else if (stmtExprContext.newDecl() != null)
            return new NewDecl();
        else //methodCall
            return  null;
    }
}
