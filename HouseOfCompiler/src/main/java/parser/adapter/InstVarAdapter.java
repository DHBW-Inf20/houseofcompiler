package parser.adapter;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.This;

public class InstVarAdapter {

    /**
     * @param instVarContext
     * @return InstVar
     */
    public static InstVar adapt(JavaSubsetParser.InstVarContext instVarContext) {
        IExpression generated = generateInstVar(instVarContext.Identifier(), null, 0);
        if (generated instanceof LocalOrFieldVar) { // this
            return new InstVar(((LocalOrFieldVar) generated).getIdentifier(), new This(),
                    instVarContext.start.getLine(), instVarContext.start.getCharPositionInLine());
        }
        return (InstVar) generated;
    }

    /**
     * @param identifiers
     * @param previous
     * @param position
     * @return IExpression
     */
    private static IExpression generateInstVar(List<TerminalNode> identifiers, IExpression previous, int position) {
        var identifier = identifiers.get(position);

        if (previous == null) {
            previous = new LocalOrFieldVar(identifier.getText(), identifier.getSymbol().getLine(),
                    identifier.getSymbol().getCharPositionInLine());
        } else {
            previous = new InstVar(identifier.getText(), previous, identifier.getSymbol().getLine(),
                    identifier.getSymbol().getCharPositionInLine());
        }

        if (position < identifiers.size() - 1) {
            return generateInstVar(identifiers, previous, position + 1);
        }
        return previous;
    }
}
