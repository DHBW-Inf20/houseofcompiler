package syntaxtree.expressions;

import common.Type;
import visitor.Visitable;

public interface IExpression extends Visitable {
    Type getType();
}
