class MethodCallParams {
    
    int i;

    public MethodCallParams(int i){
        this.i = foo(i);
    }

    private int foo(int i) {
        return i;
    }


}
