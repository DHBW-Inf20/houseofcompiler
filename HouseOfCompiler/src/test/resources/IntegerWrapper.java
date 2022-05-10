class IntegerWrapper{

    public int i;

    public IntegerWrapper(int i){
        this.i = i;
    }

    public IntegerWrapper(){
        this.i = 0;
    }

    public IntegerWrapper Add(IntegerWrapper j){ return new IntegerWrapper(j.i+this.i)}

    public IntegerWrapper Sub(IntegerWrapper j){ return new IntegerWrapper(j.i-this.i)}

    public boolean equals(IntegerWrapper j){return j.i == this.i}


}