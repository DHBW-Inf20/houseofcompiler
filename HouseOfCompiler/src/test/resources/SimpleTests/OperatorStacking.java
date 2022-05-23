class OperatorStacking {

    boolean foo() {
        return true && false || true && true; // Should return true
    }

    int bar() {
        return 1 + 2 * 3 - 4 % 6; // Should return 3
    }
    // 1 + 6 - 4 % 6
    // 7 - 4 % 6
    // 3 % 6 = 3

    // 1 + 6 - 4 % 6
    // 1 + 6 - 4
    // 7-4
    // 3

}
