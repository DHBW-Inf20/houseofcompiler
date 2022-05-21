class LinkedList {

    private int value;
    private LinkedList next;

    public LinkedList(int value) {
        this.value = value;
    }

    public int get(int i) {
        if (i == 0) {
            return this.value;
        } else {
            return this.next.get(i - 1);
        }
    }

    public void add(int value) {
        if (this.next == null) {
            this.next = new LinkedList(value);
        } else {
            this.next.add(value);
        }
    }

}
