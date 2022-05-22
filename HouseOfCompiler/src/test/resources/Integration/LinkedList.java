class LinkedList {

    private int value;
    private LinkedList next;
    public int size;

    public LinkedList(int value) {
        this.value = value;
        size = 1;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public LinkedList getNode(int i) {
        if (i == 0) {
            return this;
        } else {
            return this.next.getNode(i - 1);
        }
    }

    public void swap(int i, int j) {
        int temp = getNode(i).get();
        getNode(i).set(getNode(j).get());
        getNode(j).set(temp);
    }

    public void add(int value) {
        size = size + 1;
        if (this.next == null) {
            this.next = new LinkedList(value);

        } else {
            this.next.add(value);
        }
    }

    public void print() {
        System.out.print(this.value);
        if (this.next != null) {
            this.next.print();
        } else {
            System.out.println();
        }
    }

}

class Executer {

    void foo() {
        System.out.println('c');
        LinkedList list = new LinkedList(3);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(4);
        list.print();
        sort(list).print();
    }

    LinkedList sort(LinkedList list) {

        int i = 0;
        int j = 0;
        while (i < list.size - 1) {
            j = 0;
            while (j < list.size - 1) {
                if (list.getNode(j).get() > list.getNode(j + 1).get()) {
                    list.swap(j, j + 1);
                }
                j = j + 1;
            }
            i = i + 1;
        }

        return list;

    }

}