import common.Operator;

class OperatorTest{

    private x;

    public OperatorTest(){}

    public OperatorTest(int x){
        this.x = x;
    }

    public int assign(int i){
        int returnValue;
        returnValue = i;
        return returnValue;
    }

    public int plus(int x, int y){
        return x+y;
    }

    public int minus(int x, int y){
        return x-y;
    }

    public int mult(int x, int y){
        return x*y;
    }

    public int div(int x, int y){
        return x/y;
    }

    public boolean gt(int x, int y){
        return x>y;
    }

    public boolean lt(int x, int y){
        return x<y;
    }

    public boolean lte(int x, int y){
        return x<=y;
    }

    public boolean gte(int x, int y){
        return x>=y;
    }

    public boolean eq(int x, int y){
        return x == y;
    }

    public neq(int x, int y){
        return x != y;
    }

    public and(boolean x, boolean y){
        return x && y;
    }

    public or(boolean x, boolean y){
        return x || y;
    }




}