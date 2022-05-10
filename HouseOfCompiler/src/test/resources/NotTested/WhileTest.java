class WhileTest{

    public void infinite(){
        while(true){}
    }

    public int ten(){
        int i = 0;
        int counter = 10;
        while(counter>0){
            i = i+1;
            counter = counter - 1;
        }
        return i;
    }

}