package Helper;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.This;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statements.Block;
import syntaxtree.statements.IStatement;
import syntaxtree.statements.ReturnStmt;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
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

    public static Block getBlock(IStatement... expressions) {
        PrintableVector<IStatement> expressionsVector = new PrintableVector<>();
        for (IStatement expression : expressions) {
            expressionsVector.add(expression);
        }
        return new Block(expressionsVector);
    }

    public static Block getEmptyBlock() {
        return new Block();
    }
    
    public static PrintableVector<IExpression> getArguments(IExpression... expressions) {
        PrintableVector<IExpression> arguments = new PrintableVector<>();
        for (IExpression expression : expressions) {
            arguments.add(expression);
        }
        return arguments;
    }

    public static PrintableVector<MethodParameter> getEmptyParameters() {
        return new PrintableVector<>();
    }

    public static PrintableVector<MethodParameter> getParameters(MethodParameter... parameters){
        PrintableVector<MethodParameter> parametersVector = new PrintableVector<>();
        for (MethodParameter parameter : parameters) {
            parametersVector.add(parameter);
        }
        return parametersVector;
    }

    public static Program getClassFieldsTast() {
        return getClassFieldsAst();
    }



    public static Program getClassFieldsAst() {
        Program expectedAst = getEmptyProgram("ClassFields");

        FieldDecl privateField = new FieldDecl("privateAccess", AccessModifier.PRIVATE);
        privateField.setType(new BaseType(Primitives.INT));
        FieldDecl publicField = new FieldDecl("publicAccess", AccessModifier.PUBLIC);
        publicField.setType(new BaseType(Primitives.INT));
        FieldDecl protectedField = new FieldDecl("protectedAccess", AccessModifier.PROTECTED);
        protectedField.setType(new BaseType(Primitives.INT));

        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(privateField);
        fields.add(publicField);
        fields.add(protectedField);

        return expectedAst;
    }
    public static Program getAutoClassFieldAst() {
        Program expectedAst = getEmptyProgram("AutoAccessModifierField");

        FieldDecl autoField = new FieldDecl(new BaseType(Primitives.INT), "autoAccess");

        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(autoField);
        return expectedAst;
    }

    public static Program getAutoClassFieldTast(){
        return getAutoClassFieldAst();
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
        block.getStatements().add(assign);

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
        block.getStatements().add(assign);
        block.setType(Primitives.VOID);

        classDecl.getConstructorDeclarations()
                .add(new ConstructorDecl(AccessModifier.PUBLIC, getEmptyParameters(), block));

        return expectedTast;
    }

    public static Program getVoidMethodAst(){
        Program expectedAst = getEmptyProgram("VoidMethod");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        MethodDecl foo = new MethodDecl(new BaseType(Primitives.VOID), "foo",getEmptyParameters(), getEmptyBlock());
        methods.add(foo);

        return expectedAst;
    }

    public static Program getVoidMethodTast(){
        return getVoidMethodAst();
    }

    public static Program getRealMethodAst(){
        Program expectedAst = getEmptyProgram("RealMethod");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        Block block = getEmptyBlock();
        ReturnStmt returnStmt = new ReturnStmt(new LocalOrFieldVar("i"));
        block.getStatements().add(returnStmt);

        var parameters = getEmptyParameters();
        parameters.add(new MethodParameter(Primitives.INT, "i"));

        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        MethodDecl foo = new MethodDecl(new BaseType(Primitives.INT), "foo",parameters, block);
        methods.add(foo);

        return expectedAst;
    }

    public static Program getRealConstructorAst(){
        Program expectedAst = getEmptyProgram("RealConstructor");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        FieldDecl i = new FieldDecl(AccessModifier.PRIVATE, new BaseType(Primitives.INT), "i");

        classDecl.getFieldDelcarations().add(i);
        Assign assignStmt = new Assign(new InstVar(new This(), "i"), new LocalOrFieldVar("i"));
        Block block = getBlock(assignStmt);

        var parameters = getParameters(new MethodParameter(Primitives.INT, "i"));

        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();
        ConstructorDecl constructor = new ConstructorDecl(AccessModifier.PUBLIC, parameters, block);
        constructors.add(constructor);


        return expectedAst;
    }

    public static Program getRealConstructorTast(){
        String className = "RealConstructor";
        Program expectedTast = getEmptyProgram(className);

        ClassDecl classDecl = expectedTast.getClasses().firstElement();
        FieldDecl i = new FieldDecl(AccessModifier.PRIVATE, new BaseType(Primitives.INT), "i");

        classDecl.getFieldDelcarations().add(i);
        Assign assignStmt = new Assign(new InstVar(className, new This(
                className), "i"), new LocalOrFieldVar(new ReferenceType(className),"i"));

        assignStmt.setType(className);

        Block block = getBlock(assignStmt);
        block.setType(Primitives.VOID);

        var parameters = getParameters(new MethodParameter(Primitives.INT, "i"));

        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();
        ConstructorDecl constructor = new ConstructorDecl(AccessModifier.PUBLIC, parameters, block);
        constructors.add(constructor);

        return expectedTast;
    }

    public static Program getMethodCallAst(){
        Program expectedAst = getEmptyProgram("MethodCall");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.INT), "i"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(new Assign(new InstVar(new This(), "i"), new MethodCall(new This(), "foo", getArguments() )));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC, getParameters(), block));

        Block fooBlock = getBlock(new ReturnStmt(new IntegerExpr(1)));
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.INT), "foo", getEmptyParameters(), fooBlock));

        return expectedAst;
    }

    public static Program getMethodCallTast(){
        Program expectedTast = getEmptyProgram("MethodCall");

        ClassDecl classDecl = expectedTast.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.INT), "i"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(
                new Assign(new InstVar(new This(), "i"), new MethodCall(new This(), "foo", getArguments())));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC, getParameters(), block));

        Block fooBlock = getBlock(new ReturnStmt(new IntegerExpr(1)));
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.INT), "foo", getEmptyParameters(), fooBlock));

        return expectedTast;
    }


}
