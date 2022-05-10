package parser.adapter;

import parser.generated.JavaSubsetParser;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;

import java.lang.reflect.Method;
import java.util.Vector;

public class ClassAdapter {
    public static ClassDecl adapt(JavaSubsetParser.ClassdeclContext classdeclContext){
        Vector<ConstructorDecl> constructorDecls = new Vector<ConstructorDecl>();
        Vector<FieldDecl> fieldDecls = new Vector<FieldDecl>();
        Vector<MethodDecl> methodDecls = new Vector<MethodDecl>();

        return new ClassDecl(classdeclContext.Identifier().getText(), fieldDecls, methodDecls, constructorDecls);
    }
}
