package common;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.adapter.ProgramAdapter;
import parser.generated.JavaSubsetLexer;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.Program;

public class AstAdapter implements IAstAdapter {

    /**
     * @param stream
     * @return Program
     */
    @Override
    public Program getAst(InputStream stream) {
        CharStream charStream = null;

        try {
            charStream = CharStreams.fromStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JavaSubsetLexer lexer = new JavaSubsetLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaSubsetParser parser = new JavaSubsetParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        return ProgramAdapter.adapt(parser.program());
    }
}
