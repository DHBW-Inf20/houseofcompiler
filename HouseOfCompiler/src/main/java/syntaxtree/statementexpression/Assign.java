package syntaxtree.statementexpression;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import syntaxtree.expressions.IExpression;
import visitor.SemanticVisitor;
import visitor.codevisitor.MethodCodeVisitor;

import java.util.Objects;

public class Assign implements IStatementExpression{

    // lExpression = rExpression
    private IExpression lExpression;
    private IExpression rExpression;
    private Type type;

    public Assign(IExpression lExpression, IExpression rExpression) {
        this.lExpression = lExpression;
        this.rExpression = rExpression;
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

    public void setType(Primitives type){
        this.type = new BaseType(type);
    }

    @Override
    public void accept(MethodCodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(SemanticVisitor visitor) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assign assign = (Assign) o;
        return lExpression.equals(assign.lExpression) && rExpression.equals(assign.rExpression) && Objects.equals(type, assign.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lExpression, rExpression, type);
    }
}
