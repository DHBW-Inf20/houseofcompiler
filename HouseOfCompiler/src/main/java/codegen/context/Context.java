package codegen.context;

import syntaxtree.structure.Program;

import java.util.HashMap;

public class Context {

    private HashMap<String, ClassContext> classes;

    public Context(Program program) {
        classes = new HashMap<>();
        program.getClasses().forEach(clazz -> classes.put(clazz.getIdentifier(), new ClassContext(clazz)));
    }

    public HashMap<String, ClassContext> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        classes.forEach((identifier, clazz) -> {
            builder.append(identifier);
            builder.append(": \n");
            builder.append(clazz.toString());
            builder.append("\n--------------------\n");
        });
        return builder.toString();
    }
}
