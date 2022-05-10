package TAST;

import Helper.ReflectLoader;
import Helper.Resources;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.io.InputStream;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Typed Abstract Syntax Generation")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() throws Exception {
        InputStream file = Resources.getFileAsStream("EmptyClass.java");
        Program ast = Compiler.getFactory().getAstGenerator().getAst(file);

        ClassDecl classDecl = new ClassDecl("EmptyClass", new Vector<>(),new Vector<>(),new Vector<>());
        Vector<ClassDecl> classDecls = new Vector<>();
        classDecls.add(classDecl);
        var testProgram = new Program(classDecls);

        assertEquals(ast, testProgram);
    }


}
