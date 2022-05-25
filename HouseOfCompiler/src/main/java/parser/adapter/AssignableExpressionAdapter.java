package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;

public class AssignableExpressionAdapter {
    public static IExpression adapt(JavaSubsetParser.AssignableExprContext assignableExprContext){
        if (assignableExprContext.instVar() != null)
            return InstVarAdapter.adapt(assignableExprContext.instVar());
        else //identifier
            return new LocalOrFieldVar(assignableExprContext.Identifier().getText());
    }
}
