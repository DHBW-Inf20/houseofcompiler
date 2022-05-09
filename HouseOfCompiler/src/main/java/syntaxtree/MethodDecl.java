package syntaxtree;

import java.util.Vector;

public class MethodDecl {

    private String identifier;
    private Type type;
    private Vector<ParameterDecl> parameterDeclaractions;
    private Statement statement;
    private AccessModifier accessModifier;
}
