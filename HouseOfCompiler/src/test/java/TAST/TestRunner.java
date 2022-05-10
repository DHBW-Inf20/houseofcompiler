package TAST;

import Helper.ReflectLoader;
import Helper.Resources;
import common.Compiler;
import jdk.jfr.Label;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.Program;

import java.io.FileNotFoundException;
import java.io.InputStream;
import common.PrintableVector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Typed Abstract Syntax Generation")
public class TestRunner {

    @Test
    @DisplayName("EmptyClass")
    void emptyClass() throws FileNotFoundException {

        ClassDecl emptyClass = new ClassDecl("EmptyClass", new PrintableVector<>(),new PrintableVector<>(),new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(emptyClass);
        var ast = new Program(classDecls);
        var tast = ast;

        var generatedTast = Compiler.getFactory().getTastGenerator().getTast(ast);

        assertEquals(tast, generatedTast);

    }

    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor(){
        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),new PrintableVector<>(),constructors);
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var ast = new Program(classDecls);

        var generatedTast = Compiler.getFactory().getTastGenerator().getTast(ast);
        var tast = ast;
        assertEquals(tast, generatedTast);

    }
}
