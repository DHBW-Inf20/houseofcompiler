package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import common.Compiler;
import semantic.exceptions.SemanticError;

public class Testing {

    public static void main(String[] args) {
        // Define the escape codes for colors
        String fileName = "Test.java";

        String className = fileName.substring(0, fileName.length() - 5);
        try {
            ClassLoader classLoader = Testing.class.getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            var ast = Compiler.getFactory().getAstAdapter().getAst(new FileInputStream(file));
            var tast = Compiler.getFactory().getTastAdapter().getTast(ast);
            System.out.println("Generierter TAST:");
            System.out.println(tast);
            Compiler.getFactory().compileTest(fileName);
            var bc = Compiler.getFactory().getProgramGenerator().generateBytecode(tast);
            ReflectLoader loader = new ReflectLoader(bc);
            Class<?> c = loader.findClass(className);
            Object o;

            o = loader.getConstructor(className).newInstance();
            var mainMethod = loader.getMethod(className, "main");
            System.out.println("\n\nOutput der main-Methode:\n");
            System.out.println(mainMethod.invoke(o));
        } catch (SemanticError e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
