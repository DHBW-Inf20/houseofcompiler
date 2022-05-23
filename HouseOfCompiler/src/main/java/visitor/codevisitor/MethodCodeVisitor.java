package visitor.codevisitor;

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
import syntaxtree.statements.*;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MainMethodDecl;
import syntaxtree.structure.MethodDecl;

public interface MethodCodeVisitor {
    void visit(ConstructorDecl constructorDecl);

    void visit(MethodDecl methodDecl);
    void visit(MainMethodDecl mainDecl);

    // Statements
    void visit(Block block);

    void visit(IfStmt ifStmt);

    void visit(LocalVarDecl localVarDecl);

    void visit(ReturnStmt returnStmt);

    void visit(WhileStmt whileStmt);

    void visit(ForStmt forStmt);

    // StatementExpression
    void visit(Assign assign);

    void visit(MethodCall methodCall);

    void visit(NewDecl newDecl);

    // Expressions
    void visit(Unary unary);

    void visit(Binary binary);

    void visit(BoolExpr boolExpr);

    void visit(CharExpr charExpr);

    void visit(IntegerExpr integerExpr);

    void visit(StringExpr stringExpr);

    void visit(InstVar instVar);

    void visit(LocalOrFieldVar localOrFieldVar);

    void visit(Null nullExpr);

    void visit(This thisExpr);
}
