package main;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import common.Compiler;
import syntaxtree.structure.Program;

public class Resources {

    /**
     * @param fileName
     * @return Program
     */
    public static Program getProgram(String fileName) {
        return Compiler.getFactory().getAstAdapter().getAst(getFileAsStream(fileName));
    }

    /**
     * @param fileName
     * @return InputStream
     */
    public static InputStream getFileAsStream(String fileName) {
        ClassLoader classLoader = Resources.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        assertNotNull(file);
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fail();
        }

        throw new IllegalStateException();
    }

}
