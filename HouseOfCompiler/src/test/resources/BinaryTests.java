class BinaryTests{

    private int a,b,c;

    public int pvs() {
        return a+b*c;
    }

    public int klammern() {
        return a * (b+c);
    }

    public int modulo(){
        return a%b;
    }

    public boolean avo() {
        return a || b && c;
    }

    public boolean binary() {
        return a == b && !c;
    }

    public int endBoss() {
        return (a%c) + b / (a * a) * a + a - (c-b/a) && b-c;
    }

}