package syntaxtree;

import java.util.Vector;

public class FieldDecl {

    private String identifier;
    private AccessModifier accessmodifier;
    private Vector<Expression> expressions;
    private Type type;

}
