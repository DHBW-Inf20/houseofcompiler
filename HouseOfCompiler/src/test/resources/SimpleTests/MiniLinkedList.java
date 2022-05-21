class MiniLinkedList {

    int main() {
        LinkedList list = new LinkedList(1);
        return 1;
    }

}

class LinkedList {

    int x;
    private LinkedList next;

    public LinkedList(int x) {
        this.x = x;
    }

    void add(int x) {
        next = new LinkedList(x);
    }

}
