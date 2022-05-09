package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.expressions.IExpression;

import java.util.Objects;


public class FieldDecl {

    private String identifier;
    private AccessModifier accessModifier;
    private IExpression expressions;
    private Type type;

    public FieldDecl(String identifier, AccessModifier accessModifier, IExpression expressions) {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.expressions = expressions;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public IExpression getExpressions() {
        return expressions;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldDecl fieldDecl = (FieldDecl) o;
        return identifier.equals(fieldDecl.identifier) && accessModifier == fieldDecl.accessModifier && expressions.equals(fieldDecl.expressions) && Objects.equals(type, fieldDecl.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, accessModifier, expressions, type);
    }
}
