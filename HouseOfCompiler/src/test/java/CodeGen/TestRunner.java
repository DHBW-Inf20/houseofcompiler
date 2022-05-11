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
import common.PrintableVector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Bytecode Generation")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() throws ReflectiveOperationException {
        ClassDecl emptyClass = new ClassDecl("EmptyClass", new PrintableVector<>(),new PrintableVector<>(),new PrintableVector<>());
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(emptyClass);


        var tast = new Program(classDecls);

        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("EmptyClass");
        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals(o.getClass().getName(), "EmptyClass");
    }

    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor() throws ReflectiveOperationException {
        PrintableVector<ConstructorDecl> constructors = new PrintableVector<>();
        constructors.add(new ConstructorDecl());
        ClassDecl classDecl = new ClassDecl("EmptyClassWithConstructor", new PrintableVector<>(),new PrintableVector<>(),constructors);
        PrintableVector<ClassDecl> classDecls = new PrintableVector<>();
        classDecls.add(classDecl);
        var tast = new Program(classDecls);

        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("EmptyClassWithConstructor");
        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals(o.getClass().getName(), "EmptyClassWithConstructor");
    }

    @Test
    @DisplayName("Constructor With Parameters")
    void constructorWithParameters() {
        Program tast = MockGenerator.getConstructorParameterTast();
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("ConstructorParams");
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
        Class c = loader.findClass("ConstructorThisDot");
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

}
