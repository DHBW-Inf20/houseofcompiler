package TAST;

import Helper.MockGenerator;
import Helper.ReflectLoader;
import Helper.Resources;
import common.AccessModifier;
import common.Compiler;
import jdk.jfr.Label;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
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

        ClassDecl emptyClass = new ClassDecl("EmptyClass", new PrintableVector<>(), new PrintableVector<>(),
                new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(emptyClass);
        var ast = new Program(classDecls);
        var tast = ast;

        var generatedTast = Compiler.getFactory().getTastAdapter().getTast(ast);

        assertEquals(tast, generatedTast);

    }

    @Test
    @DisplayName("ClassFields")
    void classFields() {

        Program expectedAst = MockGenerator.getEmptyProgram("ClassFields");

        FieldDecl autoAccess = new FieldDecl("autoAccess", null);
        FieldDecl privateField = new FieldDecl("private", AccessModifier.PRIVATE);
        FieldDecl publicField = new FieldDecl("public", AccessModifier.PUBLIC);
        FieldDecl protectedField = new FieldDecl("protected", AccessModifier.PROTECTED);

        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(autoAccess);
        fields.add(privateField);
        fields.add(publicField);
        fields.add(protectedField);

        var generatedAst = Compiler.getFactory().getTastAdapter().getTast(expectedAst);

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor() {
        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),
                new PrintableVector<>(), constructors);
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var ast = new Program(classDecls);

        var generatedTast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var tast = ast;
        assertEquals(tast, generatedTast);

    }

    @Test
    @DisplayName("Constructor With Parameters")
    void constructorWithParameters() {
        Program generatedTast = Compiler.getFactory().getTastAdapter()
                .getTast(MockGenerator.getConstructorParameterAst());
        Program expectedTast = MockGenerator.getConstructorParameterTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("Constructor With this. assign body")
    void constructorWithThisAssignBody() {
        Program generatedTast = Compiler.getFactory().getTastAdapter()
                .getTast(MockGenerator.getConstructorThisDotAst());
        Program expectedTast = MockGenerator.getConstructorThisDotTast();

        assertEquals(expectedTast, generatedTast);
    }
}
