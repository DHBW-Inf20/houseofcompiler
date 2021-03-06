package parser.adapter;

import common.PrintableVector;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;

public class ClassAdapter {

        /**
         * @param classdeclContext
         * @return ClassDecl
         */
        public static ClassDecl adapt(JavaSubsetParser.ClassdeclContext classdeclContext) {
                PrintableVector<ConstructorDecl> constructorDecls = new PrintableVector<ConstructorDecl>();
                PrintableVector<FieldDecl> fieldDecls = new PrintableVector<FieldDecl>();
                PrintableVector<MethodDecl> methodDecls = new PrintableVector<MethodDecl>();

                if (classdeclContext.constuctorDecl().size() < 1) {
                        constructorDecls.add(new ConstructorDecl());
                }

                classdeclContext.constuctorDecl().forEach(constuctorDeclContext -> constructorDecls
                                .add(ConstructorAdapter.adapt(constuctorDeclContext)));
                classdeclContext.fieldDecl()
                                .forEach(fieldDeclContext -> fieldDecls.add(FieldDeclAdapter.adapt(fieldDeclContext)));
                classdeclContext.methodDecl().forEach(
                                methodDeclContext -> methodDecls.add(MethodDeclAdapter.adapt(methodDeclContext)));
                return new ClassDecl(classdeclContext.Identifier().getText(), fieldDecls, constructorDecls,
                                methodDecls);
        }
}
