class MethodCallsInWhile {

    void main() {
        int i = 0;
        Test t = new Test();
        t.foo();
        while (i < 10) {
            i = i + t.foo();
            t.foo(); // <-- This is causing the error
        }

    }

}

class Test {

    int foo() {
        return 1;
    }
}
