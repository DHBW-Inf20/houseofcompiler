class MethodCallParams {

    char c;

    public MethodCallParams() {
        this.c = foo('a');
    }

    char foo(char c) {
        return c;
    }

}
