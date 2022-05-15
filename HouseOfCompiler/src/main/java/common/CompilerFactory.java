package common;

public interface CompilerFactory {

    IAstAdapter getAstAdapter();
    ITastAdapter getTastAdapter();
    IProgramGenerator getProgramGenerator();

}
