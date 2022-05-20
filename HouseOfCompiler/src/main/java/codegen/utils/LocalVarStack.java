package codegen.utils;

import java.util.Stack;
import java.util.Vector;

public class LocalVarStack extends Vector<String> {

    private Stack<Integer> pointers;

    public LocalVarStack() {
        super();
        pointers = new Stack<>();
    }

    /**
     * @param stackPointer
     */
    private void setStackPointer(int stackPointer) {
        setSize(stackPointer);
    }

    /**
     * @return int
     */
    public int getStackPointer() {
        return size();
    }

    /**
     * @param identifier
     * @return int
     */
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

    /**
     * @param identifier
     * @return int
     */
    public int get(String identifier) {
        return lastIndexOf(identifier);
    }
}
