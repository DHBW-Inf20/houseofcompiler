package syntaxtree.statements;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import syntaxtree.statementexpression.IStatementExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class ForStmt implements IStatement {

    private Type type;
    private IStatement init; // z.B. int i = 0;
    private IExpression condition; // z.B. i < 10
    private IStatementExpression update; // z.B. i = i + 1;
    private IStatement statement;
    public int line;
    public int column;

    public ForStmt(
            IStatement init, IExpression condition, IStatementExpression update,
            IStatement statement) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
    }

    public ForStmt(Type type,
            IStatement init, IExpression condition, IStatementExpression update,
            IStatement statement) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
        this.type = type;
    }

    public ForStmt(
            IStatement init, IExpression condition, IStatementExpression update,
            IStatement statement, int line,
            int column) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
        this.line = line;
        this.column = column;
    }

    public ForStmt(Type type,
            IStatement init, IExpression condition, IStatementExpression update,
            IStatement statement, int line, int column) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
        this.line = line;
        this.column = column;
        this.type = type;
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public IStatement getInit() {
        return init;
    }

    public void setInit(IStatement init) {
        this.init = init;
    }

    public IExpression getCondition() {
        return condition;
    }

    public void setCondition(IExpression condition) {
        this.condition = condition;
    }

    public IStatementExpression getUpdate() {
        return update;
    }

    public void setUpdate(IStatementExpression update) {
        this.update = update;
    }

    public IStatement getStatement() {
        return statement;
    }

    public void setStatement(IStatement statement) {
        this.statement = statement;
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "("+ type + ")"+ "for(" + init + "; " + condition + "; " + update + ") " + statement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForStmt forStmt = (ForStmt) o;
        return Objects.equals(type, forStmt.type) && Objects.equals(init, forStmt.init) && Objects.equals(condition, forStmt.condition) && Objects.equals(update, forStmt.update) && Objects.equals(statement, forStmt.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, init, condition, update, statement);
    }
}
