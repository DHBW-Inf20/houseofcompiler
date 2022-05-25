package parser.adapter;

import java.util.List;

import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.This;
import syntaxtree.statementexpression.MethodCall;

public class MethodCallAdapter {

    /**
     * @param methodCallContext
     * @return MethodCall
     */
    public static MethodCall adapt(JavaSubsetParser.MethodCallContext methodCallContext) {
        var arguments = new PrintableVector<IExpression>();
        IExpression receiver = new This();
        if (methodCallContext.argumentList() != null) {
            methodCallContext.argumentList().expression().forEach(
                    a -> arguments.add(ExpressionAdapter.adapt(a)));
        }
        if (methodCallContext.receiver() != null) { // explicit receiver
            if (methodCallContext.receiver().instVar() != null) {
                receiver = InstVarAdapter.adapt(methodCallContext.receiver().instVar());
            } else if (methodCallContext.receiver().newDecl() != null) {
                receiver = NewDeclAdapter.adapt(methodCallContext.receiver().newDecl());
            } else if (methodCallContext.receiver().Identifier() != null) {
                receiver = new LocalOrFieldVar(methodCallContext.receiver().Identifier().getText());
            }
        }
        if (methodCallContext.receivingMethod() != null && methodCallContext.receivingMethod().size() > 0) { // A.b.m().n()
            receiver = recursivelyAdaptRecievingMethods(methodCallContext.receivingMethod(),
                    methodCallContext.receivingMethod().size() - 1, receiver);
        }
        return new MethodCall(
                methodCallContext.Identifier().getText(),
                receiver,
                arguments,
                methodCallContext.start.getLine(),
                methodCallContext.start.getCharPositionInLine());
    }

    /**
     * @param contexts
     * @param index
     * @param rootReceiver
     * @return MethodCall
     */
    private static MethodCall recursivelyAdaptRecievingMethods(List<JavaSubsetParser.ReceivingMethodContext> contexts,
            int index, IExpression rootReceiver) {
        if (index > 0) {
            var arguments = new PrintableVector<IExpression>();
            var context = contexts.get(index - 1);
            context.argumentList().expression().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
            return new MethodCall(
                    context.Identifier().getText(),
                    recursivelyAdaptRecievingMethods(contexts, index, rootReceiver),
                    arguments,
                    context.start.getLine(),
                    context.start.getCharPositionInLine());

        } else {
            var arguments = new PrintableVector<IExpression>();
            contexts.get(0).argumentList().expression().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
            return new MethodCall(
                    contexts.get(0).Identifier().getText(),
                    rootReceiver,
                    arguments,
                    contexts.get(0).start.getLine(),
                    contexts.get(0).start.getCharPositionInLine());
        }
    }
}
