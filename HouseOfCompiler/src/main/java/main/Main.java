package main;

import common.Compiler;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a fileName to compile");
            return;
        }
        if (args.length == 1 && args[0].endsWith(".class")) {
            Compiler.getFactory().runCode(args[0]);
        } else if (args.length == 1 && args[0].endsWith(".java")) {
            Compiler.getFactory().compile(args[0], ".");
        } else {
            Compiler.getFactory().compile(args[0], args[1]);
        }
    }

}
