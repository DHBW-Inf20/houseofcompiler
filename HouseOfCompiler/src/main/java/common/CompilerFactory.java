package common;

import java.io.InputStream;

public interface CompilerFactory {

    IAstAdapter getAstAdapter();

    ITastAdapter getTastAdapter();

    IProgramGenerator getProgramGenerator();

    void compileTest(String fileName);

    void compileTest(InputStream inputStream);

    void compile(String fileName, String outDir);

    void compile(InputStream inputStream, String outDir);

    void generateJar(String fileName, String outFile);

    void generateJar(InputStream inputStream, String outFile);

    void runCode(String fileName);

}
