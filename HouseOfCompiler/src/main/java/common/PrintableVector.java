package common;

import java.util.Vector;

public class PrintableVector<T> extends Vector<T> {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<elementData.length;i++){
            if(elementData[i] != null){
                sb.append(i + ": ").append(elementData[i]).append("\n");
            }
        }
        for(Object el:this.elementData){
            if(el != null){
            sb.append(el);
            }
        }
        return sb.toString();
    }
}
