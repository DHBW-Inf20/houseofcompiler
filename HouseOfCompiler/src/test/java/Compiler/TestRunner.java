package Compiler;

import Helper.Resources;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.*;
import Helper.ReflectLoader;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Compiler")
public class TestEmptyClass {

    @Test
    @DisplayName("Empty Class")
    void main() throws Exception {
        InputStream file = Resources.getFileAsStream("EmptyClass.java");
        Program ast = Compiler.getFactory().getAstGenerator().getAst(file);
        Program tast = Compiler.getFactory().getTastGenerator().getTast(ast);
        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(ast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("EmptyClass");
        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals(o.getClass().getName(), "EmptyClass");
    }


}
