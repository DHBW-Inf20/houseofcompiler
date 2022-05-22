class StringList {

    private char value;
    private StringList next;

    public StringList() {
    }

    public StringList(char c) {
        this.value = c;
    }

    public char get(int i) {
        if (i == 0) {
            return this.value;
        } else {
            return next.get(i - 1);
        }
    }

    public void add(char value) {
        if (next == null) {
            next = new StringList(value);
        } else {
            next.add(value);
        }
    }

    public int length() {
        if (this.next == null) {
            return 1;
        } else {
            return 1 + next.length();
        }
    }

    public void print() {
        System.out.print(this.value);
        if (this.next != null) {
            next.print();
        } else {
            System.out.println();
        }
    }

}
