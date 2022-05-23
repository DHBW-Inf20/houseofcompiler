package AST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Helper.MockGenerator;
import Helper.Resources;
import common.AccessModifier;
import common.BaseType;
import common.Compiler;
import common.Primitives;
import common.PrintableVector;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.Program;

@DisplayName("Abstract Syntax Tree Generation")
public class TestRunner {

    @Test
    @DisplayName("Control Test")
    void controlTest() {
        var first = MockGenerator.getConstructorParameterAst();
        var second = MockGenerator.getConstructorParameterAst();

        assertEquals(first, second);
    }

    @Test
    @DisplayName("Empty Class")
    void emptyClass() {
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClass.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClass", new PrintableVector<>(), constructors,
                new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var generatedAst = new Program(classDecls);

        assertEquals(generatedAst, ast);

    }

    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor() {
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClassWithConstructor.java");
        Program generatedAst = Compiler.getFactory().getAstAdapter().getAst(file);

        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(), constructors,
                new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var ast = new Program(classDecls);
        assertEquals(ast, generatedAst);

    }

    @Test
    @DisplayName("ClassFields")
    void classFields() {
        Program generatedAst = Resources.getProgram("SimpleTests/ClassFields.java");

        Program expectedAst = MockGenerator.getClassFieldsAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("ClassField without AccessModifier")
    void classFieldWithoutAccessModifier() {
        Program generatedAst = Resources.getProgram("SimpleTests/AutoAccessModifierField.java");

        Program expectedAst = MockGenerator.getAutoClassFieldAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("Comments")
    void commentTest() {
        InputStream file = Resources.getFileAsStream("SimpleTests/Comments.java");
        Program generatedAst = Compiler.getFactory().getAstAdapter().getAst(file);

        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        PrintableVector<FieldDecl> fields = new PrintableVector<>();

        FieldDecl lorem = new FieldDecl("lorem", AccessModifier.PRIVATE);
        lorem.setType(new BaseType(Primitives.INT));
        fields.add(lorem);

        FieldDecl ipsum = new FieldDecl("ipsum", AccessModifier.PRIVATE);
        ipsum.setType(new BaseType(Primitives.BOOL));
        fields.add(ipsum);

        ClassDecl classDecl = new ClassDecl("Comments", fields, constructors, new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var expectedAst = new Program(classDecls);
        assertEquals(expectedAst, generatedAst);

    }

    @Test
    @DisplayName("Constructor With Parameters")
    void constructorWithParameters() {
        Program generatedAst = Resources.getProgram("SimpleTests/ConstructorParams.java");
        Program expectedAst = MockGenerator.getConstructorParameterAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("Constructor With this. assign body")
    void constructorWithThisAssignBody() {
        Program generatedAst = Resources.getProgram("SimpleTests/ConstructorThisDot.java");
        Program expectedAst = MockGenerator.getConstructorThisDotAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("VoidMethod")
    void voidMethod() {
        Program generatedAst = Resources.getProgram("SimpleTests/VoidMethod.java");
        Program expectedAst = MockGenerator.getVoidMethodAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("RealConstructor")
    void realConstructor() {
        Program generatedAst = Resources.getProgram("SimpleTests/RealConstructor.java");
        Program expectedAst = MockGenerator.getRealConstructorAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("MethodCall")
    void methodCall() {
        Program generatedAst = Resources.getProgram("SimpleTests/MethodCall.java");
        Program expectedAst = MockGenerator.getMethodCallAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("ThisDotMethodCall")
    void thisDotMethodCall() {
        Program generatedAst = Resources.getProgram("SimpleTests/ThisDotMethodCall.java");
        Program expectedAst = MockGenerator.getThisDotMethodCallAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("MethodCallWithParameters")
    void methodCallWithParameters() {
        Program generatedAst = Resources.getProgram("SimpleTests/MethodCallParams.java");
        Program expectedAst = MockGenerator.getMethodCallWithParameterAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("GetterFunction")
    void getterFunction() {
        Program generatedAst = Resources.getProgram("SimpleTests/GetterFunction.java");
        Program expectedAst = MockGenerator.getGetterFunctionAst();

        System.out.println(generatedAst);

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("CharArgument")
    void charArgument() {
        Program generatedAst = Resources.getProgram("SimpleTests/CharArgument.java");
        Program expectedAst = MockGenerator.getCharArgumentAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("ExplicitNullAssign")
    void explicitNullAssign() {
        Program generatedAst = Resources.getProgram("SimpleTests/ExplicitNullAssign.java");
        Program expectedAst = MockGenerator.getExplicitNullAssignAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("SelfReference")
    void selfReference() {
        Program generatedAst = Resources.getProgram("SimpleTests/SelfReference.java");
        Program expectedAst = MockGenerator.getSelfReferenceAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("ValueAdapterTests")
    void valueAdapterTest() {
        Program generatedAst = Resources.getProgram("SimpleTests/ValueAdapterTests.java");
        Program expectedAst = MockGenerator.getValueAdapterTestAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("System.out.println Test")
    void systemOutPrintlnTest() {
        Program generatedAst = Resources.getProgram("SimpleTests/SystemOutPrintln.java");
        Program expectedAst = MockGenerator.getSystemOutPrintlnAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("System.out.print-String Test")
    void systemOutPrintStringTest() {
        Program generatedAst = Resources.getProgram("SimpleTests/SystemOutPrintlnString.java");
        Program expectedAst = MockGenerator.getSystemOutPrintStringAst();
        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("MainMethodTest")
    void mainMethodTest() {
        Program generatedAst = Resources.getProgram("SimpleTests/MainMethodTest.java");
        Program expectedAst = MockGenerator.getMainMethodTestAst();
        assertEquals(expectedAst, generatedAst);
    }

}
