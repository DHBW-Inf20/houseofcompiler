package Helper;

import java.util.ArrayList;
import java.util.Vector;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.Program;

public abstract class MockGenerator {

    public static Program getEmptyProgram(String className){

        PrintableVector<ClassDecl> classes = new PrintableVector<>();
        classes.add(getEmptyClass(className));

        return new Program(classes);
    }

    public static ClassDecl getEmptyClass(String id) {
        return new ClassDecl(id, new PrintableVector<>(), new PrintableVector<>(), new PrintableVector<>());
    }

    public static Program getClassFieldsAst(){
        Program expectedAst = getEmptyProgram("ClassFields");

        FieldDecl autoAccess = new FieldDecl("autoAccess", null);
        FieldDecl privateField = new FieldDecl("private", AccessModifier.PRIVATE);
        FieldDecl publicField = new FieldDecl("public", AccessModifier.PUBLIC);
        FieldDecl protectedField = new FieldDecl("protected", AccessModifier.PROTECTED);

        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(autoAccess);
        fields.add(privateField);
        fields.add(publicField);
        fields.add(protectedField);

        return expectedAst;
    }

    public static Program getClassFieldsTast(){
        Program expectedAst = getEmptyProgram("ClassFields");

        FieldDecl autoAccess = new FieldDecl("autoAccess", null);
        autoAccess.setType(new BaseType(Primitives.INT));
        FieldDecl privateField = new FieldDecl("private", AccessModifier.PRIVATE);
        privateField.setType(new BaseType(Primitives.INT));
        FieldDecl publicField = new FieldDecl("public", AccessModifier.PUBLIC);
        publicField.setType(new BaseType(Primitives.INT));
        FieldDecl protectedField = new FieldDecl("protected", AccessModifier.PROTECTED);
        protectedField.setType(new BaseType(Primitives.INT));
        
        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(autoAccess);
        fields.add(privateField);
        fields.add(publicField);
        fields.add(protectedField);

        return expectedAst;
    }


}
