class DuplicateMethod {

    public void foo() {
        System.out.println('f');
    }

    private void foo() {
        System.out.println('f');
    }

}
