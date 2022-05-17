package visitor;


import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.*;

public interface SemanticVisitor {
    TypeCheckResult typeCheck(Program toCheck);

    TypeCheckResult typeCheck(ClassDecl toCheck);

    TypeCheckResult typeCheck(FieldDecl toCheck);

    TypeCheckResult typeCheck(ConstructorDecl toCheck);

    TypeCheckResult typeCheck(MethodDecl toCheck);



    TypeCheckResult typeCheck(Assign toCheck);

    TypeCheckResult typeCheck(MethodParameter toCheck);


    TypeCheckResult typeCheck(WhileStmt whileStmt);

    TypeCheckResult typeCheck(ReturnStmt returnStmt);

    TypeCheckResult typeCheck(LocalVarDecl localVarDecl);

    TypeCheckResult typeCheck(IfStmt ifStmt);

    TypeCheckResult typeCheck(Block block);

    TypeCheckResult typeCheck(NewDecl newDecl);

    TypeCheckResult typeCheck(MethodCall methodCall);

    TypeCheckResult typeCheck(Unary unary);

    TypeCheckResult typeCheck(This aThis);

    TypeCheckResult typeCheck(Null aNull);

    TypeCheckResult typeCheck(LocalOrFieldVar localOrFieldVar);

    TypeCheckResult typeCheck(IntegerExpr integerExpr);

    TypeCheckResult typeCheck(InstVar instVar);

    TypeCheckResult typeCheck(CharExpr charExpr);

    TypeCheckResult typeCheck(BoolExpr boolExpr);

    TypeCheckResult typeCheck(Binary binary);
}