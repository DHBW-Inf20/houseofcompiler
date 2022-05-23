package Helper;

import common.AccessModifier;
import common.BaseType;
import common.Operator;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import syntaxtree.expressions.Binary;
import syntaxtree.expressions.BoolExpr;
import syntaxtree.expressions.CharExpr;
import syntaxtree.expressions.IExpression;
import syntaxtree.expressions.InstVar;
import syntaxtree.expressions.IntegerExpr;
import syntaxtree.expressions.LocalOrFieldVar;
import syntaxtree.expressions.Null;
import syntaxtree.expressions.StringExpr;
import syntaxtree.expressions.This;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.Block;
import syntaxtree.statements.ForStmt;
import syntaxtree.statements.IStatement;
import syntaxtree.statements.LocalVarDecl;
import syntaxtree.statements.ReturnStmt;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.ConstructorDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MainMethodDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;
import syntaxtree.structure.Program;

public abstract class MockGenerator {

    /**
     * @param className
     * @return Program
     */
    public static Program getEmptyProgram(String className) {

        PrintableVector<ClassDecl> classes = new PrintableVector<>();
        classes.add(getEmptyClass(className));

        return new Program(classes);
    }

    /**
     * @param id
     * @return ClassDecl
     */
    public static ClassDecl getEmptyClass(String id) {
        return new ClassDecl(id, new PrintableVector<>(), new PrintableVector<>(), new PrintableVector<>());
    }

    /**
     * @param expressions
     * @return Block
     */
    public static Block getBlock(IStatement... expressions) {
        PrintableVector<IStatement> expressionsVector = new PrintableVector<>();
        for (IStatement expression : expressions) {
            expressionsVector.add(expression);
        }
        return new Block(expressionsVector);
    }

    /**
     * @return Block
     */
    public static Block getEmptyBlock() {
        return new Block();
    }

    /**
     * @param expressions
     * @return PrintableVector<IExpression>
     */
    public static PrintableVector<IExpression> getArguments(IExpression... expressions) {
        PrintableVector<IExpression> arguments = new PrintableVector<>();
        for (IExpression expression : expressions) {
            arguments.add(expression);
        }
        return arguments;
    }

    /**
     * @param constructors
     * @return PrintableVector<ConstructorDecl>
     */
    public static PrintableVector<ConstructorDecl> getConstructors(ConstructorDecl... constructors) {
        PrintableVector<ConstructorDecl> cons = new PrintableVector<>();
        if (constructors.length == 0)
            cons.add(new ConstructorDecl());
        for (ConstructorDecl constructor : constructors) {
            cons.add(constructor);
        }
        return cons;
    }

    /**
     * @return PrintableVector<MethodParameter>
     */
    public static PrintableVector<MethodParameter> getEmptyParameters() {
        return new PrintableVector<>();
    }

    /**
     * @param parameters
     * @return PrintableVector<MethodParameter>
     */
    public static PrintableVector<MethodParameter> getParameters(MethodParameter... parameters) {
        PrintableVector<MethodParameter> parametersVector = new PrintableVector<>();
        for (MethodParameter parameter : parameters) {
            parametersVector.add(parameter);
        }
        return parametersVector;
    }

    /**
     * @return Program
     */
    public static Program getClassFieldsTast() {
        return getClassFieldsAst();
    }

    /**
     * @return Program
     */
    public static Program getClassFieldsAst() {
        Program expectedAst = getEmptyProgram("ClassFields");

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

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

    /**
     * @return Program
     */
    public static Program getAutoClassFieldAst() {
        Program expectedAst = getEmptyProgram("AutoAccessModifierField");

        FieldDecl autoField = new FieldDecl(new BaseType(Primitives.INT), "autoAccess");

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        PrintableVector<FieldDecl> fields = expectedAst.getClasses().firstElement().getFieldDelcarations();
        fields.add(autoField);
        return expectedAst;
    }

    /**
     * @return Program
     */
    public static Program getAutoClassFieldTast() {
        return getAutoClassFieldAst();
    }

    /**
     * @return Program
     */
    public static Program getConstructorParameterTast() {
        return getConstructorParameterAst();
    }

    /**
     * @return Program
     */
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

    /**
     * @return Program
     */
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
                .add(new ConstructorDecl(AccessModifier.PUBLIC, getParameters(), block));
        System.out.println(classDecl);
        return expectedAst;

    }

    /**
     * @return Program
     */
    public static Program getConstructorThisDotTast() {
        Program expectedTast = getEmptyProgram("ConstructorThisDot");

        FieldDecl i = new FieldDecl("i", AccessModifier.PUBLIC);
        i.setType(new BaseType(Primitives.INT));

        PrintableVector<FieldDecl> fields = expectedTast.getClasses().firstElement().getFieldDelcarations();
        fields.add(i);

        ClassDecl classDecl = expectedTast.getClasses().firstElement();

        Block block = getEmptyBlock();

        var thisi = new InstVar("i", new This("ConstructorThisDot"));
        thisi.setType(Primitives.INT);

        Assign assign = new Assign(thisi, new IntegerExpr(5));
        assign.setType(Primitives.INT);
        block.getStatements().add(assign);

        classDecl.getConstructorDeclarations()
                .add(new ConstructorDecl(AccessModifier.PUBLIC, getEmptyParameters(), block));

        return expectedTast;
    }

    /**
     * @return Program
     */
    public static Program getVoidMethodAst() {
        Program expectedAst = getEmptyProgram("VoidMethod");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        MethodDecl foo = new MethodDecl(new BaseType(Primitives.VOID), "foo", getEmptyParameters(), getEmptyBlock());
        methods.add(foo);

        return expectedAst;
    }

    /**
     * @return Program
     */
    public static Program getVoidMethodTast() {
        return getVoidMethodAst();
    }

    /**
     * @return Program
     */
    public static Program getRealMethodAst() {
        Program expectedAst = getEmptyProgram("RealMethod");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        Block block = getEmptyBlock();
        ReturnStmt returnStmt = new ReturnStmt(new LocalOrFieldVar("i"));
        block.getStatements().add(returnStmt);

        var parameters = getEmptyParameters();
        parameters.add(new MethodParameter(Primitives.INT, "i"));

        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        MethodDecl foo = new MethodDecl(new BaseType(Primitives.INT), "foo", parameters, block);
        methods.add(foo);

        return expectedAst;
    }

    /**
     * @return Program
     */
    public static Program getRealConstructorAst() {
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

    /**
     * @return Program
     */
    public static Program getRealConstructorTast() {
        String className = "RealConstructor";
        Program expectedTast = getEmptyProgram(className);

        ClassDecl classDecl = expectedTast.getClasses().firstElement();
        FieldDecl i = new FieldDecl(AccessModifier.PRIVATE, new BaseType(Primitives.INT), "i");

        classDecl.getFieldDelcarations().add(i);
        Assign assignStmt = new Assign(new InstVar(new BaseType(Primitives.INT), new This(
                className), "i"), new LocalOrFieldVar(new BaseType(Primitives.INT), "i"));

        assignStmt.setType(new BaseType(Primitives.INT));

        Block block = getBlock(assignStmt);

        var parameters = getParameters(new MethodParameter(Primitives.INT, "i"));

        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();
        ConstructorDecl constructor = new ConstructorDecl(AccessModifier.PUBLIC, parameters, block);
        constructors.add(constructor);

        return expectedTast;
    }

    /**
     * @return Program
     */
    public static Program getMethodCallAst() {
        Program expectedAst = getEmptyProgram("MethodCall");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.INT), "i"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(
                new Assign(new InstVar(new This(), "i"), new MethodCall(new This(), "foo", getArguments())));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC, getParameters(), block));

        Block fooBlock = getBlock(new ReturnStmt(new IntegerExpr(1)));
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.INT), "foo", getEmptyParameters(), fooBlock));

        return expectedAst;
    }

    /**
     * @return Program
     */
    public static Program getMethodCallTast() {
        Program expectedTast = getEmptyProgram("MethodCall");

        ClassDecl classDecl = expectedTast.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.INT), "i"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(
                new Assign(new BaseType(
                        Primitives.INT), new InstVar(new BaseType(Primitives.INT), new This("MethodCall"), "i"),
                        new MethodCall(new BaseType(Primitives.INT), new This("MethodCall"), "foo", getArguments())));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC, getParameters(), block));

        Block fooBlock = getBlock(new ReturnStmt(new BaseType(Primitives.INT), new IntegerExpr(1)));
        fooBlock.setType(Primitives.INT);
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.INT), "foo", getEmptyParameters(), fooBlock));

        return expectedTast;
    }

    /**
     * @return Program
     */
    public static Program getMethodCallWithParameterAst() {
        Program expectedAst = getEmptyProgram("MethodCallParams");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.INT), "i"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(
                new Assign(new InstVar(new This(), "i"),
                        new MethodCall(new This(), "foo", getArguments(new LocalOrFieldVar("i")))));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC,
                getParameters(new MethodParameter(Primitives.INT, "i")), block));

        Block fooBlock = getBlock(new ReturnStmt(new LocalOrFieldVar("i")));
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.INT), "foo",
                getParameters(new MethodParameter(Primitives.INT, "i")), fooBlock));

        return expectedAst;
    }

    /**
     * @return Program
     */
    public static Program getCharArgumentAst() {
        Program expectedAst = getEmptyProgram("CharArgument");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.CHAR), "c"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(
                new Assign(new InstVar(new This(), "c"),
                        new MethodCall(new This(), "foo", getArguments(new CharExpr('a')))));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC,
                getParameters(), block));

        Block fooBlock = getBlock(new ReturnStmt(new LocalOrFieldVar("c")));
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.CHAR), "foo",
                getParameters(new MethodParameter(Primitives.CHAR, "c")), fooBlock));

        return expectedAst;
    }

    /**
     * @return Program
     */
    public static Program getGetterFunctionAst() {
        Program expectedAst = getEmptyProgram("GetterFunction");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        FieldDecl i = new FieldDecl(AccessModifier.PRIVATE, new BaseType(Primitives.INT), "i");

        classDecl.getFieldDelcarations().add(i);
        Assign assignStmt = new Assign(new InstVar(new This(), "i"), new LocalOrFieldVar("i"));
        Block block = getBlock(assignStmt);

        var parameters = getParameters(new MethodParameter(Primitives.INT, "i"));

        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();
        ConstructorDecl constructor = new ConstructorDecl(AccessModifier.PUBLIC, parameters, block);
        constructors.add(constructor);

        var getI = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.INT), "getI", getParameters(),
                getBlock(new ReturnStmt(new InstVar(new This(), "i"))));

        classDecl.getMethodDeclarations().add(getI);

        return expectedAst;
    }

    public static Program getExplicitNullAssignAst() {
        Program expectedAst = getEmptyProgram("ExplicitNullAssign");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        FieldDecl i = new FieldDecl(AccessModifier.PACKAGE_PRIVATE, new ReferenceType("ExplicitNullAssign"), "e");

        classDecl.getFieldDelcarations().add(i);
        Assign assignStmt = new Assign(new InstVar(new This(), "i"), new Null());
        Block block = getBlock(assignStmt);

        var parameters = getParameters(new MethodParameter(Primitives.INT, "i"));

        var test = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.VOID), "test",
                getParameters(),
                getBlock(new Assign(new LocalOrFieldVar("e"), new Null())));

        classDecl.getMethodDeclarations().add(test);

        classDecl.getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getSelfReferenceAst() {
        Program expectedAst = getEmptyProgram("SelfReference");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        FieldDecl i = new FieldDecl(AccessModifier.PACKAGE_PRIVATE, new ReferenceType("SelfReference"), "selfRef");

        classDecl.getFieldDelcarations().add(i);
        Assign assignStmt = new Assign(new InstVar(new This(), "i"), new This());
        Block block = getBlock(assignStmt);

        var parameters = getParameters(new MethodParameter(Primitives.INT, "i"));

        var foo = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT), "foo",
                getParameters(),
                getBlock(new ReturnStmt(new MethodCall(new This(), "baz", getArguments()))));

        var baz = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT), "baz",
                getParameters(),
                getBlock(new ReturnStmt(new IntegerExpr(10))));

        var bar = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT), "bar",
                getParameters(),
                getBlock(
                        new LocalVarDecl(new ReferenceType("SelfReference"), "self",
                                new NewDecl("SelfReference", getArguments())),
                        new ReturnStmt(new MethodCall(new InstVar(new LocalOrFieldVar("self"), "selfRef"), "foo",
                                getArguments()))));

        classDecl.getMethodDeclarations().add(foo);
        classDecl.getMethodDeclarations().add(baz);
        classDecl.getMethodDeclarations().add(bar);

        classDecl.getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getSelfReferenceTast() {
        Program expectedAst = getEmptyProgram("SelfReference");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();

        FieldDecl i = new FieldDecl(AccessModifier.PACKAGE_PRIVATE, new ReferenceType("SelfReference"), "selfRef");

        classDecl.getFieldDelcarations().add(i);

        Block fooBlock = getBlock(new ReturnStmt(new BaseType(Primitives.INT),
                new MethodCall(new BaseType(Primitives.INT), new This("SelfReference"), "baz", getArguments())));
        fooBlock.setType(new BaseType(Primitives.INT));

        Block bazBlock = getBlock(new ReturnStmt(new BaseType(Primitives.INT), new IntegerExpr(10)));
        bazBlock.setType(new BaseType(Primitives.INT));

        Block barBlock = getBlock(
                new LocalVarDecl(new ReferenceType("SelfReference"), "self",
                        new NewDecl("SelfReference", getArguments())),
                new ReturnStmt(new BaseType(Primitives.INT),
                        new MethodCall(new BaseType(Primitives.INT),
                                new InstVar(new ReferenceType("SelfReference"),
                                        new LocalOrFieldVar(new ReferenceType("SelfReference"), "self"), "selfRef"),
                                "foo",
                                getArguments())));

        barBlock.setType(new BaseType(Primitives.INT));

        var foo = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT), "foo",
                getParameters(), fooBlock);

        var baz = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT), "baz",
                getParameters(), bazBlock);

        var bar = new MethodDecl(AccessModifier.PACKAGE_PRIVATE, new BaseType(Primitives.INT), "bar",
                getParameters(),
                barBlock);

        classDecl.getMethodDeclarations().add(foo);
        classDecl.getMethodDeclarations().add(baz);
        classDecl.getMethodDeclarations().add(bar);

        classDecl.getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getThisDotMethodCallAst() {
        Program expectedAst = getEmptyProgram("ThisDotMethodCall");

        ClassDecl classDecl = expectedAst.getClasses().firstElement();
        var fields = classDecl.getFieldDelcarations();
        fields.add(new FieldDecl(new BaseType(Primitives.INT), "i"));
        PrintableVector<ConstructorDecl> constructors = classDecl.getConstructorDeclarations();

        Block block = getBlock(
                new Assign(new InstVar(new This(), "i"), new MethodCall(new This(), "foo", getArguments())));
        constructors.add(new ConstructorDecl(AccessModifier.PUBLIC, getParameters(), block));

        Block fooBlock = getBlock(new ReturnStmt(new IntegerExpr(1)));
        PrintableVector<MethodDecl> methods = classDecl.getMethodDeclarations();
        methods.add(new MethodDecl(new BaseType(Primitives.INT), "foo", getEmptyParameters(), fooBlock));

        return expectedAst;
    }

    public static Program getValueAdapterTestAst() {
        Program expectedAst = getEmptyProgram("ValueAdapterTests");

        Block readsTrueBlock = getBlock(new ReturnStmt(new BoolExpr(true)));

        Block readsFalseBlock = getBlock(new ReturnStmt(new BoolExpr(false)));

        Block readsTrueAndFalseBlock = getBlock(new ReturnStmt(new Binary(new BoolExpr(true),
                Operator.AND, new BoolExpr(false))));

        Block readsIntBlock = getBlock(new ReturnStmt(new IntegerExpr(1)));

        Block readsIntAndIntBlock = getBlock(new ReturnStmt(new Binary(new IntegerExpr(1),
                Operator.PLUS, new IntegerExpr(1))));

        Block readsCharBlock = getBlock(new ReturnStmt(new CharExpr('a')));

        MethodDecl readsTrue = new MethodDecl(new BaseType(Primitives.BOOL), "readsTrue", getEmptyParameters(),
                readsTrueBlock);

        MethodDecl readsFalse = new MethodDecl(new BaseType(Primitives.BOOL), "readsFalse", getEmptyParameters(),
                readsFalseBlock);

        MethodDecl readsTrueAndFalse = new MethodDecl(new BaseType(Primitives.BOOL), "readsTrueAndFalse",
                getEmptyParameters(), readsTrueAndFalseBlock);

        MethodDecl readsInt = new MethodDecl(new BaseType(Primitives.INT), "readsInt", getEmptyParameters(),
                readsIntBlock);

        MethodDecl readsIntAndInt = new MethodDecl(new BaseType(Primitives.INT), "readsIntAndInt", getEmptyParameters(),
                readsIntAndIntBlock);

        MethodDecl readsChar = new MethodDecl(new BaseType(Primitives.CHAR), "readsChar", getEmptyParameters(),
                readsCharBlock);

        var methods = expectedAst.getClasses().firstElement().getMethodDeclarations();

        methods.add(readsTrue);
        methods.add(readsFalse);
        methods.add(readsTrueAndFalse);
        methods.add(readsInt);
        methods.add(readsIntAndInt);
        methods.add(readsChar);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;

    }

    public static Program getSystemOutPrintlnTast() {
        Program expectedAst = getEmptyProgram("SystemOutPrintln");
        var iv = new InstVar(new ReferenceType("java/io/PrintStream"),
                new LocalOrFieldVar(new ReferenceType("java/lang/System"), "System"), "out");
        iv.setAccessModifier(AccessModifier.PUBLIC_STATIC);
        Block block = getBlock(
                new MethodCall(new BaseType(Primitives.VOID),
                        iv,
                        "println",
                        getArguments(new IntegerExpr(1))));

        var method = new MethodDecl(new BaseType(Primitives.VOID), "foo", getEmptyParameters(), block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getSystemOutPrintlnAst() {
        Program expectedAst = getEmptyProgram("SystemOutPrintln");

        Block block = getBlock(
                new MethodCall(new InstVar(new LocalOrFieldVar("System"), "out"), "println",
                        getArguments(new IntegerExpr(1))));

        var method = new MethodDecl(new BaseType(Primitives.VOID), "foo", getEmptyParameters(), block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getSystemOutPrintStringAst() {
        Program expectedAst = getEmptyProgram("SystemOutPrintlnString");

        Block block = getBlock(
                new MethodCall(new InstVar(new LocalOrFieldVar("System"), "out"), "println",
                        getArguments(new StringExpr("Das ist ein String"))));

        var method = new MethodDecl(new BaseType(Primitives.VOID), "foo", getEmptyParameters(), block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getSystemOutPrintStringTast() {
        Program expectedAst = getEmptyProgram("SystemOutPrintlnString");
        var iv = new InstVar(new ReferenceType("java/io/PrintStream"),
                new LocalOrFieldVar(new ReferenceType("java/lang/System"), "System"), "out");
        iv.setAccessModifier(AccessModifier.PUBLIC_STATIC);
        Block block = getBlock(
                new MethodCall(new BaseType(Primitives.VOID),
                        iv,
                        "println",
                        getArguments(new StringExpr("Das ist ein String"))));

        var method = new MethodDecl(new BaseType(Primitives.VOID), "foo", getEmptyParameters(), block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getMainMethodTestAst() {
        Program expectedAst = getEmptyProgram("MainMethodTest");
        Block block = getBlock(
                new MethodCall(new InstVar(new LocalOrFieldVar("System"), "out"), "println",
                        getArguments(new StringExpr("maintest"))));

        var method = new MainMethodDecl(block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getMainMethodTestTast() {
        Program expectedAst = getEmptyProgram("MainMethodTest");
        var iv = new InstVar(new ReferenceType("java/io/PrintStream"),
                new LocalOrFieldVar(new ReferenceType("java/lang/System"), "System"), "out");
        iv.setAccessModifier(AccessModifier.PUBLIC_STATIC);
        Block block = getBlock(
                new MethodCall(new BaseType(Primitives.VOID),
                        iv,
                        "println",
                        getArguments(new StringExpr("maintest"))));

        var method = new MainMethodDecl(block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getForTestAst() {
        Program expectedAst = getEmptyProgram("ForTest");
        Block forBlock = getBlock(new MethodCall(new InstVar(new LocalOrFieldVar("System"), "out"), "println",
                getArguments(new LocalOrFieldVar("i"))));
        Block block = getBlock(
                new ForStmt(new LocalVarDecl(new BaseType(Primitives.INT), "i", new IntegerExpr(0)),
                        new Binary(new LocalOrFieldVar("i"), new IntegerExpr(10), Operator.LESS),
                        new Assign(new LocalOrFieldVar("i"),
                                new Binary(new LocalOrFieldVar("i"), new IntegerExpr(1), Operator.PLUS)),
                        forBlock));

        var method = new MethodDecl(new BaseType(Primitives.VOID), "foo", getEmptyParameters(), block);

        expectedAst.getClasses().firstElement().getMethodDeclarations().add(method);

        expectedAst.getClasses().firstElement().getConstructorDeclarations().add(new ConstructorDecl());

        return expectedAst;
    }

    public static Program getForTestTast() {
        return null;
    }

}
