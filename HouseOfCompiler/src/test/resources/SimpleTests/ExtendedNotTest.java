class ExtendedNotTest {

    boolean notequal(int a, int b) {
        return !(a == b);
    }

    boolean multiple(boolean a, boolean b) {
        return !(!a || b);
    }

    boolean notWithAssigns(boolean a) {
        boolean b = !a;
        return !b;
    }

}
