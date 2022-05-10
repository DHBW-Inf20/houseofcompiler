package common;

import codegen.ProgramGenerator;

public class Compiler implements CompilerFactory{

    public Compiler(){

    }

    public static CompilerFactory getFactory(){
        return new Compiler();
    }

    @Override
    public IAstGenerator getAstGenerator() {
        return null;
    }

    @Override
    public ITastGenerator getTastGenerator() {
        return null;
    }

    @Override
    public IProgramGenerator getProgramGenerator() {
        return ProgramGenerator::generate;
    }
}
