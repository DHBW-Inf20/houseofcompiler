package CodeGen;

import Helper.ReflectLoader;
import common.Compiler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Bytecode Generation")
public class TestRunner {

    @Test
    @DisplayName("Empty Class")
    void main() throws ReflectiveOperationException {
        ClassDecl emptyClass = new ClassDecl("EmptyClass", new Vector<>(),new Vector<>(),new Vector<>());
        Vector<ClassDecl> classDecls = new Vector<>();
        classDecls.add(emptyClass);


        var tast = new Program(classDecls);

        var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
        ReflectLoader loader = new ReflectLoader(bc);
        Class c = loader.findClass("EmptyClass");
        Object o = c.getDeclaredConstructor().newInstance();
        assertEquals(o.getClass().getName(), "EmptyClass");
    }

}
