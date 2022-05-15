package common;

import syntaxtree.structure.Program;

import java.io.InputStream;

public interface IAstAdapter {
    Program getAst(InputStream stream);
}
