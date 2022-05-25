package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.Assign;

public class AssignAdapter {

    /**
     * @param assignContext
     * @return Assign
     */
    public static Assign adapt(JavaSubsetParser.AssignContext assignContext) {
        var rExpression = ExpressionAdapter.adapt(assignContext.expression());
        var lExpression = AssignableExpressionAdapter.adapt(assignContext.assignableExpr());
        return new Assign(lExpression, rExpression, assignContext.start.getLine(),
                assignContext.start.getCharPositionInLine());
    }
}
