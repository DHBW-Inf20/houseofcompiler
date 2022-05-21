class SelfReference {

    SelfReference selfRef;

    int foo() {
        return this.baz();
    }

    int baz() {
        return 10;
    }

    int bar() {
        SelfReference self = new SelfReference();
        int i = self.foo();
        return self.selfRef.foo();
    }

}
