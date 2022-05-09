package syntaxtree.structure;

import common.AccessModifier;
import common.Type;
import syntaxtree.Block;
import syntaxtree.ParameterDecl;

import java.util.Vector;

public class MethodDecl {

    private String identifier;
    private Type type;
    private Vector<ParameterDecl> parameterDeclaractions;
    private Block statement;
    private AccessModifier accessModifier;
}
