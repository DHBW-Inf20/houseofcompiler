package codegen;

import common.IProgramGenerator;
import syntaxtree.structure.Program;
import visitor.codevisitor.ProgramCodeVisitor;

import java.util.HashMap;

public class ProgramGenerator implements ProgramCodeVisitor, IProgramGenerator {

    private final HashMap<String, byte[]> classes;

    public ProgramGenerator() {
        classes = new HashMap<>();
    }

    public HashMap<String, byte[]> generateBytecode(Program program) {
        program.accept(this);
        return classes;
    }

    public static HashMap<String, byte[]> generate(Program program){
        ProgramGenerator pg = new ProgramGenerator();
        return pg.generateBytecode(program);
    }

    @Override
    public void visit(Program program) {
        System.out.println("Program");
        classes.clear();
        program.getClasses().forEach(clazz -> {
            ClassGenerator classGen = new ClassGenerator();
            clazz.accept(classGen);
            classes.put(clazz.getIdentifier(), classGen.getBytecode());
        });
    }
}
