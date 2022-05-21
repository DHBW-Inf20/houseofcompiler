class MultipleClassesStress {

    public int main(int i) {
        Test t = new Test(i);
        return t.getX() + t.y;
    }

}

class Test {
    private int x;
    public int y;

    public Test(int i) {
        this.x = i;
        this.y = 10;
    }

    public int getX() {
        return this.x;
    }
}