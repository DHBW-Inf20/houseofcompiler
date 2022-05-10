package AST;

import common.Compiler;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;

import Helper.Resources;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmptyClass {
    @Test
    void main() throws FileNotFoundException {

        InputStream file = Resources.getFileAsStream("EmptyClass.java");
        Program tast = Compiler.getFactory().getAstGenerator().getAst(file);

        Vector<ClassDecl> classDecls = new Vector<ClassDecl>();
        ClassDecl classDecl = new ClassDecl("EmptyClass", new Vector<FieldDecl>(),new Vector<MethodDecl>(),new Vector<ConstructorDecl>());
        classDecls.add(classDecl);
        var testProgram = new Program(classDecls);

        assertEquals(tast, testProgram);

    }


}
