package TAST;

import Helper.MockGenerator;
import Helper.Resources;
import common.AccessModifier;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.Program;

import java.io.FileNotFoundException;
import common.PrintableVector;
import semantic.exceptions.TypeMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    @DisplayName("ClassField without AccessModifier")
    void classFieldWithoutAccessModifier() {

        Program expectedTast = MockGenerator.getAutoClassFieldTast();
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(expectedTast);

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor() {
        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),constructors,
                new PrintableVector<>());
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

    @Test
    @DisplayName("VoidMethod")
    void voidMethod(){
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(MockGenerator.getVoidMethodAst());

        Program expectedTast = MockGenerator.getVoidMethodTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("RealConstructor")
    void realConstructor(){
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(MockGenerator.getRealConstructorAst());

        Program expectedTast = MockGenerator.getRealConstructorTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("MethodCall")
    void methodCall() {
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(MockGenerator.getMethodCallAst());

        Program expectedTast = MockGenerator.getMethodCallTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("MultipleFields")
    void multipleFields() {
        Program program = Resources.getProgram("FailTests/MultiFieldDecl.java");
        Compiler.getFactory().getTastAdapter().getTast(program);

    }

    @Test
    @DisplayName("MismatchingReturnType")
    void mismatchingReturnType() {
        Program program = Resources.getProgram("FailTests/MismatchingReturnType.java");
        boolean thrown = false;
        try {
            Compiler.getFactory().getTastAdapter().getTast(program);
        } catch (TypeMismatchException e) {
            if (e.getMessage().equals("Function: foo with type CHAR has unmatching return Type")) {
                thrown = true;
            }
        } finally {
            assertTrue(thrown);
        }
    }

    @Test
    @DisplayName("WhileTest")
    void whileTest() {
        Program program = Resources.getProgram("SimpleTests/WhileTest.java");
        Compiler.getFactory().getTastAdapter().getTast(program);

    }

}
