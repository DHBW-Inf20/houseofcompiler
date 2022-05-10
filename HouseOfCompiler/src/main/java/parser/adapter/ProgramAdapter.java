package parser.adapter;


import parser.generated.JavaSubsetParser;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.util.Vector;

public class ProgramAdapter {

    public static Program adapt(JavaSubsetParser.ProgramContext programContext){
        Vector<ClassDecl> classes = new Vector<ClassDecl>();
        programContext.classdecl().forEach(classContext -> classes.add(ClassAdapter.adapt(classContext)));

        return new Program(classes);
    }
}
