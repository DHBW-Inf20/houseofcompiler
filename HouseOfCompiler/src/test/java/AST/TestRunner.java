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
public class TestEmptyClass {

    @Test
    @DisplayName("EmptyClass")
    void main() throws FileNotFoundException {

        InputStream file = Resources.getFileAsStream("EmptyClass.java");
        Program ast = Compiler.getFactory().getAstGenerator().getAst(file);

        ClassDecl classDecl = new ClassDecl("EmptyClass", new Vector<>(),new Vector<>(),new Vector<>());
        Vector<ClassDecl> classDecls = new Vector<>();
        classDecls.add(classDecl);
        var testProgram = new Program(classDecls);

        assertEquals(ast, testProgram);

    }


}
