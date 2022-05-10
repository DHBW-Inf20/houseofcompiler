class TwoClassesFilled{

    private int i;
    public int a = 4;

    public TwoClassesFilled(int i){
        this.i = i;
    }

}


class TwoClassesFilled2{

    private TwoClassesFilled a;

    public TwoClassesFilled2(int a){
        this.a = new TwoClassesFilled(a);
    }

    public int get(){
        return this.a.a;
    }

}