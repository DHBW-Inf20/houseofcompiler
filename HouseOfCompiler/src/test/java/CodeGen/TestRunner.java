package CodeGen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Helper.MockGenerator;
import Helper.ReflectLoader;
import Helper.Resources;
import common.Compiler;
import common.PrintableVector;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.Program;

@DisplayName("Bytecode Generation")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() {
        ClassDecl emptyClass = new ClassDecl("EmptyClass", new PrintableVector<>(), new PrintableVector<>(),
                new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(emptyClass);

        var tast = new Program(classDecls);

        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("EmptyClass");
        Object o;
        try {
            o = c.getDeclaredConstructor().newInstance();
            assertEquals(o.getClass().getName(), "EmptyClass");
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            fail(e.getLocalizedMessage());
        }
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
        var tast = new Program(classDecls);

        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("EmptyClassWithConstructor");
        Object o;
        try {
            o = c.getDeclaredConstructor().newInstance();
            assertEquals(o.getClass().getName(), "EmptyClassWithConstructor");
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("Constructor With Parameters")
    void constructorWithParameters() {
        Program tast = MockGenerator.getConstructorParameterTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ConstructorParams");
        Object o = null;
        try {
            o = c.getDeclaredConstructor(int.class).newInstance(1);
            assertEquals(o.getClass().getName(), "ConstructorParams");
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("Constructor With this. assign body")
    void constructorWithThisAssignBody() {
        Program tast = MockGenerator.getConstructorThisDotTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ConstructorThisDot");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var i = loader.getField("ConstructorThisDot", "i");
            var ivalue = i.get(o);
            assertEquals(5, ivalue);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("ClassFields - autoAccess")
    void classFieldsAuto() {
        Program tast = MockGenerator.getAutoClassFieldAst();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            var autoAccess = loader.getField("AutoAccessModifierField", "autoAccess");
            System.out.println(autoAccess.getModifiers());
            assertEquals(0, autoAccess.getModifiers());

        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("ClassFields - privateAccess")
    void classFieldsPrivate() {
        Program tast = MockGenerator.getClassFieldsTast();
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
        Program tast = MockGenerator.getClassFieldsTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            var autoAccess = loader.getField("ClassFields", "publicAccess");
            assertEquals(Modifier.PUBLIC, autoAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("ClassFields - protectedAccess")
    void classFieldsProtected() {
        Program tast = MockGenerator.getClassFieldsTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        try {
            var autoAccess = loader.getField("ClassFields", "protectedAccess");

            assertEquals(Modifier.PROTECTED, autoAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("VoidMethod")
    void voidMethod() {
        Program tast = MockGenerator.getVoidMethodTast();

        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);

        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("VoidMethod");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var m = loader.getMethod("VoidMethod", "foo");
            m.invoke(o);
            assertEquals("foo", m.getName());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("RealConstructor")
    void realConstructor() {
        Program tast = MockGenerator.getRealConstructorTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("RealConstructor");
        try {
            int randomI = 2;
            var constructor = c.getDeclaredConstructor(int.class);
            Object o = constructor.newInstance(randomI);
            var i = loader.getField("RealConstructor", "i");
            int ivalue = (int) i.get(o);
            assertEquals(randomI, ivalue);
        } catch (NoSuchFieldException e) {
            fail("No such field");
        } catch (Exception e) {
            fail(e.getCause());
        }
    }

    @Test
    @DisplayName("MethodCall")
    void methodCall() {
        Program tast = MockGenerator.getMethodCallTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
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
    @DisplayName("MiniLinkedList")
    void miniLinkedList() {
        Program program = Resources.getProgram("SimpleTests/MiniLinkedList.java");

        System.out.println(program);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
    }

    @Test
    @DisplayName("SystemOutPrintln Test")
    void systemOutPrintlnTest() {
        Program tast = MockGenerator.getSystemOutPrintlnTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("SystemOutPrintln");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var m = loader.getMethod("SystemOutPrintln", "foo");
            m.invoke(o);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("SystemOutPrintlnString Test")
    void systemOutPrintlnStringTest() {
        Program tast = MockGenerator.getSystemOutPrintStringTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("SystemOutPrintlnString");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var m = loader.getMethod("SystemOutPrintlnString", "foo");
            m.invoke(o);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("MainMethodTest")
    void mainMethodTest() {
        Program tast = MockGenerator.getMainMethodTestTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("MainMethodTest");
        try {
            var m = c.getMethod("main", String[].class);
            m.invoke(null, new Object[] { new String[] {} });
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
