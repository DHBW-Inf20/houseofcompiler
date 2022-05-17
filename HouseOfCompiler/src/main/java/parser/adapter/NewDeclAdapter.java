package parser.adapter;

import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.statementexpression.NewDecl;

public class NewDeclAdapter {
    public static NewDecl adapt(JavaSubsetParser.NewDeclContext newDeclContext){
        var arguments = new PrintableVector<IExpression>();
        newDeclContext.argumentList().expression().forEach(
                a -> arguments.add(ExpressionAdapter.adapt(a))
        );
        return new NewDecl(
                newDeclContext.Identifier().getText(),
                arguments
        );
    }
}
