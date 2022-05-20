package common;

import semantic.SemanticCheck;
import syntaxtree.structure.Program;

public class TastAdapter implements ITastAdapter {

    @Override
    public Program getTast(Program ast) {
        return SemanticCheck.generateTast(ast);
    }
}
