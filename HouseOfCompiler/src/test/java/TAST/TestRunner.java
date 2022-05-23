package TAST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Helper.MockGenerator;
import Helper.Resources;
import common.AccessModifier;
import common.BaseType;
import common.Compiler;
import common.Primitives;
import common.PrintableVector;
import semantic.exceptions.SemanticError;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.Program;

@DisplayName("Typed Abstract Syntax Generation")
public class TestRunner {

    /**
     * @throws FileNotFoundException
     */
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

        FieldDecl autoAccess = new FieldDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT),
                "autoAccess");
        FieldDecl privateField = new FieldDecl(AccessModifier.PRIVATE, new BaseType(Primitives.INT), "private");
        FieldDecl publicField = new FieldDecl(AccessModifier.PUBLIC, new BaseType(Primitives.INT), "public");
        FieldDecl protectedField = new FieldDecl(AccessModifier.PROTECTED, new BaseType(Primitives.INT), "protected");

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
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(), constructors,
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
    void voidMethod() {
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(MockGenerator.getVoidMethodAst());

        Program expectedTast = MockGenerator.getVoidMethodTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("RealConstructor")
    void realConstructor() {
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
    @Tag("expectfail")
    void multipleFields() {
        Program program = Resources.getProgram("FailTests/MultiFieldDecl.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("MismatchingReturnType")
    @Tag("expectfail")
    void mismatchingReturnType() {
        Program program = Resources.getProgram("FailTests/MismatchingReturnType.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("WhileTest")
    void whileTest() {
        Program program = Resources.getProgram("SimpleTests/WhileTest.java");
        Compiler.getFactory().getTastAdapter().getTast(program);

    }

    @Test
    @DisplayName("WhileFailTest")
    void whileFailTest() {
        Program program = Resources.getProgram("FailTests/WhileBool.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("ScopeFailTest")
    void scopeFailTest() {
        Program program = Resources.getProgram("FailTests/ScopeTest.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("AssignFailTest")
    void assignFailTest() {
        Program program = Resources.getProgram("FailTests/AssignFail.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("LocalVarDeclaration with wrong init-Type")
    void localVarDeclInitFail() {
        Program program = Resources.getProgram("FailTests/LocalVarWrongInit.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("ExplicitNullAssign")
    void explicitNullAssign() {
        Program program = Resources.getProgram("SimpleTests/ExplicitNullAssign.java");
        Compiler.getFactory().getTastAdapter().getTast(program);
    }

    @Test
    @DisplayName("SelfReference")
    void selfReference() {
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(MockGenerator.getSelfReferenceAst());

        Program expectedTast = MockGenerator.getSelfReferenceTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("SystemOutPrintln-Test")
    void systemOutPrintlnTest() {
        Program generatedTast = Compiler.getFactory().getTastAdapter().getTast(MockGenerator.getSystemOutPrintlnAst());
        Program expectedTast = MockGenerator.getSystemOutPrintlnTast();

        assertEquals(expectedTast, generatedTast);
    }

    @Test
    @DisplayName("FieldAccessTests")
    void fieldAccessTests() {
        Program program = Resources.getProgram("FailTests/FieldAccessTests.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("MethodAccessTests")
    void methodAccessTests() {
        Program program = Resources.getProgram("FailTests/MethodAccessTests.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("DuplicateMethod")
    void duplicateMethod() {
        Program program = Resources.getProgram("FailTests/DuplicateMethod.java");
        System.err.print(assertThrows(
                SemanticError.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected SemanticError to be thrown").getMessage());

    }

    @Test
    @DisplayName("SystemOutPrintln-String-Test")
    void systemOutPrintlnStringTest() {
        Program generatedTast = Compiler.getFactory().getTastAdapter()
                .getTast(MockGenerator.getSystemOutPrintStringAst());
        Program expectedTast = MockGenerator.getSystemOutPrintStringTast();
        assertEquals(expectedTast, generatedTast);
    }

}
