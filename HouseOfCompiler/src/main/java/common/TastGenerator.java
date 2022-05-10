package common;

import syntaxtree.structure.Program;

public class TastGenerator implements ITastGenerator{

    @Override
    public Program getTast(Program ast) {

        return ast;
    }
}
