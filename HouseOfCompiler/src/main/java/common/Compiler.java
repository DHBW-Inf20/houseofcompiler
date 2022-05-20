package common;

import codegen.ProgramGenerator;

public class Compiler implements CompilerFactory {

    public Compiler() {

    }

    /**
     * @return CompilerFactory
     */
    public static CompilerFactory getFactory() {
        return new Compiler();
    }

    /**
     * @return IAstAdapter
     */
    @Override
    public IAstAdapter getAstAdapter() {
        return new AstAdapter();
    }

    /**
     * @return ITastAdapter
     */
    @Override
    public ITastAdapter getTastAdapter() {
        return new TastAdapter();
    }

    /**
     * @return IProgramGenerator
     */
    @Override
    public IProgramGenerator getProgramGenerator() {
        return ProgramGenerator::generate;
    }
}
