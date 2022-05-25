class IncDecStressTest {

    int incrementThenReturn(int i) {
        return ++i;
    }

    int returnThenIncrement(int i) {
        return i++;
    }

    int decrementThenReturn(int i) {
        return --i;
    }

    int returnThenDecrement(int i) {
        return i--;
    }

    int callInline(int i) {
        i++;
        return i;
    }

}
