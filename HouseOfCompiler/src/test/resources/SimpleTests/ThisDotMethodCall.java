class ThisDotMethodCall {

    int i;

    public ThisDotMethodCall() {
        this.i = this.foo();
    }

    int foo() {
        return 1;
    }

}
