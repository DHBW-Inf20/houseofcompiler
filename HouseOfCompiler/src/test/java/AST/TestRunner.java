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

import Helper.Resources;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
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

    @Test
    @DisplayName("IntegerWrapper")
    void integerWrapper(){
        InputStream file = Resources.getFileAsStream("IntegerWrapper.java");

        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        PrintableVector<FieldDecl> fields = new PrintableVector<>();
        PrintableVector<MethodDecl> methods = new PrintableVector<>();

        // Constructor 1

        Block c_1_block = new Block();
        LocalOrFieldVar c_1_lofv = new LocalOrFieldVar("i");
        IntegerExpr c_1_integerexpr = new IntegerExpr(0);
        Assign c_1_assign = new Assign(c_1_lofv, c_1_integerexpr);
        c_1_block.getBlock().add(c_1_assign);

        ConstructorDecl c_1 = new ConstructorDecl(AccessModifier.PUBLIC, new PrintableVector<>(), c_1_block);

        // Constructor 2
        MethodParameter c_2_param = new MethodParameter("i");
        var c_2_params = new PrintableVector<MethodParameter>();
        c_2_params.add(c_2_param);

        Block c_2_block = new Block();
        LocalOrFieldVar c_2_lofv = new LocalOrFieldVar("i");
        LocalOrFieldVar c_2_parameter = new LocalOrFieldVar("i");
        Assign c_2_assign = new Assign(c_2_lofv, c_2_parameter);
        c_2_block.getBlock().add(c_2_assign);

        ConstructorDecl c_2 = new ConstructorDecl(AccessModifier.PUBLIC, c_2_params, c_2_block);

        FieldDecl i = new FieldDecl("i", AccessModifier.PUBLIC);
        i.setType(new BaseType(Primitives.INT));
        fields.add(i);

        constructors.add(c_1);
        constructors.add(c_2);


        ClassDecl classDecl = new ClassDecl("IntegerWrapper", fields, methods, constructors);
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var ast = new Program(classDecls);
        Program generatedAst = Compiler.getFactory().getAstAdapter().getAst(file);
        assertEquals(ast, generatedAst);
    }


}
