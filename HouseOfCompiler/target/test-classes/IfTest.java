class IfTest{

    public int ifTest(){
        if(true){
            return 1;
        }
        return 0;
    }

    public int ifElseTest(){
        if(true){
            return 1;
        }else{
            return 0;
        }
    }

    public int ifElseIfTest(){
        if(false){
            return 0;
        }else if(true){
            return 1;
        }else{
            return 0;
        }
    }

}