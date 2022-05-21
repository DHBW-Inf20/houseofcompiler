class MultipleClassesMethodCalls {

    public int main(int i) {
        Test t = new Test(i);
        return t.getX();
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