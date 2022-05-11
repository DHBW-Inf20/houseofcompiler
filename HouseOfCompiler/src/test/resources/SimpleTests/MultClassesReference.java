class MultClassesReference1 {
 
    public int i;

    public MultClassesReference1(int i){
        this.i = i;
    }
   
    
}

class MultClassesReference2 {
    
    public MultClassesReference1 bar;

    public MultClassesReference2(int i){
        this.bar = new MultClassesReference1(i);
    }

    int test(){
        return this.bar.i;
    }

}