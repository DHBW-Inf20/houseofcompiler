// Local or Field or Imported var Test
class LOFOI {

    // This test is to determine wheter the order of finding the vars is correct

    int System;

    public LOFOI() {
        System = 10;
    }

    public int foo() {
        int System = 20;
        return System;
    }

    public int bar() {
        return System;
    }

    public int baz() {
        System.out.println('1');
    }

}

class OtherLOFOI {

    LOFOI System;

    void foo() {
        System.out.println('1');
    }

}