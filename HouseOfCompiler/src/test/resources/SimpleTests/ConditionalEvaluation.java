class ConditionalEvaluation {

    boolean foo() {
        System.out.print('f');
        System.out.print('o');
        System.out.println('o');
        return true || bar();
    }

    boolean bar() {
        System.out.print('b');
        System.out.print('a');
        System.out.println('r');
        return true && foo();
    }

}
