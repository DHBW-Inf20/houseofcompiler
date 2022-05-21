class OverridingTestNullMultiple {

    // Test is used to determine wheter the Right method with the right types is
    // called

    public int foo(int i) {
        if (i < 5) {
            return test();
        } else if (i < 10) {
            return test(i);
        } else if (i < 20) {
            return test(this, null);
        } else if (i < 30) {
            return test(null, null);
        } else {
            return test(this, this);
        }
    }

    public int test() {
        System.out.println(0);
        return 0;
    }

    public int test(int i) {
        System.out.println(i);
        return i;
    }

    public int test(OverridingTestNullMultiple o, OverridingTestNullMultiple b) {
        System.out.println(1337);
        return 1337;
    }

}
