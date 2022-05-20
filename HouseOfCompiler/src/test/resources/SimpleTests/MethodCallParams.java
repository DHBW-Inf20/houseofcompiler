class MethodCallParams {

    int i;

    public MethodCallParams(int i) {
        this.i = foo(i);
    }

    int foo(int i) {
        return i;
    }

}
