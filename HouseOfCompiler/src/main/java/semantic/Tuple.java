package semantic;

public class Tuple<X, Y> {
    private X first;
    private Y second;

    public Tuple (X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }
}