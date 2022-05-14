package codegen.utils;


import java.util.Stack;
import java.util.Vector;

public class LocalVarStack extends Vector<String> {

    private Stack<Integer> pointers;

    public LocalVarStack() {
        super();
        pointers = new Stack<>();
    }

    private void setStackPointer(int stackPointer) {
        setSize(stackPointer);
    }

    public int getStackPointer() {
        return size();
    }

    public int push(String identifier) {
        addElement(identifier);
        return getStackPointer() - 1;
    }

    public void startBlock() {
        pointers.push(getStackPointer());
    }

    public void endBlock() {
        setStackPointer(pointers.pop());
    }

    public int get(String identifier) {
        return lastIndexOf(identifier);
    }
}
