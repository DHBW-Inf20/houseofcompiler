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
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.TypeMismatchException;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.Program;

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
        assertThrows(
                AlreadyDefinedException.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected AlreadyDefinedException to be thrown");
    }

    @Test
    @DisplayName("MismatchingReturnType")
    @Tag("expectfail")
    void mismatchingReturnType() {
        Program program = Resources.getProgram("FailTests/MismatchingReturnType.java");
        assertThrows(
                TypeMismatchException.class,
                () -> Compiler.getFactory().getTastAdapter().getTast(program),
                "Expected TypeMismatchException to be thrown");

    }

    @Test
    @DisplayName("WhileTest")
    void whileTest() {
        Program program = Resources.getProgram("SimpleTests/WhileTest.java");
        Compiler.getFactory().getTastAdapter().getTast(program);

    }

}
