package codegen;

import org.objectweb.asm.Opcodes;
import syntaxtree.structure.Program;
import visitor.CodeVisitor;

public class ProgramGenerator extends CodeVisitor implements Opcodes {



    public void generate(Program program) {
        program.accept(this);
    }

    @Override
    public void visit(Program program) {
        System.out.println("Program");
        program.getClasses().forEach(clazz -> {
            ClassGenerator classGen = new ClassGenerator();
            clazz.accept(classGen);
        });
    }
}
