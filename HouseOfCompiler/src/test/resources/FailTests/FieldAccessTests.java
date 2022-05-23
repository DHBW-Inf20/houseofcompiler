class FieldAccessTests {

    void foo() {
        AnotherClass clazz = new AnotherClass();
        int i = clazz.privateAccess;
    }

}

class AnotherClass {

    public int publicAccess;
    private int privateAccess;

    public AnotherClass() {
        publicAccess = 1;
        privateAccess = 2;
    }

}
