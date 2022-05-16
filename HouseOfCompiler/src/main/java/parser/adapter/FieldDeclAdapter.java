package parser.adapter;

import common.AccessModifier;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.FieldDecl;

import java.util.Locale;

public class FieldDeclAdapter {
    public static FieldDecl adapt(JavaSubsetParser.FieldDeclContext fieldDeclContext){
        if (fieldDeclContext.AccessModifier() != null){
            return new FieldDecl(
                    AccessModifier.valueOf(
                            fieldDeclContext.AccessModifier().getText().toUpperCase(Locale.ROOT)
                    ),
                    TypeAdapter.adapt(fieldDeclContext.type()),
                    fieldDeclContext.Identifier().getText()
            );
        }
        else {
            return new FieldDecl(
                    AccessModifier.PACKAGE_PRIVATE,
                    TypeAdapter.adapt(fieldDeclContext.type()),
                    fieldDeclContext.Identifier().getText()
            );
        }
    }
}
