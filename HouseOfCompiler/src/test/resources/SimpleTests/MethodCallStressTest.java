class MethodCallStressTest {

    void foo() {
        int i = baz();
        while (i < 10) {
            baz();
            bar();
            i = i + baz();
        }

        i = baz() - baz();
        i = baz() + baz();

        if (boo()) {
            i = baz();
        } else {
            i = baz();
        }
    }

    void bar() {
    }

    int baz() {
        return 1;
    }

    boolean boo() {
        return true;
    }

}
