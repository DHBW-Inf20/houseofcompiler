package AST;

import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;

import Helper.Resources;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Abstract Syntax Tree Generation")
public class TestRunner {

    @Test
    @DisplayName("EmptyClass")
    void main() throws FileNotFoundException {

        ClassDecl emptyClass = new ClassDecl("EmptyClass", new Vector<>(),new Vector<>(),new Vector<>());
        Vector<ClassDecl> classDecls = new Vector<>();
        classDecls.add(emptyClass);
        var ast = new Program(classDecls);
        var tast = ast;

        var generatedTast = Compiler.getFactory().getTastGenerator().getTast(ast);

        assertEquals(tast, generatedTast);

    }


}
