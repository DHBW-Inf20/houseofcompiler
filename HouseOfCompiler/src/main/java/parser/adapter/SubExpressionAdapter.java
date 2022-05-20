package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.ValueAdapter;

public class SubExpressionAdapter {

        /**
         * @param subExpressionContext
         * @return IExpression
         */
        public static IExpression adapt(JavaSubsetParser.SubExpressionContext subExpressionContext) {
                if (subExpressionContext.Identifier() != null)
                        return new LocalOrFieldVar(subExpressionContext.Identifier().getText(),
                                        subExpressionContext.start.getLine(),
                                        subExpressionContext.start.getCharPositionInLine());
                else if (subExpressionContext.instVar() != null)
                        return InstVarAdapter.adapt(subExpressionContext.instVar());
                else if (subExpressionContext.value() != null)
                        return ValueAdapter.adapt(subExpressionContext.value());
                else if (subExpressionContext.unaryExpr() != null)
                        return UnaryAdapter.adapt(subExpressionContext.unaryExpr());
                else if (subExpressionContext.stmtExpr() != null)
                        return StatementExpressionAdapter.adapt(subExpressionContext.stmtExpr());
                else // expression
                        return ExpressionAdapter.adapt(subExpressionContext.expression());
        }
}
