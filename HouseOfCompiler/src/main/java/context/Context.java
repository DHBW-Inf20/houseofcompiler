package context;

import java.util.ArrayList;
import java.util.HashMap;

import common.AccessModifier;
import common.BaseType;
import common.Primitives;
import common.PrintableVector;
import common.ReferenceType;
import syntaxtree.statements.Block;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.FieldDecl;
import syntaxtree.structure.MethodDecl;
import syntaxtree.structure.MethodParameter;
import syntaxtree.structure.Program;

public class Context {

        private HashMap<String, ClassContext> classes;

        private HashMap<String, String> imports;

        private ArrayList<String> mains;

        public Context(Program program) {
                classes = new HashMap<>();
                imports = new HashMap<>();
                mains = new ArrayList<>();

                addStaticContext();
                addStaticImports();

                program.getClasses().forEach(clazz -> {
                        ClassContext cc = new ClassContext(clazz);
                        classes.put(clazz.getIdentifier(), cc);
                        if (cc.hasMain()) {
                                mains.add(clazz.getIdentifier());
                        }
                });
        }

        public String getMain() {
                if (mains.size() == 1) {
                        return mains.get(0);
                }
                return null;
        }

        /**
         * @return HashMap<String, ClassContext>
         */
        public HashMap<String, ClassContext> getClasses() {
                return classes;
        }

        /**
         * @return HashMap<String, String>
         */
        public HashMap<String, String> getImports() {
                return imports;
        }

        public void addStaticContext() {
                ClassDecl SystemClass = new ClassDecl("java/lang/System", new PrintableVector<>(),
                                new PrintableVector<>(),
                                new PrintableVector<>());

                FieldDecl out = new FieldDecl(AccessModifier.PUBLIC_STATIC, new ReferenceType("java/io/PrintStream"),
                                "out");
                FieldDecl err = new FieldDecl(AccessModifier.PUBLIC_STATIC, new ReferenceType("java/io/PrintStream"),
                                "err");
                SystemClass.getFieldDelcarations().add(out);
                SystemClass.getFieldDelcarations().add(err);
                var intParams = new PrintableVector<MethodParameter>();
                intParams.add(new MethodParameter(new BaseType(Primitives.INT), "i"));
                var boolParams = new PrintableVector<MethodParameter>();
                boolParams.add(new MethodParameter(new BaseType(Primitives.BOOL), "b"));
                var charParams = new PrintableVector<MethodParameter>();
                charParams.add(new MethodParameter(new BaseType(Primitives.CHAR), "c"));
                var stringParams = new PrintableVector<MethodParameter>();
                stringParams.add(new MethodParameter(new ReferenceType("java/lang/String"), "s"));

                MethodDecl printlnInt = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "println",
                                intParams,
                                new Block());
                MethodDecl printlnBool = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "println",
                                boolParams,
                                new Block());
                MethodDecl printlnChar = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "println",
                                charParams,
                                new Block());
                MethodDecl println = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "println",
                                new PrintableVector<>(),
                                new Block());

                MethodDecl printlnString = new MethodDecl(AccessModifier.PUBLIC, new BaseType(
                                Primitives.VOID),
                                "println",
                                stringParams,
                                new Block());
                MethodDecl printInt = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "print",
                                intParams,
                                new Block());
                MethodDecl printBool = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "print",
                                boolParams,
                                new Block());
                MethodDecl printChar = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "print",
                                charParams,
                                new Block());
                MethodDecl print = new MethodDecl(AccessModifier.PUBLIC, new BaseType(Primitives.VOID), "print",
                                new PrintableVector<>(),
                                new Block());
                MethodDecl printString = new MethodDecl(AccessModifier.PUBLIC, new BaseType(
                                Primitives.VOID),
                                "print",
                                stringParams,
                                new Block());

                var streamMethods = new PrintableVector<MethodDecl>();
                streamMethods.add(printlnInt);
                streamMethods.add(printlnBool);
                streamMethods.add(printlnChar);
                streamMethods.add(println);
                streamMethods.add(printInt);
                streamMethods.add(printBool);
                streamMethods.add(printChar);
                streamMethods.add(print);
                streamMethods.add(printlnString);
                streamMethods.add(printString);
                ClassDecl PrintStreamClass = new ClassDecl("java/io/PrintStream", new PrintableVector<>(),
                                new PrintableVector<>(),
                                streamMethods);

                classes.put(SystemClass.getIdentifier(), new ClassContext(SystemClass));
                classes.put(PrintStreamClass.getIdentifier(), new ClassContext(PrintStreamClass));
        }

        public void addStaticImports() {
                imports.put("System", "java/lang/System");
                imports.put("PrintStream", "java/io/PrintStream");
        }

        /**
         * @return String
         */
        @Override
        public String toString() {
                StringBuilder builder = new StringBuilder();
                classes.forEach((identifier, clazz) -> {
                        builder.append(identifier);
                        builder.append(": \n");
                        builder.append(clazz.toString());
                        builder.append("\n--------------------\n");
                });
                return builder.toString();
        }
}
