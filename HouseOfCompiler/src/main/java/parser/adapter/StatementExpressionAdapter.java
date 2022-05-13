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

import java.util.List;

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
            var arguments = new PrintableVector<IExpression>();
            stmtExprContext.newDecl().argumentList().expression().forEach(
                    a -> arguments.add(ExpressionAdapter.adapt(a))
            );
            return new NewDecl(
                    stmtExprContext.newDecl().Identifier().getText(),
                    arguments
                    );
        }
        else { //methodCall
//            IExpression reciever;
//            if (stmtExprContext.methodCall().reciever() != null)
//                reciever = new InstVar();
//            return new MethodCall(
//                    stmtExprContext.methodCall().Identifier().getText(),
//
//                    );
            return null;
        }
    }

    //FIXME method call reciever rekursiv aufbauen

//    private static IExpression generateRecieverExpression(
//            List<TerminalNode> contexts,
//            List<JavaSubsetParser.ArgumentListContext> arguments,
//            int position) {
//        if (contexts)
//    }
}
