# Houseofcompiler

Mini-Java compiler construction project for the 4th semester of computer science at the Baden-Württemberg Cooperative State University in Stuttgart (Horb).

## Supported Java-Subset Syntax

```java
Base-Types: int, boolean, char;
Access-Modifier: public, private, protected
Operators: + - * / % || && == != < > <= => ! = 
Statements: if...else, while loop, 
Other Keywords: new, this, null, 
mentions: - Methods/Constructors are Overloadable
          - statically-imported Methods: 
              - System.out.print 
              - System.out.println 
              - System.err.print 
              - System.err.println
          - Strings can be used in System.out.println
          - no inheritance 
          - no imports and packages
          - no interfaces and abstract classes
          - no Arrays and Exceptions
          - no static methods
            - only "public static void main(String[] args)" for the main class
```

## Used Tools

* [ANTLR4 v4.9.2](https://www.antlr.org/)
  * Used to parse the Code into an Abstract Syntax Tree
* [ASM v9.3](https://asm.ow2.io/) 
  * Used to generate Bytecode out of the Typed Syntax Tree 

## Project-Structure

```plain
└───java
    ├───codegen <-- ProgramGenerator to generate the Bytecode
    │   └───utils
    ├───common <-- Commonly Used Java-Classes 
    ├───context <-- Context-Classes used in the Semantic Check and Codegen
    ├───main <-- Main Classes
    ├───parser 
    │   ├───adapter <-- Adapter to create the Syntax-Tree (AST)
    │   ├───generated <-- generated ANTLR Code
    │   └───grammar <-- ANTLR .g4-File
    ├───semantic <-- SemanticVisitor to TypeCheck the AST into a T(yped)AST
    │   └───exceptions
    ├───syntaxtree <-- General Java-Class Structrue to model the AST
    │   ├───expressions
    │   ├───statementexpression
    │   ├───statements
    │   └───structure
    └───visitor <-- Visitor-Interfaces for the visitor-pattern
        └───codevisitor 
```
### Class-Diagram for the (T)AST-Structure
![UML-Diagram](https://github.com/DHBW-Inf20/houseofcompiler/blob/main/class_diagram.svg)

## Components

### Parsing + Abstract Syntax Tree

Implemented by Lukas Epple ([@LukasEEH](https://github.com/LukasEEH)):
* ANTL-Grammar for the JavaSubset
* Adapter to generate the Abstract Syntax Tree


### Semantic Check + Typed Syntax Tree

Implemented by Luca Negron ([@Lucs77777](https://github.com/Lucs77777)):
* Semantic-Visitors to typecheck the entire Syntax Tree
* Semantic Error Handling

### Bytecode generation

Implemented by Fabian Klimpel ([@FabiKl](https://github.com/FabiKl)):
* Translation from Abstract Syntax Tree to Java-Bytecode with ASM

### Testing 

Implemented by Raphael Sack ([@Raqhael](https://github.com/Raqhael)):
* Tests to check if the Abstract Syntax Tree is generated correctly
* Tests to check wheter the Semantic-Check types the AST correctly and throws errors
* Tests to check if the Byte-Code is generated correctly (Tested with Java-Reflections)
* Integration Tests for the Whole Compiler to check different Use Cases

## Installation

This Project using [maven v4.0.0](https://maven.apache.org/) and can be easily installed when using IntelliJ, Eclipse and other JavaIDE's

## Usage

When you wanna Test the Compiler without building a jar file, you can simply go to `src.main.java.main.Testing.java` and Compiles the given .java-File (found in `src.main.resources.*`). It will run the Compiler, builds the .class-Files into the `./build`-Directory and a Java-Reflection loader will invoke a non-statically main method and prints the output to the stdout.

## Downloads

You can find the latest `.jar`-Artifacts of the Compiler and runner [here](https://github.com/DHBW-Inf20/houseofcompiler/releases)

### Usage

Since we cant declare static methods, there isnt a `static void main`-Method, thus we created a Reflection-Wrapper that is loading the classFiles, instantiates the received class with the default constructor and invokes the main method. So a basic File should look like this:

```java
class Test{

          public Test(){} // <-- Always set the default constructor if you use one with parameters
          
          void main(){
                    //...Code to execute
          }

}
```

You can then build the Class with:
```
java -jar HouseOfCompiler.jar ./Path/to/Test.java [outdir="."]
````

All The necessary `.class`-Files are now being build and will appear in the specified Out-Directory (if non is specified, it defaults to ".")
If there were multiple Classes in one `.java`-File the Compiler will write the class files with a "`MainClass$`"-Prefix, where `MainClass` is the Name that is obtained from the FileName (e.g. if there is a class `Test` and another `Test2` in the same File but the filename is `Test.java` the Compiler will produce a `Test.class` and a `Test$Test2.class`) 

You can now run the main-.class File with:
```
java -jar HouseOfCompiler.jar outDir/Test.class
```
If the original .java File contained more than One class, it will be loaded automatically with the other prefixed-`.class` Files.



