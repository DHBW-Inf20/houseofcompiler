class OperatorTest {

    public OperatorTest() {
    }

    public int assign(int i) {
        int returnValue;
        returnValue = i;
        return returnValue;
    }

    public int plus(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int mult(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean gt(int x, int y) {
        return x > y;
    }

    public boolean lt(int x, int y) {
        return x < y;
    }

    public boolean lte(int x, int y) {
        return x <= y;
    }

    public boolean gte(int x, int y) {
        return x >= y;
    }

    public boolean eq(int x, int y) {
        return x == y;
    }

    public boolean neq(int x, int y) {
        return x != y;
    }

    public boolean beq(boolean x, boolean y) {
        return x == y;
    }

    public boolean bneq(boolean x, boolean y) {
        return x != y;
    }

    public boolean and(boolean x, boolean y) {
        return x && y;
    }

    public boolean or(boolean x, boolean y) {
        return x || y;
    }

    public boolean not(boolean x) {
        return !x;
    }

    public boolean icEq(int x, char y) {
        return x == y;
    }

    public boolean icLt(int x, char y) {
        return x < y;
    }

}