package codegen;

import java.util.HashMap;

import common.IProgramGenerator;
import context.Context;
import syntaxtree.structure.Program;
import visitor.codevisitor.ProgramCodeVisitor;

public class ProgramGenerator implements ProgramCodeVisitor, IProgramGenerator {

    private final HashMap<String, byte[]> classes;
    private Context context;

    public ProgramGenerator() {
        classes = new HashMap<>();
    }

    /**
     * @param program
     * @return HashMap<String, byte[]>
     */
    public HashMap<String, byte[]> generateBytecode(Program program) {
        context = new Context(program);
        program.accept(this);
        return classes;
    }

    /**
     * @param program
     * @return HashMap<String, byte[]>
     */
    public static HashMap<String, byte[]> generate(Program program) {
        ProgramGenerator pg = new ProgramGenerator();
        return pg.generateBytecode(program);
    }

    /**
     * @param program
     */
    @Override
    public void visit(Program program) {
        System.out.println("Program");
        classes.clear();
        program.getClasses().forEach(clazz -> {
            ClassGenerator classGen = new ClassGenerator(context);
            clazz.accept(classGen);
            classes.put(clazz.getIdentifier(), classGen.getBytecode());
        });
    }
}
