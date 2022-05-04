grammar JavaSubset;

program: classdecl*;

//class identifier{...} //TODO Access Modifier?
classdecl: Class Identifier OpenCurlyBracket (statement|methodDecl)* ClosedCurlyBracket;
//public static void main(string[] args) {...}
methodDecl: accessModifier? type Identifier OpenRoundBracket parameterDeclList? ClosedRoundBracket OpenCurlyBracket statement* returnStmt? ClosedCurlyBracket;
//int param1, string param2,...
parameterDeclList: parameterDecl(Comma parameterDecl);
parameterList: parameter(Comma parameter)*;
//int param1
parameterDecl: type Identifier;
//ident | methodCall() | ...
parameter: stmtExpr | expression;
//int a, {...}, return
statement: localVarDecl | block | returnStmt | whileStmt | forStmt | ifStmt | stmtExpr;
stmtExpr: assign | newDecl | methodCall;
expression: Identifier | instVar | unaryExpr | binaryExpr | value;
accessModifier: (Public | Private | Protected)? Static?;
returnStmt: Return (expression|stmtExpr);
type: Int | Boolean | Char;
value: IntValue | BooleanValue | CharValue;

Identifier: Alpabetic ValidIdentSymbols*;
fragment Alpabetic : [a-zA-Z];
fragment Numeric: [0-9];
fragment ValidIdentSymbols : Alpabetic|Numeric|'$'|'_';

//Access modifier
Public: 'public';
Private: 'private';
Protected: 'protected';
Static: 'static';

//Types
Void: 'void';
Boolean: 'boolean';
Char: 'char';
Int: 'int';

//Values
BooleanValue: 'true'|'false';
CharValue: Alpabetic;
IntValue: Minus? Numeric*;

//Operators
Assign: '=';
Plus: '+';
Minus: '-';
Mult: '*';
Div: '/';
Greater: '>';
Less: '<';
GreaterEqual: '>=';
LessEqual: '<=';
Equal: '==';
NotEqual: '!=';
And: '&&';
Or: '||';

//Symbols
Dot: '.';
OpenRoundBracket: '(';
ClosedRoundBracket: ')';
OpenCurlyBracket: '{';
ClosedCurlyBracket: '}';
Semicolon: ';';
Comma: ',';

//Keywords
Class: 'class';
This: 'this';
While: 'while';
If: 'if';
Else: 'else';
For: 'for';
Return: 'return';
