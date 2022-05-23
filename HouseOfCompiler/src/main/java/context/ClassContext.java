package context;

import java.util.ArrayList;
import java.util.HashMap;

import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.MainMethodDecl;

public class ClassContext {

    private HashMap<String, FieldContext> fields;
    private ArrayList<ConstructorContext> constructors;
    private HashMap<String, ArrayList<MethodContext>> methods;
    private boolean hasMain = false;

    public ClassContext(ClassDecl clazz) {
        fields = new HashMap<>();
        constructors = new ArrayList<>();
        methods = new HashMap<>();

        clazz.getFieldDelcarations().forEach(field -> fields.put(field.getIdentifier(), new FieldContext(field)));
        clazz.getConstructorDeclarations()
                .forEach(constructor -> constructors.add(new ConstructorContext(constructor)));
        clazz.getMethodDeclarations().forEach(method -> {
            if (method instanceof MainMethodDecl) {
                hasMain = true;
                return;
            }
            if (!methods.containsKey(method.getIdentifier())) {
                methods.put(method.getIdentifier(), new ArrayList<>());
            }
            methods.get(method.getIdentifier()).add(new MethodContext(method));
        });
    }

    public boolean hasMain() {
        return hasMain;
    }

    /**
     * @return HashMap<String, FieldContext>
     */
    public HashMap<String, FieldContext> getFields() {
        return fields;
    }

    /**
     * @return ArrayList<ConstructorContext>
     */
    public ArrayList<ConstructorContext> getConstructors() {
        return constructors;
    }

    /**
     * @return HashMap<String, ArrayList<MethodContext>>
     */
    public HashMap<String, ArrayList<MethodContext>> getMethods() {
        return methods;
    }

    /**
     * @return String
     */
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
