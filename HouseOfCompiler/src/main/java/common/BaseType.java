package common;

public class BaseType implements Type {
    private Primitives identifier;

    public BaseType(Primitives identifier) {
        this.identifier = identifier;
    }

    /**
     * @return Primitives
     */
    public Primitives getIdentifier() {
        return (Primitives) this.identifier;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(identifier.toString());
        return sb.toString();
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        return result;
    }

    /**
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseType other = (BaseType) obj;
        if (identifier != other.identifier)
            return false;
        return true;
    }

}
