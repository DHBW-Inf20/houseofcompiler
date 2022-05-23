class AndVorOr {

    boolean foo(boolean a, boolean b, boolean c) {
        return a && b || c && b;
    }

    boolean bar(boolean a, boolean b, boolean c) {
        return a || b && c || b && c;
    }

}
