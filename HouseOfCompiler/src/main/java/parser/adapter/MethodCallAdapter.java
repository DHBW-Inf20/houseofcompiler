package parser.adapter;

import common.PrintableVector;
import org.antlr.v4.misc.EscapeSequenceParsing;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.This;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import visitor.SemanticVisitor;

import java.util.List;

public class MethodCallAdapter {
    public static MethodCall adapt(JavaSubsetParser.MethodCallContext methodCallContext){
        var arguments = new PrintableVector<IExpression>();
        methodCallContext.argumentList().expression().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
        IExpression reciever = new This();

        if (methodCallContext.reciever() != null){ //explicit reciever
            if (methodCallContext.reciever().instVar() != null){
                reciever = InstVarAdapter.adapt(methodCallContext.reciever().instVar());
            }
            else if (methodCallContext.reciever().newDecl() != null){
                reciever = NewDeclAdapter.adapt(methodCallContext.reciever().newDecl());
            }
            else if (methodCallContext.reciever().Identifier() != null){
                reciever = new LocalOrFieldVar(methodCallContext.reciever().Identifier().getText());
            }
        }
        if (methodCallContext.revievingMethod() != null){ //A.b.m().n()
            reciever = recursivelyAdaptRecievingMethods(methodCallContext.revievingMethod(), methodCallContext.revievingMethod().size()-1, reciever);
        }
        return new MethodCall(
                methodCallContext.Identifier().getText(),
                reciever,
                arguments
                );
    }

    private static MethodCall recursivelyAdaptRecievingMethods(List<JavaSubsetParser.RevievingMethodContext> contexts, int index, IExpression rootReciever){
        if (index > 0){
            var arguments = new PrintableVector<IExpression>();
            contexts.get(index-1).argumentList().expression().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
            return new MethodCall(
                    contexts.get(index-1).Identifier().getText(),
                    recursivelyAdaptRecievingMethods(contexts, index, rootReciever),
                    arguments
            );

        }
        else{
            var arguments = new PrintableVector<IExpression>();
            contexts.get(0).argumentList().expression().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
            return new MethodCall(
                    contexts.get(0).Identifier().getText(),
                    rootReciever,
                    arguments
            );
        }
    }
}
