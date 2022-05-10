package AST;

import Helper.Resources;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyClass {
    @Test
    void main() throws FileNotFoundException {

        InputStream file = Resources.getFileAsStream("EmptyClass.java");




        Vector<ClassDecl> classDecls = new Vector<ClassDecl>();
        ClassDecl classDecl = new ClassDecl("EmptyClass", new Vector<FieldDecl>(),new Vector<MethodDecl>(),new Vector<ConstructorDecl>());
        classDecls.add(classDecl);

        var testProgram = new Program(classDecls);



        assertEquals(testProgram, testProgram);

    }


}
