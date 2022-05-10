package common;

import syntaxtree.structure.Program;

public interface ITastGenerator {

    Program getTast(Program ast);

}
