package parser.adapter;

import org.antlr.v4.runtime.tree.TerminalNode;
import parser.generated.JavaSubsetParser;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.This;

import java.util.List;

public class InstVarAdapter implements IExpression {
    public static InstVar adapt(JavaSubsetParser.InstVarContext instVarContext){
        IExpression generated = generateInstVar(instVarContext.Identifier(),null,0);

        if (generated instanceof LocalOrFieldVar){ //this
            return new InstVar(((LocalOrFieldVar) generated).getIdentifier(),new This());
        }
        return (InstVar) generated;
    }

    private static IExpression generateInstVar(List<TerminalNode> identifiers, IExpression previous, int position){

        if (previous == null){
            previous = new LocalOrFieldVar(identifiers.get(position).getText());
        } else {
            previous = new InstVar(identifiers.get(position).getText(), previous);
        }

        if (position < identifiers.size()-1){
            return generateInstVar(identifiers,previous,position+1);
        }
        return previous;
    }
}
