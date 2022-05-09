package syntaxtree.structure;

import common.Type;
import syntaxtree.ParameterDecl;

import java.util.Vector;

public class ConstructorDecl {

    private Type type;
    private Vector<ParameterDecl> parameterDeclarations;
    private Block statement;

}
