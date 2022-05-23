package visitor;

import semantic.TypeCheckResult;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.BoolExpr;
import syntaxtree.expressions.CharExpr;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.Null;
import syntaxtree.expressions.StringExpr;
import syntaxtree.expressions.This;
import syntaxtree.expressions.Unary;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.Block;
import syntaxtree.statements.IfStmt;
import syntaxtree.statements.LocalVarDecl;
import syntaxtree.statements.ReturnStmt;
import syntaxtree.statements.WhileStmt;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;
import syntaxtree.structure.Program;

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

    TypeCheckResult typeCheck(StringExpr instVar);

}