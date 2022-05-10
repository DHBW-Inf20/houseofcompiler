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
        return new AstGenerator();
    }

    @Override
    public ITastGenerator getTastGenerator() {
        return new TastGenerator();
    }

    @Override
    public IProgramGenerator getProgramGenerator() {
        return ProgramGenerator::generate;
    }
}
