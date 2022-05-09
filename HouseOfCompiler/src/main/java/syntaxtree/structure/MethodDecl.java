package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.Block;

import java.util.Vector;

public class MethodDecl {

    private String identifier;
    private Type type;
    private Vector<MethodParameter> parameterDeclaractions;
    private Block statement;
    private AccessModifier accessModifier;
}
