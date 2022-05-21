class SystemOutPrintln {

    void foo() {
        System.out.println('c');
        System.out.print('c');
        System.out.print('d');
        System.out.println();
    }

    void bar() {
        System.out.println(100);
    }

    void baz() {
        System.out.println(true);
    }

    void errorTest() {
        System.err.println('a');
    }

}
