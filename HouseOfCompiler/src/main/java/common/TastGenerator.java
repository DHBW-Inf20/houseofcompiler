package common;

import syntaxtree.structure.Program;

public class TastGenerator implements ITastGenerator {

    /**
     * @param ast
     * @return Program
     */
    @Override
    public Program getTast(Program ast) {

        return ast;
    }
}
