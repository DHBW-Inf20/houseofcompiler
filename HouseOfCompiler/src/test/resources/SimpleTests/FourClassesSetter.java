class FourClassesSetter {

    public int setFieldTest(int i) {
        Test t = new Test(i);
        Test2 t2 = new Test2(t.y);
        t2.test.test3.setY(i);

        return t2.test.test3.getY();
    }

}

class Test {
    private int x;
    public int y;
    public Test3 test3;

    public Test(int i) {
        this.x = i;
        this.y = 10;
        this.test3 = new Test3(i * 2);
    }

    public Test3 getTest3() {
        return this.test3;
    }

    public int getX() {
        return this.x;
    }
}

class Test2 {
    public Test test;

    public Test2(int i) {
        this.test = new Test(i);
    }

}

class Test3 {
    public int x;

    private int y;

    public Test3(int i) {
        this.x = i;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}