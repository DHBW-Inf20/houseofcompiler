package visitor;


import common.Type;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.*;

public interface SemanticVisitor {
    Type visit(Program toCheck);

    Type visit(ClassDecl toCheck);

    Type visit(FieldDecl toCheck);

    Type visit(ConstructorDecl toCheck);

    Type visit(MethodDecl toCheck);



    Type visit(Assign toCheck);

    Type visit(MethodParameter toCheck);


    Type visit(WhileStmt whileStmt);

    Type visit(ReturnStmt returnStmt);

    Type visit(LocalVarDecl localVarDecl);

    Type visit(IfStmt ifStmt);

    Type visit(Block block);

    Type visit(NewDecl newDecl);

    Type visit(MethodCall methodCall);

    Type visit(Unary unary);

    Type visit(This aThis);

    Type visit(Null aNull);

    Type visit(LocalOrFieldVar localOrFieldVar);

    Type visit(IntegerExpr integerExpr);

    Type visit(InstVar instVar);

    Type visit(CharExpr charExpr);

    Type visit(BoolExpr boolExpr);

    Type visit(Binary binary);
}