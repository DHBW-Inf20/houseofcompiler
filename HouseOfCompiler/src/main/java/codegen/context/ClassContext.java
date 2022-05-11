package codegen.context;

import syntaxtree.structure.ClassDecl;

import java.util.HashMap;

public class ClassContext {

    private HashMap<String, FieldContext> fields;
    private HashMap<String, MethodContext> methods;

    public ClassContext(ClassDecl clazz) {
        fields = new HashMap<>();
        methods = new HashMap<>();

        clazz.getFieldDelcarations().forEach(field -> fields.put(field.getIdentifier(), new FieldContext(field)));
        clazz.getMethodDeclarations().forEach(method -> methods.put(method.getIdentifier(), new MethodContext(method)));
    }

    public HashMap<String, FieldContext> getFields() {
        return fields;
    }

    public HashMap<String, MethodContext> getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fields:\n");
        fields.forEach((identifier, field) -> {
            builder.append(identifier);
            builder.append(" -> ");
            builder.append(field.toString());
        });
        builder.append("\n----------\n");
        builder.append("Methods:\n");
        methods.forEach((identifier, method) -> {
            builder.append(identifier);
            builder.append(" -> ");
            builder.append(method.toString());
        });
        return builder.toString();
    }
}
