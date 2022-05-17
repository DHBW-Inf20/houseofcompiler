package All;

import Helper.Resources;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;
import Helper.ReflectLoader;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("All")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() throws Exception {
        InputStream file = Resources.getFileAsStream("SimpleTests/EmptyClass.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("EmptyClass");

        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals("EmptyClass", o.getClass().getName());
    }


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
    void classFieldsPrivate(){
        Program program = Resources.getProgram("SimpleTests/ClassFields.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ClassFields");
            try {
                Object o = c.getDeclaredConstructor().newInstance();
                var autoAccess = loader.getField("ClassFields", "privateAccess");
                
                assertEquals(Modifier.PRIVATE,autoAccess.getModifiers());
            } catch (Exception e) {
            fail(e.getLocalizedMessage());
              }
    }

    @Test
    @DisplayName("ClassFields - publicAccess") 
    void classFieldsPublic(){
        Program program = Resources.getProgram("SimpleTests/ClassFields.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ClassFields");
            try {
                Object o = c.getDeclaredConstructor().newInstance();
                var publicAccess = loader.getField("ClassFields", "publicAccess");
                
                assertEquals(Modifier.PUBLIC,publicAccess.getModifiers());
            } catch (Exception e) {
            fail(e.getLocalizedMessage());
              }
    }

    @Test
    @DisplayName("ClassFields - protectedAccess") 
    void classFieldsProtected(){
        Program program = Resources.getProgram("SimpleTests/ClassFields.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ClassFields");
            try {
                Object o = c.getDeclaredConstructor().newInstance();
                var protectedAccess = loader.getField("ClassFields", "protectedAccess");
                assertEquals(Modifier.PROTECTED,protectedAccess.getModifiers());
            } catch (Exception e) {
            fail(e.getLocalizedMessage());
              }
    }

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
        assertEquals("Comments", lorem.getType());
    }

    @Test
    @DisplayName("Constructor With Parameters")
    void constructorWithParameters(){
        Program program = Resources.getProgram("SimpleTests/ConstructorParams.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("ConstructorParams");
        try {
            Object o = c.getDeclaredConstructor(int.class, String.class).newInstance(1);
            assertEquals("ConstructorParams", o.getClass().getName());
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

    @Test
    @DisplayName("Constructor with this. assign body")
    void constructorWithThisAssignBody(){
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
    void voidMethod(){
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
    void realConstructor(){
        Program program = Resources.getProgram("SimpleTests/RealConstructor.java");
        Program tast = Compiler.getFactory().getTastAdapter().getTast(program);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class<?> c = loader.findClass("RealConstructor");
        try {
            int randomI = new Random(new Date().getTime()).nextInt(0, 200);
            Object o = c.getDeclaredConstructor(int.class).newInstance(randomI);
            var i = loader.getField("RealConstructor", "i");
            var ivalue = i.get(o);
            assertEquals(randomI, ivalue);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
    }

}
