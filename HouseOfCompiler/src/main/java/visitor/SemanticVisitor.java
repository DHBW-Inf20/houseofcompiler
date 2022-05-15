package visitor;


import common.Type;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.*;

public interface SemanticVisitor {
    Program visit(Program toCheck);

    ClassDecl visit(ClassDecl toCheck);

    FieldDecl visit(FieldDecl toCheck);

    ConstructorDecl visit(ConstructorDecl toCheck);

    MethodDecl visit(MethodDecl toCheck);



    Assign visit(Assign toCheck);

    MethodParameter visit(MethodParameter toCheck);


    WhileStmt visit(WhileStmt whileStmt);

    ReturnStmt visit(ReturnStmt returnStmt);

    LocalVarDecl visit(LocalVarDecl localVarDecl);

    IfStmt visit(IfStmt ifStmt);

    Block visit(Block block);

    NewDecl visit(NewDecl newDecl);

    MethodCall visit(MethodCall methodCall);

    Unary visit(Unary unary);

    This visit(This aThis);

    Null visit(Null aNull);

    LocalOrFieldVar visit(LocalOrFieldVar localOrFieldVar);

    IntegerExpr visit(IntegerExpr integerExpr);

    InstVar visit(InstVar instVar);

    CharExpr visit(CharExpr charExpr);

    BoolExpr visit(BoolExpr boolExpr);

   Binary visit(Binary binary);
}