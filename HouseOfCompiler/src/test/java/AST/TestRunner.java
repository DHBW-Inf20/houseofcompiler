package AST;

import common.*;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.expressions.BoolExpr;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statements.Block;
import syntaxtree.statements.IStatement;
import syntaxtree.structure.*;
import Helper.MockGenerator;
import Helper.Resources;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Abstract Syntax Tree Generation")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() {
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
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),new PrintableVector<>(),constructors);
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

        ClassDecl classDecl = new ClassDecl("Comments", fields, new PrintableVector<>(), constructors);
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var ast = new Program(classDecls);
        assertEquals(ast, generatedAst);

    }



}
