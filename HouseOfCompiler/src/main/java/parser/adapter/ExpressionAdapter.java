package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;

public class ExpressionAdapter {
    public static IExpression adapt(JavaSubsetParser.ExpressionContext expressionContext){
        if (expressionContext.binaryExpr() != null){
            return SubExpressionAdapter.adapt(expressionContext.subExpression());
        }
        else {
            return BinaryExpressionAdapter.adapt(expressionContext.binaryExpr());
        }
    }
}
