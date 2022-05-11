package Helper;

import java.util.ArrayList;
import java.util.Vector;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.This;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statements.Block;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodParameter;
import syntaxtree.structure.Program;

public abstract class MockGenerator {

    public static Program getEmptyProgram(String className) {

        PrintableVector<ClassDecl> classes = new PrintableVector<>();
        classes.add(getEmptyClass(className));

        return new Program(classes);
    }

    public static ClassDecl getEmptyClass(String id) {
        return new ClassDecl(id, new PrintableVector<>(), new PrintableVector<>(), new PrintableVector<>());
    }

    public static Block getEmptyBlock() {
        return new Block();
    }

    public static PrintableVector<MethodParameter> getEmptyParameters() {
        return new PrintableVector<>();
    }

    public static Program getClassFieldsTast() {
        return getClassFieldsAst();
    }

    public static Program getClassFieldsAst() {
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

    public static Program getConstructorParameterTast() {
        return getConstructorParameterAst();
    }

    public static Program getConstructorParameterAst() {
        Program expectedAst = getEmptyProgram("ConstructorParams");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        MethodParameter parameter = new MethodParameter(Primitives.INT, "i");

        PrintableVector<MethodParameter> parameters = new PrintableVector<>();
        parameters.add(parameter);

        classDecl.getConstructorDeclarations()
                .add(new ConstructorDecl(AccessModifier.PUBLIC, parameters, getEmptyBlock()));

        return expectedAst;
    }

    public static Program getConstructorThisDotAst() {

        Program expectedAst = getEmptyProgram("ConstructorThisDot");

        FieldDecl i = new FieldDecl("i", AccessModifier.PUBLIC);
        i.setType(new BaseType(Primitives.INT));

        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(i);

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        Block block = getEmptyBlock();

        Assign assign = new Assign(new InstVar("i", new This()), new IntegerExpr(5));
        block.getBlock().add(assign);

        classDecl.getConstructorDeclarations()
                .add(new ConstructorDecl(AccessModifier.PUBLIC, getEmptyParameters(), block));

        return expectedAst;

    }

    public static Program getConstructorThisDotTast(){
        Program expectedTast = getEmptyProgram("ConstructorThisDot");

        FieldDecl i = new FieldDecl("i", AccessModifier.PUBLIC);
        i.setType(new BaseType(Primitives.INT));

        PrintableVector<FieldDecl> fields = expectedTast.getClasses().firstElement().getFieldDelcarations();
        fields.add(i);

        ClassDecl classDecl = expectedTast.getClasses().firstElement();

        Block block = getEmptyBlock();

        var thisi = new InstVar("i", new This());
        thisi.setType(Primitives.INT);

        Assign assign = new Assign( thisi, new IntegerExpr(5));
        assign.setType(Primitives.VOID);
        block.getBlock().add(assign);
        block.setType(Primitives.VOID);

        classDecl.getConstructorDeclarations()
                .add(new ConstructorDecl(AccessModifier.PUBLIC, getEmptyParameters(), block));

        return expectedTast;
    }

}
