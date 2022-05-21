class MultipleClassesMethodCalls {

    public int main(int i) {
        t = new Test(i);
        return 1;
    }

}

class Test {
    public int x;

    public Test(int i) {
        this.x = i;
    }

    public int getX() {
        return this.x;
    }
}