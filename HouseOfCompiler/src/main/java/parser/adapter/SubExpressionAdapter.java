package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.LocalOrFieldVar;

public class SubExpressionAdapter {
    public static IExpression adapt(JavaSubsetParser.SubExpressionContext subExpressionContext){
        if(subExpressionContext.Identifier() != null){
                return new LocalOrFieldVar(subExpressionContext.Identifier().getText());
        }
        else if (subExpressionContext.instVar() != null){
                return new InstVarAdapter
        }
        else if (subExpressionContext.value() != null){
                return null;
        }
        else if (subExpressionContext.stmtExpr() != null){
                return null;
        }
        else if (subExpressionContext.expression() != null){
                return null;
        }
    }
}
