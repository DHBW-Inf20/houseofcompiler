class Stack {

    private int value;
    private Stack next;
    public int size;

    public Stack(int value) {
        this.value = value;
        size = 1;
    }

    public int peek(int i) {
        if (i == 0) {
            return this.value;
        } else {
            return this.next.peek(i - 1);
        }
    }

    public void push(int value) {
        size = size + 1;
        if (this.next == null) {
            this.next = new Stack(value);

        } else {
            this.next.push(value);
        }
    }

    public int pop() {
        size = size - 1;
        if (this.next == null) {
            return this.value;
        } else {
            return this.next.pop();
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
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.print();
        // // Write "peek(0)" here with chars
        System.out.print("peek(0): ");
        System.out.println(stack.peek(0));

        // Write "pop()" here with chars
        System.out.print("pop(): ");

        System.out.println(stack.pop());
        stack.print();
    }

}