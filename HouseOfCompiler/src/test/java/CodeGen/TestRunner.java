package CodeGen;

import Helper.MockGenerator;
import Helper.ReflectLoader;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.Program;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import common.PrintableVector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Bytecode Generation")
public class TestRunner {


    @Test
    @DisplayName("Empty Class")
    void main() {
        ClassDecl emptyClass = new ClassDecl("EmptyClass", new PrintableVector<>(),new PrintableVector<>(),new PrintableVector<>());
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
    void emptyClassWithConstructor()  {
        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),new PrintableVector<>(),constructors);
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
    void classFieldsAuto(){
        Program tast = MockGenerator.getAutoClassFieldAst();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("AutoAccessModifierField");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var autoAccess = loader.getField("AutoAccessModifierField", "autoAccess");
            System.out.println(autoAccess.getModifiers());
            assertEquals(0,autoAccess.getModifiers());

        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("ClassFields - privateAccess")
    void classFieldsPrivate(){
        Program tast = MockGenerator.getClassFieldsTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ClassFields");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var autoAccess = loader.getField("ClassFields", "privateAccess");
            
            assertEquals(Modifier.PRIVATE,autoAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("ClassFields - publicAccess")
    void classFieldsPublic(){
        Program tast = MockGenerator.getClassFieldsTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ClassFields");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var autoAccess = loader.getField("ClassFields", "publicAccess");
            
            assertEquals(Modifier.PUBLIC,autoAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("ClassFields - protectedAccess")
    void classFieldsProtected(){
        Program tast = MockGenerator.getClassFieldsTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ClassFields");
        Object o = null;
        try {
            o = c.getDeclaredConstructor().newInstance();
            var autoAccess = loader.getField("ClassFields", "protectedAccess");
            
            assertEquals(Modifier.PROTECTED,autoAccess.getModifiers());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }

    }


    @Test
    @DisplayName("VoidMethod")
    void voidMethod(){
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

}
