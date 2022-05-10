class ggt{

    private int a;
    private int b;

    public ggt(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calculate(){
        int c;
        int a = this.a;
        int b = this.b;
        while ( b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}