package syntaxtree.statements;

import java.util.Objects;

import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import syntaxtree.statementexpression.IStatementExpression;
import visitor.SemanticVisitor;

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
    public String toString() {
        return "for(" + init + "; " + condition + "; " + update + ") " + statement;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((statement == null) ? 0 : statement.hashCode());
        result = prime * result + ((condition == null) ? 0 : condition.hashCode());
        result = prime * result + ((init == null) ? 0 : init.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((update == null) ? 0 : update.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ForStmt other = (ForStmt) obj;
        return Objects.equals(other.statement,
                statement)
                && Objects.equals(other.condition, condition) && Objects.equals(other.init, init)
                && Objects.equals(other.type, type) && Objects.equals(other.update, update);
    }

}
