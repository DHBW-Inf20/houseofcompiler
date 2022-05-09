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
//int a, {...}, return a, while(a > 10){...}, for(i=0;i<10;i++){...}, if(...){...} else if{...} else{...}
statement: localVarDecl | block | returnStmt | whileStmt | forStmt | ifStmt | stmtExpr;
//a = expr, new Object(), method(param1)
stmtExpr: assign | newDecl | methodCall;
//property, a = expr, a = 3+1, a = 3
expression: Identifier | instVar | binaryExpr | value;

localVarDecl: type Identifier;
block: OpenCurlyBracket ClosedCurlyBracket
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
