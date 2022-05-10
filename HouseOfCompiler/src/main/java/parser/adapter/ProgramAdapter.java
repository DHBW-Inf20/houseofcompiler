package parser.adapter;


import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;


public class ProgramAdapter {

    public static Program adapt(JavaSubsetParser.ProgramContext programContext){
        PrintableVector<ClassDecl> classes = new PrintableVector<ClassDecl>();
        programContext.classdecl().forEach(classContext -> classes.add(ClassAdapter.adapt(classContext)));

        return new Program(classes);
    }
}
