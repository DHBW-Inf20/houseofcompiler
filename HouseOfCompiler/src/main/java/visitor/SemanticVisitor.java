package visitor;


import common.Type;
import syntaxtree.statementexpression.Assign;
import syntaxtree.structure.*;

public interface SemanticVisitor {
    Type visit(Program toCheck);

    Type visit(ClassDecl toCheck);

    Type visit(FieldDecl toCheck);

    Type visit(ConstructorDecl toCheck);

    Type visit(MethodDecl toCheck);

    Type visit(Assign toCheck);

    Type visit(MethodParameter toCheck);
}