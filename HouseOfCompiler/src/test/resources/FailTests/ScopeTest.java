class ScopeTest {

    int foo() {
        int x = 1;
        {
            int y = 1;
        }
        return y;
    }

    int bar() {
        int x = 1;
        {
            int y = 1;
            int x = 2;
        }
        int y = 1;
        return y;
    }

}
