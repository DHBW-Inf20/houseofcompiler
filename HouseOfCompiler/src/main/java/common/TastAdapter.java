package common;

import semantic.SemanticCheck;
import syntaxtree.structure.Program;

public class TastAdapter implements ITastAdapter {

    /**
     * @param ast
     * @return Program
     */
    @Override
    public Program getTast(Program ast) {
        return SemanticCheck.generateTast(ast);
    }
}
