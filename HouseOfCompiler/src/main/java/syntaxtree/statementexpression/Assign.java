package syntaxtree.statementexpression;

import java.util.Objects;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import semantic.TypeCheckResult;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

public class Assign implements IStatementExpression {

    // lExpression = rExpression
    private IExpression lExpression;
    private IExpression rExpression;
    private Type type;
public int line;
public int column;

    public Assign(IExpression lExpression, IExpression rExpression) {
        this.lExpression = lExpression;
        this.rExpression = rExpression;
    }

    public Assign(IExpression lExpression, IExpression rExpression, int line, int col) {
        this.lExpression = lExpression;
        this.rExpression = rExpression;
        this.line = line;
        this.column = col;
    }


    public Assign(Type type, IExpression lExpression, IExpression rExpression) {
        this.lExpression = lExpression;
        this.rExpression = rExpression;
        this.type = type;
    }

    public IExpression getlExpression() {
        return lExpression;
    }

    public IExpression getrExpression() {
        return rExpression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setType(String className) {
        this.type = new ReferenceType(className);
    }

    public void setType(Primitives type) {
        this.type = new BaseType(type);
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public TypeCheckResult accept(SemanticVisitor visitor) {
        return visitor.typeCheck(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Assign assign = (Assign) o;
        return lExpression.equals(assign.lExpression) && rExpression.equals(assign.rExpression)
                && Objects.equals(type, assign.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lExpression, rExpression, type);
    }

    @Override
    public String toString() {
        return this.type + ": " + lExpression + " = " + rExpression + ";\n";
    }
}
