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
}
