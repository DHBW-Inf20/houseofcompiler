package common;

import java.util.Vector;

public class PrintableVector<T> extends Vector<T> {

    /**
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < elementCount; i++) {
            if (elementData[i] != null) {
                sb.append(i + ": ").append(elementData[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
