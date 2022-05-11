package common;

import codegen.ProgramGenerator;

public class Compiler implements CompilerFactory{

    public Compiler(){

    }

    public static CompilerFactory getFactory(){
        return new Compiler();
    }

    @Override
    public IAstAdapter getAstAdapter() {
        return new AstAdapter();
    }

    @Override
    public ITastAdapter getTastAdapter() {
        return new TastAdapter();
    }

    @Override
    public IProgramGenerator getProgramGenerator() {
        return ProgramGenerator::generate;
    }
}
