class ValueAdapterTests {

    boolean readsTrue() {
        return true;
    }

    boolean readsFalse() {
        return false;
    }

    boolean readsTrueAndFalse() {
        return true && false;
    }

    int readsInt() {
        return 1;
    }

    int readsIntAndInt() {
        return 1 + 1;
    }

    char readsChar() {
        return 'a';
    }

}
