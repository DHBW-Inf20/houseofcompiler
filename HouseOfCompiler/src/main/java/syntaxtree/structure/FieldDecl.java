package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.Expression;

import java.util.Vector;

public class FieldDecl {

    private String identifier;
    private AccessModifier accessmodifier;
    private Vector<Expression> expressions;
    private Type type;

}
