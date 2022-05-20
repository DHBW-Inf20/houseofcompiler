package common;

public class ReferenceType implements Type {

    private String identifier;

    public int line;
    public int column;

    public ReferenceType(String identifier) {
        this.identifier = identifier;
    }

    public ReferenceType(String identifier, int line, int column) {
        this.identifier = identifier;
        this.line = line;
        this.column = column;
    }

    /**
     * @return String
     */
    public String getIdentifier() {
        return (String) identifier;
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
        ReferenceType other = (ReferenceType) obj;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        return true;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return identifier;
    }

}
