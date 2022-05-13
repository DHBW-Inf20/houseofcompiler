package visitor.codevisitor;

import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.MethodDecl;

public interface MethodCodeVisitor {
    void visit(ConstructorDecl constructorDecl);
    void visit(MethodDecl methodDecl);

    // Statements
    void visit(Block block);
    void visit(IfStmt ifStmt);
    void visit(LocalVarDecl localVarDecl);
    void visit(ReturnStmt returnStmt);
    void visit(WhileStmt whileStmt);

    // StatementExpression
    void visit(Assign assign);
    void visit(MethodCall methodCall);
    void visit(NewDecl newDecl);

    // Expressions
    void visit(Binary binary);
    void visit(BoolExpr boolExpr);
    void visit(CharExpr charExpr);
    void visit(InstVar instVar);
    void visit(IntegerExpr integerExpr);
    void visit(LocalOrFieldVar localOrFieldVar);
    void visit(Null nullExpr);
    void visit(This thisExpr);
    void visit(Unary unary);

}
