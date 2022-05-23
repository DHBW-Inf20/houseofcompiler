class MethodAccessTests {

    void foo() {
        AnotherClass clazz = new AnotherClass();
        clazz.foo();
    }

}

class AnotherClass {

    private void foo() {

    }

}
