package common;

import common.Primitives;
import common.Type;

public class BaseType extends Type {
//    private Primitives identifier;

    public BaseType(Primitives identifier) {
        this.identifier = identifier;
    }

    public Primitives getIdentifier() {
        return (Primitives) this.identifier;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(identifier.toString());
        return sb.toString();
    }
}
