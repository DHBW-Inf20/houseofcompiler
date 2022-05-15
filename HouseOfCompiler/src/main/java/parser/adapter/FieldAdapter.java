package parser.adapter;

import common.AccessModifier;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.FieldDecl;

import java.util.Locale;

public class FieldAdapter {
    public static FieldDecl adapt(JavaSubsetParser.FieldDeclContext fieldDeclContext){
        if (fieldDeclContext.AccessModifier() != null){
            return new FieldDecl(
                    fieldDeclContext.Identifier().getText(),
                    AccessModifier.valueOf(
                            fieldDeclContext.AccessModifier().getText().toUpperCase(Locale.ROOT)
                    )
            );
        }
        else {
            return new FieldDecl(
                    fieldDeclContext.Identifier().getText(),
                    AccessModifier.PACKAGE_PRIVATE
            );
        }
    }
}
