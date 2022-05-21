package All;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
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

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

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
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("FourClasses");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var main = loader.getMethod("FourClasses", "main", int.class);
            var ivalue = (int) main.invoke(o, result);
            assertEquals(result * 2, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("FourClassesFieldAssign")
    void fourClassesFieldAssign() {
        Program program = Resources.getProgram("SimpleTests/FourClassesFieldAssign.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("FourClassesFieldAssign");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var main = loader.getMethod("FourClassesFieldAssign", "fieldAssign", int.class);
            var ivalue = (int) main.invoke(o, result);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("FourClassesSetter")
    void fourClassesSetter() {
        Program program = Resources.getProgram("SimpleTests/FourClassesSetter.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("FourClassesSetter");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var main = loader.getMethod("FourClassesSetter", "setFieldTest", int.class);
            var ivalue = (int) main.invoke(o, result);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("MinusMethod")
    void minusMethod() {
        Program program = Resources.getProgram("SimpleTests/MinusMethod.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("MinusMethod");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("MinusMethod", "foo", int.class);
            var ivalue = (int) foo.invoke(o, result);
            assertEquals(0, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("PlusMethod")
    void plusMethod() {
        Program program = Resources.getProgram("SimpleTests/PlusMethod.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("PlusMethod");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("PlusMethod", "foo", int.class);
            var ivalue = (int) foo.invoke(o, result);
            assertEquals(20, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("MulMethod")
    void mulMethod() {
        Program program = Resources.getProgram("SimpleTests/MulMethod.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("MulMethod");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("MulMethod", "foo", int.class);
            var ivalue = (int) foo.invoke(o, result);
            assertEquals(100, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("DivMethod")
    void divMethod() {
        Program program = Resources.getProgram("SimpleTests/DivMethod.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("DivMethod");
        Object o = null;
        int result = 10;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("DivMethod", "foo", int.class);
            var ivalue = (int) foo.invoke(o, result);
            assertEquals(1, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("PunktVorStrich")
    void punktVorStrich() {
        Program program = Resources.getProgram("SimpleTests/PunktVorStrich.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("PunktVorStrich");
        Object o = null;
        int a = 10;
        int b = 20;
        int c = 30;
        int result = a + b * c;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("PunktVorStrich", "foo", int.class, int.class, int.class);
            var ivalue = (int) foo.invoke(o, a, b, c);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("KlammerVorPunkt")
    void klammerVorPunkt() {
        Program program = Resources.getProgram("SimpleTests/KlammerVorPunkt.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("KlammerVorPunkt");
        Object o = null;
        int a = 10;
        int b = 20;
        int c = 30;
        int result = a * (b + c);
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("KlammerVorPunkt", "foo", int.class, int.class, int.class);
            var ivalue = (int) foo.invoke(o, a, b, c);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("ModMethod")
    void modMethod() {
        Program program = Resources.getProgram("SimpleTests/ModMethod.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("ModMethod");
        Object o = null;
        int a = 4;
        int b = 260;
        int result = b % a;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("ModMethod", "foo", int.class, int.class);
            var ivalue = (int) foo.invoke(o, b, a);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("NotMethod")
    void notMethod() {
        Program program = Resources.getProgram("SimpleTests/NotMethod.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("NotMethod");
        Object o = null;
        boolean a = true;
        boolean result = !a;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("NotMethod", "foo", boolean.class);
            var ivalue = (boolean) foo.invoke(o, a);
            assertEquals(result, ivalue);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("OperatorFullTest")
    void operatorFullTest() {
        Program program = Resources.getProgram("SimpleTests/OperatorTest.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        System.out.println(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("OperatorTest");
        Object o = null;
        int x = 452;
        int y = 87;

        boolean a = true;
        boolean b = false;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var assign = loader.getMethod("OperatorTest", "assign", int.class).invoke(o, x);
            assertEquals(x, assign);
            var plus = loader.getMethod("OperatorTest", "plus", int.class, int.class).invoke(o, x, y);
            assertEquals(x + y, plus);
            var minus = loader.getMethod("OperatorTest", "minus", int.class, int.class).invoke(o, x, y);
            assertEquals(x - y, minus);
            var mult = loader.getMethod("OperatorTest", "mult", int.class, int.class).invoke(o, x, y);
            assertEquals(x * y, mult);
            var div = loader.getMethod("OperatorTest", "div", int.class, int.class).invoke(o, x, y);
            assertEquals(x / y, div);
            var mod = loader.getMethod("OperatorTest", "mod", int.class, int.class).invoke(o, x, y);
            assertEquals(x % y, mod);
            var gt = loader.getMethod("OperatorTest", "gt", int.class, int.class).invoke(o, x, y);
            assertEquals(x > y, gt);
            var lt = loader.getMethod("OperatorTest", "lt", int.class, int.class).invoke(o, x, y);
            assertEquals(x < y, lt);
            var gte = loader.getMethod("OperatorTest", "gte", int.class, int.class).invoke(o, x, y);
            assertEquals(x >= y, gte);
            var lte = loader.getMethod("OperatorTest", "lte", int.class, int.class).invoke(o, x, y);
            assertEquals(x <= y, lte);
            var eq = loader.getMethod("OperatorTest", "eq", int.class, int.class).invoke(o, x, y);
            assertEquals(x == y, eq);
            var neq = loader.getMethod("OperatorTest", "neq", int.class, int.class).invoke(o, x, y);
            assertEquals(x != y, neq);

            var beq = loader.getMethod("OperatorTest", "beq", boolean.class, boolean.class).invoke(o, true, true);
            assertEquals(true, beq);
            var beq2 = loader.getMethod("OperatorTest", "beq", boolean.class, boolean.class).invoke(o, true, false);
            assertEquals(false, beq2);
            var beq3 = loader.getMethod("OperatorTest", "beq", boolean.class, boolean.class).invoke(o, false, true);
            assertEquals(false, beq3);
            var beq4 = loader.getMethod("OperatorTest", "beq", boolean.class, boolean.class).invoke(o, false, false);
            assertEquals(true, beq4);

            var bneq = loader.getMethod("OperatorTest", "bneq", boolean.class, boolean.class).invoke(o, true, true);
            assertEquals(false, bneq);

            var and = loader.getMethod("OperatorTest", "and", boolean.class, boolean.class).invoke(o, a, b);
            assertEquals(a && b, and);
            var and2 = loader.getMethod("OperatorTest", "and", boolean.class, boolean.class).invoke(o, a, !b);
            assertEquals(a && !b, and2);
            var or = loader.getMethod("OperatorTest", "or", boolean.class, boolean.class).invoke(o, a, b);
            assertEquals(a || b, or);
            var not = loader.getMethod("OperatorTest", "not", boolean.class).invoke(o,
                    a);
            assertEquals(!a, not);

            var icEq = loader.getMethod("OperatorTest", "icEq", int.class, char.class).invoke(o, x, (char) x);
            assertEquals(true, icEq);

            var icLt = loader.getMethod("OperatorTest", "icLt", int.class, char.class).invoke(o, x, (char) y);
            assertEquals(x < (char) y, icLt);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("ExtendedNotTest")
    void extendedNotTest() {
        Program program = Resources.getProgram("SimpleTests/ExtendedNotTest.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("ExtendedNotTest");
        Object o = null;
        boolean a = true;
        boolean b = false;
        int x = 87;
        int y = 452;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
            var notequal = loader.getMethod("ExtendedNotTest", "notequal", int.class, int.class);

            assertEquals(false, notequal.invoke(o, x, x));
            assertEquals(true, notequal.invoke(o, x, y));

            var multiple = loader.getMethod("ExtendedNotTest", "multiple", boolean.class, boolean.class);
            assertEquals(!(!a || b), multiple.invoke(o, a, b));

            var notWithAssigns = loader.getMethod("ExtendedNotTest", "notWithAssigns", boolean.class);
            assertEquals(a, notWithAssigns.invoke(o, a));

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("SelfReference")
    void SelfReference() {
        Program program = Resources.getProgram("SimpleTests/SelfReference.java");

        System.out.println(program);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
    }

    @Test
    @DisplayName("MultipleClassesMethodCalls")
    void multipleClassesMethodCalls() {
        Program program = Resources.getProgram("SimpleTests/MultipleClassesMethodCalls.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> clazz = loader.findClass("MultipleClassesMethodCalls");
        int x = 10;
        try {
            Object o = loader.getConstructor("MultipleClassesMethodCalls").newInstance();
            var mainMethod = loader.getMethod("MultipleClassesMethodCalls", "main", int.class);
            var returnValue = mainMethod.invoke(o, x);
            assertEquals(x, returnValue);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

    }

    @Test
    @DisplayName("RealWhile")
    void realWhile() {
        Program program = Resources.getProgram("SimpleTests/RealWhile.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        int x = 10;
        try {
            Object o = loader.getConstructor("RealWhile").newInstance();
            var mainMethod = loader.getMethod("RealWhile", "foo", int.class);
            var returnValue = mainMethod.invoke(o, x);
            assertEquals(x * 2, returnValue);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

    }

    @Test
    @DisplayName("LinkedList")
    void linkedList() {
        Program program = Resources.getProgram("Integration/LinkedList.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            Object o = loader.getConstructor("LinkedList", int.class).newInstance(1);
            var add = loader.getMethod("LinkedList", "add", int.class);
            add.invoke(o, 2);
            add.invoke(o, 3);
            var get = loader.getMethod("LinkedList", "get", int.class);
            assertEquals(1, get.invoke(o, 0));
            assertEquals(2, get.invoke(o, 1));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("StringLinkedList")
    void stringLinkedList() {
        Program program = Resources.getProgram("Integration/StringList.java");

        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        System.out.println(tast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            Object o = loader.getConstructor("StringList", char.class).newInstance('H');
            var add = loader.getMethod("StringList", "add", char.class);
            var get = loader.getMethod("StringList", "get", int.class);
            var length = loader.getMethod("StringList", "length");
            add.invoke(o, 'e');
            add.invoke(o, 'l');
            add.invoke(o, 'l');
            add.invoke(o, 'o');
            add.invoke(o, ' ');
            add.invoke(o, 'W');
            add.invoke(o, 'o');
            add.invoke(o, 'r');
            add.invoke(o, 'l');
            add.invoke(o, 'd');
            add.invoke(o, '!');

            String result = "";
            for (int i = 0; i < (int) length.invoke(o); i++) {
                System.out.println(get.invoke(o, i));
                result += get.invoke(o, i);
            }
            assertEquals("Hello World!", result);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("SystemOutPrintln Test")
    void systemOutPrintlnTest() {
        Program program = Resources.getProgram("Integration/SystemOutPrintln.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("SystemOutPrintln");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var foo = loader.getMethod("SystemOutPrintln", "foo");
            var bar = loader.getMethod("SystemOutPrintln", "bar");
            var baz = loader.getMethod("SystemOutPrintln", "baz");
            System.setOut(new PrintStream(outContent));
            foo.invoke(o);
            bar.invoke(o);
            baz.invoke(o);
            var expected = new String("c\n\t100\n\ttrue\n\t").replaceAll("\\p{C}", "");
            ;
            var actual = new String(outContent.toByteArray()).replaceAll("\\p{C}", "");
            assertEquals(expected, actual);
            System.setOut(originalOut);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
