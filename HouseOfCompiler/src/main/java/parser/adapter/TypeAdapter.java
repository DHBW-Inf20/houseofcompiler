package parser.adapter;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import parser.generated.JavaSubsetParser;

public class TypeAdapter {
    public static Type adapt(JavaSubsetParser.TypeContext typeContext) {
        if (typeContext.Int() != null)
            return new BaseType(Primitives.INT);
        else if (typeContext.Char() != null)
            return new BaseType(Primitives.CHAR);
        else if (typeContext.Boolean() != null)
            return new BaseType(Primitives.BOOL);
        else // Identifier
            return new ReferenceType(typeContext.Identifier().getText(), typeContext.start.getLine(),
                    typeContext.start.getCharPositionInLine());
    }
}
