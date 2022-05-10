package common;

public interface CompilerFactory {

    IAstGenerator getAstGenerator();
    ITastGenerator getTastGenerator();
    IProgramGenerator getProgramGenerator();

}
