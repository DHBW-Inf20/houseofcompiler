package common;

import common.Type;

public class ReferenceType extends Type {

//    private String identifier;

    public ReferenceType(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return (String) identifier;
    }
}
