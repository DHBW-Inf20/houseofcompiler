package common;

import syntaxtree.structure.Program;

import java.util.HashMap;

public interface IProgramGenerator {
    HashMap<String, byte[]> generateBytecode(Program program);
}
