class ClassStress{

    private int x = 100;

    public ClassStress(int x){
        this.x = x*2%2+x/10 % 100*x;
    }

}

class ClassStress2{

    private int x = 2;
    private boolean b = true;
    private ClassStress cd = new ClassStress(3);

    public ClassStress2(int x, ClassStress cs, boolean b){
        this.x = x;
        this.b = b;
        this.cs = cs
    }

    public ClassStress2(int x){
        this.x = x;
    }

    public foo(){
        return new ClassStress2(1, new ClassStress(this.cd.x), this.b);
    }

}