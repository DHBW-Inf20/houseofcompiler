package common;

public enum Primitives {
    VOID("void"),
    INT("int"),
    CHAR("char"),
    BOOL("boolean");

    private final String name;

    private Primitives(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

}
