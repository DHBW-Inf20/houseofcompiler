package codegen;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

import common.IProgramGenerator;
import context.Context;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceClassVisitor;
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
        pg.generateBytecode(program);
        System.out.println(pg);
        return pg.getBytecode();
    }

    public HashMap<String, byte[]> getBytecode() {
        return classes;
    }

    /**
     * @param program
     */
    @Override
    public void visit(Program program) {
        classes.clear();
        program.getClasses().forEach(clazz -> {
            ClassGenerator classGen = new ClassGenerator(context);
            clazz.accept(classGen);
            classes.put(clazz.getIdentifier(), classGen.getBytecode());
        });
    }


    @Override
    public String toString() {
        StringWriter out    = new StringWriter();
        PrintWriter  writer = new PrintWriter(out);

        for (byte[] byteCode : classes.values()) {
            TraceClassVisitor tcv = new TraceClassVisitor(null, new Textifier(), writer);
            new ClassReader(byteCode).accept(tcv, ClassReader.SKIP_DEBUG);
        }

        writer.flush();
        return out.toString();
    }
}
