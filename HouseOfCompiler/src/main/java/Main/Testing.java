package Main;

import common.Compiler;
import semantic.exceptions.SemanticError;

public class Testing {

    public static void main(String[] args) {
        // Define the escape codes for colors

        try {
            Compiler.getFactory().compileTest("Test.java");
        } catch (SemanticError e) {
            System.err.println(e.getMessage());
        }
    }
}
