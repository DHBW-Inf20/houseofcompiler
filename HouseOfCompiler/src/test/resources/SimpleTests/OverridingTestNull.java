class OverridingTestNull {

    // Test is used to determine wheter the Right method with the right types is
    // called

    public int foo(int i) {
        if (i < 5) {
            return test();
        } else if (i < 10) {
            return test(i);
        } else if (i < 20) {
            return test(this);
        } else {
            return test(null);
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

    public int test(OverridingTestNull o) {
        System.out.println(1337);
        return 1337;
    }

}
