package common;

import syntaxtree.structure.Program;

import java.io.InputStream;

public interface IAstGenerator {
    Program getAst(InputStream stream);
}
