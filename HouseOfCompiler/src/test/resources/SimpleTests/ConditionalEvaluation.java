class ConditionalEvaluation {

    boolean foo() {
        System.out.println("foo");
        return true || bar();
    }

    boolean bar() {
        System.out.println("bar");

        return true && foo();
    }

}
