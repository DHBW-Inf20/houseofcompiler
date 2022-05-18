package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.Assign;

public class AssignAdapter {
    public static Assign adapt(JavaSubsetParser.AssignContext assignContext){
        var rExpression = ExpressionAdapter.adapt(assignContext.expression());
        IExpression lExpression;
        if (assignContext.instVar() != null)
            lExpression = InstVarAdapter.adapt(assignContext.instVar());
        else
            lExpression = new LocalOrFieldVar(assignContext.Identifier().getText());
        return new Assign(lExpression, rExpression);
    }
}
