package parser.adapter;

import java.util.Locale;

import common.AccessModifier;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.FieldDecl;

public class FieldDeclAdapter {

    /**
     * @param fieldDeclContext
     * @return FieldDecl
     */
    public static FieldDecl adapt(JavaSubsetParser.FieldDeclContext fieldDeclContext) {
        if (fieldDeclContext.AccessModifier() != null) {
            return new FieldDecl(
                    AccessModifier.valueOf(
                            fieldDeclContext.AccessModifier().getText().toUpperCase(Locale.ROOT)),
                    TypeAdapter.adapt(fieldDeclContext.type()),
                    fieldDeclContext.Identifier().getText(),
                    fieldDeclContext.start.getLine(),
                    fieldDeclContext.start.getCharPositionInLine()

            );
        } else {
            return new FieldDecl(
                    AccessModifier.PACKAGE_PRIVATE,
                    TypeAdapter.adapt(fieldDeclContext.type()),
                    fieldDeclContext.Identifier().getText(),
                    fieldDeclContext.start.getLine(),
                    fieldDeclContext.start.getCharPositionInLine());
        }
    }
}
