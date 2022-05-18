package AST;

import common.*;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;
import Helper.MockGenerator;
import Helper.Resources;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Abstract Syntax Tree Generation")
public class TestRunner {

    @Test
    @DisplayName("Control Test")
    void controlTest(){
        var first = MockGenerator.getConstructorParameterAst();
        var second = MockGenerator.getConstructorParameterAst();

        assertEquals(first , second);
    }

    @Test
    @DisplayName("Empty Class")
    void emptyClass() {
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClass.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);

        ClassDecl classDecl = new ClassDecl("EmptyClass", new PrintableVector<>(),new PrintableVector<>(),new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var generatedAst = new Program(classDecls);

        assertEquals(ast, generatedAst);

    }

    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor(){
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClassWithConstructor.java");
        Program generatedAst = Compiler.getFactory().getAstAdapter().getAst(file);

        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),constructors,new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var ast = new Program(classDecls);
        assertEquals(ast, generatedAst);
        
    }
    @Test
    @DisplayName("ClassFields")
    void classFields(){
        Program generatedAst = Resources.getProgram("SimpleTests/ClassFields.java");

        Program expectedAst = MockGenerator.getClassFieldsAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("ClassField without AccessModifier")
    void classFieldWithoutAccessModifier(){
        Program generatedAst = Resources.getProgram("SimpleTests/AutoAccessModifierField.java");

        Program expectedAst = MockGenerator.getAutoClassFieldAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("Comments")
    void commentTest(){
        InputStream file = Resources.getFileAsStream("SimpleTests/Comments.java");
        Program generatedAst = Compiler.getFactory().getAstAdapter().getAst(file);

        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
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
    void constructorWithParameters(){
        Program generatedAst = Resources.getProgram("SimpleTests/ConstructorParams.java");
        Program expectedAst = MockGenerator.getConstructorParameterAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("Constructor With this. assign body")
    void constructorWithThisAssignBody(){
        Program generatedAst = Resources.getProgram("SimpleTests/ConstructorThisDot.java");
        Program expectedAst = MockGenerator.getConstructorThisDotAst();


        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("VoidMethod")
    void voidMethod(){
        Program generatedAst = Resources.getProgram("SimpleTests/VoidMethod.java");
        Program expectedAst = MockGenerator.getVoidMethodAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("RealConstructor")
    void realConstructor(){
        Program generatedAst = Resources.getProgram("SimpleTests/RealConstructor.java");
        Program expectedAst = MockGenerator.getRealConstructorAst();

        assertEquals(expectedAst, generatedAst);
    }

    @Test
    @DisplayName("MethodCall")
    void methodCall(){
        Program generatedAst = Resources.getProgram("SimpleTests/MethodCall.java");
        Program expectedAst = MockGenerator.getMethodCallAst();

        assertEquals(expectedAst, generatedAst);
    }

    


}
