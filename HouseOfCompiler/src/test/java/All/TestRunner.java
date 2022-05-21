package All;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Helper.ReflectLoader;
import Helper.Resources;
import common.Compiler;
import syntaxtree.structure.Program;

@DisplayName("All")
public class TestRunner {

    /**
     * @throws Exception
     */
    @Test
    @DisplayName("Empty Class")
    void emptyClass() throws Exception {
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClass.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("EmptyClass");

        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals("EmptyClass", o.getClass().getName());
    }

    /**
     * @throws Exception
     */
    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor() throws Exception {
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClassWithConstructor.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("EmptyClassWithConstructor");

        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals("EmptyClassWithConstructor", o.getClass().getName());
    }

    @Test
    @DisplayName("ClassFields - privateAccess")
    void classFieldsPrivate() {
        Program program = Resources.getProgram("SimpleTests/ClassFields.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            var autoAccess = loader.getField("ClassFields", "privateAccess");

            assertEquals(Modifier.PRIVATE, autoAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("ClassFields - publicAccess")
    void classFieldsPublic() {
        Program program = Resources.getProgram("SimpleTests/ClassFields.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            var publicAccess = loader.getField("ClassFields", "publicAccess");
            assertEquals(Modifier.PUBLIC, publicAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("ClassFields - protectedAccess")
    void classFieldsProtected() {
        Program program = Resources.getProgram("SimpleTests/ClassFields.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            var protectedAccess = loader.getField("ClassFields", "protectedAccess");
            assertEquals(Modifier.PROTECTED, protectedAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

    /**
     * @throws Exception
     */
    @Test
    @DisplayName("Comments")
    void comments() throws Exception {
        InputStream file = Resources.getFileAsStream("SimpleTests/Comments.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("Comments");
        Field lorem = loader.getField(c.getName(), "lorem");
        assertEquals("int", lorem.getType().toString());
    }

    @Test
    @DisplayName("Constructor With Parameters")
    void constructorWithParameters() {
        Program program = Resources.getProgram("SimpleTests/ConstructorParams.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ConstructorParams");
        try {
            Object o = c.getDeclaredConstructor(int.class).newInstance(1);
            assertEquals("ConstructorParams", o.getClass().getName());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("Constructor with this. assign body")
    void constructorWithThisAssignBody() {
        Program program = Resources.getProgram("SimpleTests/ConstructorThisDot.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ConstructorThisDot");
        try {
            Object o = c.getDeclaredConstructor().newInstance();
            var i = loader.getField("ConstructorThisDot", "i");
            var ivalue = i.get(o);
            assertEquals(5, ivalue);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("VoidMethod")
    void voidMethod() {
        Program program = Resources.getProgram("SimpleTests/VoidMethod.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("VoidMethod");
        try {
            Object o = c.getDeclaredConstructor().newInstance();
            var voidMethod = loader.getMethod("VoidMethod", "foo");
            voidMethod.invoke(o);
            assertEquals("foo", voidMethod.getName());
        } catch (Exception e) {

            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("RealConstructor - params&this-assigns")
    void realConstructor() {
        Program program = Resources.getProgram("SimpleTests/RealConstructor.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("RealConstructor");
        try {
            int randomI = 2;
            Object o = c.getDeclaredConstructor(int.class).newInstance(randomI);
            var i = loader.getField("RealConstructor", "i");
            var ivalue = i.get(o);
            assertEquals(randomI, ivalue);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("MethodCall")
    void methodCall() {
        ReflectLoader loader = new ReflectLoader("SimpleTests/MethodCall.java");
        Class<?> c = loader.findClass("MethodCall");
        Object o = null;
        int value = 1;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var i = loader.getField("MethodCall", "i");
            int ivalue = (int) i.get(o);
            assertEquals(value, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("MethodCallWithParameters")
    void methodCallParams() {
        ReflectLoader loader = new ReflectLoader("SimpleTests/MethodCallParams.java");
        Class<?> c = loader.findClass("MethodCallParams");
        Object o = null;
        int value = 5;
        try {
            o = c.getDeclaredConstructor(int.class).newInstance(value);
            var i = loader.getField("MethodCallParams", "i");
            int ivalue = (int) i.get(o);
            assertEquals(value, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("CharArgument")
    void charArgument() {
        ReflectLoader loader = new ReflectLoader("SimpleTests/CharArgument.java");
        Class<?> clazz = loader.findClass("CharArgument");
        Object o = null;
        char value = 'a';
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var cField = loader.getField("CharArgument", "c");
            char ivalue = (char) cField.get(o);
            assertEquals(value, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("MultClasses")
    void multClasses() {
        Program program = Resources.getProgram("SimpleTests/MultClassesReference.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        if (bc.size() != 2) {
            fail("Bytecode map should hold 2 Classes but got " + bc.size());
            return;
        }
        var loader = new ReflectLoader(bc);
        int value = 5;
        try {
            var clazz1 = loader.findClass("MultClassesReference2");
            Object multclassref2 = null;
            multclassref2 = clazz1.getDeclaredConstructor(int.class).newInstance(value);
            var testMethod = loader.getMethod("MultClassesReference2", "test");
            var ivalue = testMethod.invoke(multclassref2);
            assertEquals(value, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("IfStatement")
    void ifStatement() {
        Program program = Resources.getProgram("SimpleTests/IfStatement.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("IfStatement");
        Object o = null;
        int value = -1;
        int result;
        if (value == 1) {
            result = 10;
        } else {
            result = 100;
        }
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("IfStatement", "foo", int.class);
            var ivalue = (int) foo.invoke(o, value);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("IfElseStatement")
    void ifElseStatement() {
        Program program = Resources.getProgram("SimpleTests/IfElseStatement.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("IfElseStatement");
        Object o = null;
        int value = -1;
        int result;
        if (value == 1) {
            result = 10;
        } else {
            result = 100;
        }
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("IfElseStatement", "foo", int.class);
            var ivalue = (int) foo.invoke(o, value);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("IfElseIfStatement")
    void ifElseIfStatement() {
        Program program = Resources.getProgram("SimpleTests/IfElseIfStatement.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("IfElseIfStatement");
        Object o = null;
        int value = 3;
        int result;
        if (value == 1) {
            result = 10;
        } else if (value == 2) {
            result = 40000;
        } else {
            result = 42000;
        }
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("IfElseIfStatement", "foo", int.class);
            var ivalue = (int) foo.invoke(o, value);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("IfElseIfStatementWithoutReturn")
    void ifElseIfStatementWithoutReturn() {
        Program program = Resources.getProgram("SimpleTests/IfElseIfStatementWithoutReturn.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("IfElseIfStatementWithoutReturn");
        Object o = null;
        int value = 3;
        int result;
        if (value == 1) {
            result = 10;
        } else if (value == 2) {
            result = 20;
        } else {
            result = 30;
        }
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("IfElseIfStatementWithoutReturn", "foo", int.class);
            var ivalue = (int) foo.invoke(o, value);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("IfElseIfStatementWithOneReturn")
    void ifElseIfStatementWithOneReturn() {
        Program program = Resources.getProgram("SimpleTests/IfElseIfStatementWithOneReturn.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("IfElseIfStatementWithOneReturn");
        Object o = null;
        int value = 3;
        int result;
        if (value == 1) {
            result = 10;
        } else if (value == 2) {
            result = 20;
        } else {
            result = 30;
        }
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("IfElseIfStatementWithOneReturn", "foo", int.class);
            var ivalue = (int) foo.invoke(o, value);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("FourClasses")
    void fourClasses() {
        Program program = Resources.getProgram("SimpleTests/FourClasses.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("FourClasses");
        Object o = null;
        int result = 10;
        try {
            var foo = loader.getMethod("FourClasses", "foo", int.class);
            var ivalue = (int) foo.invoke(o, result);
            assertEquals(result * 2, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
