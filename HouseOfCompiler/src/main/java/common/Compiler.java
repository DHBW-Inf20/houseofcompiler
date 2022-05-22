package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import codegen.ProgramGenerator;
import main.ReflectLoader;
import semantic.exceptions.SemanticError;
import syntaxtree.structure.Program;

public class Compiler implements CompilerFactory {

    public Compiler() {

    }

    /**
     * @return CompilerFactory
     */
    public static CompilerFactory getFactory() {
        return new Compiler();
    }

    /**
     * @return IAstAdapter
     */
    @Override
    public IAstAdapter getAstAdapter() {
        return new AstAdapter();
    }

    /**
     * @return ITastAdapter
     */
    @Override
    public ITastAdapter getTastAdapter() {
        return new TastAdapter();
    }

    /**
     * @return IProgramGenerator
     */
    @Override
    public IProgramGenerator getProgramGenerator() {
        return ProgramGenerator::generate;
    }

    @Override
    public void compileTest(String fileName) {
        // get the filename without the extension
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        if (file.exists()) {
            try {
                InputStream inputStream = new FileInputStream(file);
                this.compileTest(inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void compileTest(InputStream inputStream) throws SemanticError {
        IAstAdapter astAdapter = this.getAstAdapter();
        ITastAdapter tastAdapter = this.getTastAdapter();
        IProgramGenerator programGenerator = this.getProgramGenerator();
        Program program = astAdapter.getAst(inputStream);
        var className = program.getClasses().get(0).getIdentifier();
        Program tast = tastAdapter.getTast(program);
        var bc = programGenerator.generateBytecode(tast);
        // Write the bytecode to a file
        var prefix = className + "$";
        // Create folder build if it does not exist
        var buildFolder = new File("build");
        if (!buildFolder.exists()) {
            buildFolder.mkdir();
        }

        var classBuildFolder = new File("build" + File.separator + className);

        if (!classBuildFolder.exists()) {
            classBuildFolder.mkdir();
        } else {
            // Delete all files in the folder
            for (File file : classBuildFolder.listFiles()) {
                file.delete();
            }
        }
        for (var clazz : bc.keySet()) {
            var fileName = "";
            if (clazz.equals(className)) {
                fileName = clazz;
            } else {
                fileName = prefix + clazz;
            }
            File file = new File("build" + File.separator + className + File.separator + fileName + ".class");
            if (!file.exists())
                try {
                    file.createNewFile();
                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        fos.write(bc.get(clazz));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Override
    public void compile(String fileName, String outDir) {
        // get the filename without the extension
        File file = new File(fileName);

        if (file.exists()) {
            try {
                InputStream inputStream = new FileInputStream(file);
                this.compile(inputStream, outDir);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void compile(InputStream inputStream, String outDir) throws SemanticError {
        IAstAdapter astAdapter = this.getAstAdapter();
        ITastAdapter tastAdapter = this.getTastAdapter();
        IProgramGenerator programGenerator = this.getProgramGenerator();
        Program program = astAdapter.getAst(inputStream);
        var className = program.getClasses().get(0).getIdentifier();
        Program tast = tastAdapter.getTast(program);
        var bc = programGenerator.generateBytecode(tast);
        // Write the bytecode to a file
        var prefix = className + "$";
        // Create folder build if it does not exist
        var buildFolder = new File(outDir);
        if (!buildFolder.exists()) {
            buildFolder.mkdir();
        }
        for (var clazz : bc.keySet()) {
            var fileName = "";
            if (clazz.equals(className)) {
                fileName = clazz;
            } else {
                fileName = prefix + clazz;
            }
            File file = new File(outDir + File.separator + fileName + ".class");
            if (file.exists()) {
                file.delete();
            }
            try {
                file.createNewFile();
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    fos.write(bc.get(clazz));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void runCode(String fileName) {

        // get the file data in a byte hashmap
        File file = new File(fileName);
        HashMap<String, byte[]> bytecode = new HashMap<>();
        if (file.exists()) {
            try {
                InputStream inputStream = new FileInputStream(file);
                var bytecodeClass = inputStream.readAllBytes();
                bytecode.put(file.getName().replaceFirst("[.][^.]+$", ""), bytecodeClass);
                inputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Check if the directory where the file lays has any other files
        var parent = file.getParentFile();
        if (parent == null) {
            parent = new File(".");
        }
        File[] files = parent.listFiles();
        ArrayList<File> filesToRun = new ArrayList<>();
        filesToRun.add(file);
        for (var otherFile : files) {
            var otherFileName = otherFile.getName();
            if (otherFile.toString().contains("$")) {
                var checkClassName = otherFileName.substring(0, otherFileName.indexOf('$'));
                if (checkClassName.equals(file.getName().replaceFirst("[.][^.]+$", ""))) {
                    if (otherFile.exists()) {
                        try {
                            InputStream inputStream = new FileInputStream(otherFile);
                            var bytecodeClass = inputStream.readAllBytes();
                            var className = otherFileName.replaceFirst("[.][^.]+$", "");
                            className = className.substring(className.indexOf('$') + 1, className.length());
                            bytecode.put(className, bytecodeClass);
                            inputStream.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        ReflectLoader loader = new ReflectLoader(bytecode);
        try {
            var main = loader.getMethod(file.getName().replaceFirst("[.][^.]+$", ""), "main");
            Object o = loader.getConstructor(file.getName().replaceFirst("[.][^.]+$", "")).newInstance();
            main.invoke(o);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
