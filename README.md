# Houseofcompiler

Mini-Java compiler construction project for the 4th semester of computer science at the Baden-Württemberg Cooperative State University in Stuttgart (Horb).

## Supported Java-Subset Syntax

```
Base-Types: int, boolean, char;
Access-Modifier: public, private, protected
Operators: + - * / % || && == != < > <= => ! = ++ --
Statements: if...else, while loop, for loop 
Other Keywords: new, this, null, 
honorable-mentions: - Methods/Constructors are Overloadable
          - statically-imported Methods: 
              - System.out.print 
              - System.out.println 
              - System.err.print 
              - System.err.println
          - Strings can be used in System.out.println
          - Semantic Error-Handling
explicitly left out:
          - no static methods
            - only "public static void main(String[] args)" for the main class
          - no inheritance 
          - no imports and packages
          - no interfaces and abstract classes
          - no Arrays and Exceptions
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

This Project using [maven v4.0.0](https://maven.apache.org/) (With Java 16+) and can be easily built using IntelliJ, Eclipse and other JavaIDE's with the given pom.xml-File

The main-Method is located the `main.main`

## Downloads

You can find the latest `.jar`-Artifacts of the Compiler [here](https://github.com/DHBW-Inf20/houseofcompiler/releases)

### Usage

You can only build code that is preserved into one File.
To later run the file, it needs a `public static void main(String[] args)`-Method like any other normal Java-Program. But its important that the method Name and arguments are written with these exact names. The Compiler cant handle Strings, nor Arrays and nor static Methods, so the main method is a static Parse-Token.

To later run the code, its important to place the main-method in the Class that holds the same Name as the File so it can be identified!

To Show output in code we statically imported following Fields and Methods:
```java
java.lang.System:
          java.io.PrintStream out;
          java.io.PrintStream err;

java.io.PrintStream:
          print(int i);
          print(char c);
          print(boolean b);
          print(String s); // <-- Can only be called like this: System.out.print("Hello"); No Strings itself are implemented
          println(int i);
          println(char c);
          println(boolean b);
          println(String s);
          println();
```

#### Build the file

You can either create a `.class`-File to run it in the java-jre:
```
java -jar HouseOfCompiler.jar <file.java> [out-dir="."]
````
or you can directly create a `.jar`-File from your `.java`-File (that also can be run in the jre, but when it consists of more than 1 file its easier to handle)
```
java -jar HouseOfCompiler.jar -jar <file.java> [out-dir=".]
```

You can then either Run the `.class`-File:
```
java out.class
```

Or run the `.jar`:
```
java -jar out.jar
```
