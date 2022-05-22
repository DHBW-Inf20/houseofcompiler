package main;

import common.Compiler;

public class Runner {

    public static void main(String[] args) {
        if (args.length == 0 && args[0].endsWith(".class")) {
            System.out.println("Please provide a .class-File to run");
            return;
        }
        Compiler.getFactory().runCode(args[0]);
    }

}
