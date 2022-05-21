package Main;

import common.Compiler;

public class Main {

    public static void main(String[] args) {
        boolean a = true;
        a = !a;
        System.out.println(args);
        if (args.length == 0) {
            System.out.println("Please provide a fileName to compile");
            return;
        }
        if (args.length == 1) {
            Compiler.getFactory().compile(args[0], ".");
        } else {
            Compiler.getFactory().compile(args[0], args[1]);
        }
    }

}
