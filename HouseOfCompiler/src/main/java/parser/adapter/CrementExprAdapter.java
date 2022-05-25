package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.Unary;

public class CrementExprAdapter {
    public static Unary adapt(JavaSubsetParser.CrementExprContext crementExprContext){
        if(crementExprContext.incExpr() != null)
            return new Unary()
    }
}
