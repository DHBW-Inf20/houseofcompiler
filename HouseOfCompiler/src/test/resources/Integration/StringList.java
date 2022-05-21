class StringList {

    private char value;
    private StringList next;

    public StringList() {
    }

    public StringList(char c) {
        value = c;
    }

    public char get(int i) {
        if (i == 0) {
            return value;
        } else {
            return next.get(i - 1);
        }
    }

    public void add(char value) {
        if (next == null) {
            next = new StringList(value);
        } else {
            this.next.add(value);
        }
    }

    public int length() {
        if (next == null) {
            return 1;
        } else {
            return 1 + next.length();
        }
    }

}
