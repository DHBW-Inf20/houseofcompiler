class SelfReference {

    SelfReference selfRef;

    void foo() {
        SelfReference self = new SelfReference();
    }

    void bar() {
        SelfReference self = new SelfReference();
        self.foo();
    }

}
