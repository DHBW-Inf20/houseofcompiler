package common;

import syntaxtree.structure.Program;

public class TastAdapter implements ITastAdapter{

    @Override
    public Program getTast(Program ast) {

        return ast;
    }
}
