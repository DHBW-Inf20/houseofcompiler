class IncTest {

    void foo() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    void bar() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
    }

}
