package visitor;


import common.Type;
import syntaxtree.statementexpression.Assign;
import syntaxtree.structure.*;

public interface SemanticVisitor {
    Type visit(Program program);

    Type visit(ClassDecl clazz);

    Type visit(FieldDecl field);

    Type visit(ConstructorDecl constructor);

    Type visit(MethodDecl method);

    Type visit(Assign assign);

    Type visit(MethodParameter methodParameter);
}