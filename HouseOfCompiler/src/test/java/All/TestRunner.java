package All;

import Helper.Resources;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;
import Helper.ReflectLoader;

import java.io.InputStream;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("All")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() throws Exception {
        InputStream file = Resources.getFileAsStream("EmptyClass.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(ast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("EmptyClass");

        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals("EmptyClass", o.getClass().getName());
    }


    @Test
    @DisplayName("EmptyClassWithConstructor")
    void emptyClassWithConstructor() throws Exception {
        InputStream file = Resources.getFileAsStream("EmptyClassWithConstructor.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(ast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("EmptyClassWithConstructor");

        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals("EmptyClassWithConstructor", o.getClass().getName());
    }

    @Test
    @DisplayName("Comments")
    void comments() throws Exception {
        InputStream file = Resources.getFileAsStream("Comments.java");
        Program ast = Compiler.getFactory().getAstAdapter().getAst(file);
        Program tast = Compiler.getFactory().getTastAdapter().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(ast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("Comments");
        Field lorem = loader.getField(c.getName(), "lorem");
        assertEquals("Comments", lorem.getType());
    }

}
