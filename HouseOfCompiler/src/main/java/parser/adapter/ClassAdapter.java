package parser.adapter;

import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;

import java.lang.reflect.Method;
import common.PrintableVector;

public class ClassAdapter {
    public static ClassDecl adapt(JavaSubsetParser.ClassdeclContext classdeclContext){
        PrintableVector<ConstructorDecl> constructorDecls = new PrintableVector<ConstructorDecl>();
        PrintableVector<FieldDecl> fieldDecls = new PrintableVector<FieldDecl>();
        PrintableVector<MethodDecl> methodDecls = new PrintableVector<MethodDecl>();

        return new ClassDecl(classdeclContext.Identifier().getText(), fieldDecls, methodDecls, constructorDecls);
    }
}
