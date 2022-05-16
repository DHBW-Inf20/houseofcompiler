package parser.adapter;

import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.statements.Block;
import syntaxtree.statements.IStatement;


public class BlockAdapter {
    public static Block adapt(JavaSubsetParser.BlockContext blockContext){
        var statements = new PrintableVector<IStatement>();
        blockContext.statement().forEach(statementContext -> statements.add(StatementAdapter.adapt(statementContext)));
        if (statements.isEmpty())
            return new Block();
        else
            return new Block(statements);
    }
}
