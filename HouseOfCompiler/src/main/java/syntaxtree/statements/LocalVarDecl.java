package syntaxtree.statements;

import common.Type;

import java.util.Objects;

public class LocalVarDecl implements IStatement{

    Type type;
    String identifier;

    public LocalVarDecl(String identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalVarDecl that = (LocalVarDecl) o;
        return Objects.equals(type, that.type) && identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, identifier);
    }
}
