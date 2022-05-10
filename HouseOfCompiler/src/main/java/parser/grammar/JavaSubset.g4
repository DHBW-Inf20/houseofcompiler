grammar JavaSubset;

program: classdecl+;

//class identifier{...}
classdecl: 'class' Identifier OpenCurlyBracket (constuctorDecl|fieldDecl|methodDecl)* ClosedCurlyBracket;
constuctorDecl: AccessModifier? Identifier OpenRoundBracket parameterList? ClosedRoundBracket block;
//public static void main(string[] args) {...}
methodDecl: AccessModifier? (type | Void | Identifier) Identifier OpenRoundBracket parameterList? ClosedRoundBracket block;
fieldDecl: AccessModifier? (type | Identifier) Identifier (Equal expression)? Semicolon;
//int param1, string param2,...
parameterList: parameter(Comma parameter)*;
//int param1
parameter: (type|Identifier) Identifier;

argumentList: expression? | expression (Comma expression)*?;
//property, object.a, 3+1, a = 3
expression: subExpression | binaryExpr; //FIXME unary Expressions fehlen noch
//subExpression zur Auflösung der Linksrekursion in der Grammatik
subExpression: Identifier | instVar | value | stmtExpr | OpenRoundBracket expression ClosedRoundBracket;
//FIXME macht es mehr sinn den Methodenaufruf rekursiv umzusetzen? sodass vorstehende Methodenaufrufe als reciever gehandhabt werden?
//methodCall: reciever Identifier OpenRoundBracket argumentList ClosedRoundBracket
//reciever: (instVar | Identifier Dot | methodCall Dot)
methodCall: reciever? (Identifier OpenRoundBracket argumentList ClosedRoundBracket Dot)* Identifier OpenRoundBracket argumentList ClosedRoundBracket;
//int a, {...}, while(a > 10){...}, for(i=0;i<10;i++){...}, if(...){...} else if{...} else{...}
statement: returnStmt Semicolon | localVarDecl Semicolon | block | whileStmt | ifElseStmt | stmtExpr Semicolon;
//a = expr, new Object(), method(param1)
stmtExpr: assign | newDecl | methodCall;

instVar: This Dot Identifier | (This Dot)? (Identifier Dot)+ Identifier;

binaryExpr: subExpression operator expression; //FIXME muss hier auch subExpression stehen?

operator: DotOperator | LineOperator | LogicalOpertor | ComparisonOperator;

returnStmt: Return expression;

localVarDecl: (type | Identifier) Identifier (Assign expression)?;

block: OpenCurlyBracket statement* ClosedCurlyBracket;

whileStmt: While OpenRoundBracket expression ClosedRoundBracket block;

ifElseStmt: ifStmt elseIfStmt* elseStmt?;
ifStmt: If OpenRoundBracket expression ClosedRoundBracket block;
elseIfStmt: Else If OpenRoundBracket expression ClosedRoundBracket block; //FIXME kann man das hier einfach durch ein ifstatement verkürzen?
elseStmt: Else block;

assign: (instVar | Identifier) Assign expression;
newDecl: New Identifier OpenRoundBracket argumentList ClosedRoundBracket;
reciever: (instVar | Identifier Dot);
type: Int | Boolean | Char;
value: IntValue | BooleanValue | CharValue;

//Access modifier
AccessModifier: 'public' | 'private' | 'protected';

//Types
Void: 'void';
Boolean: 'boolean';
Char: 'char';
Int: 'int';

//Operators
DotOperator: Mult | Div;
LineOperator: Plus | Minus;
ComparisonOperator: Greater | Less | GreaterEqual | LessEqual | Equal | NotEqual;
LogicalOpertor: And | Or;

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
New: 'new';

fragment Alpabetic : [a-zA-Z];
fragment Numeric: [0-9];
fragment ValidIdentSymbols : Alpabetic|Numeric|'$'|'_';
Identifier: Alpabetic ValidIdentSymbols*;

//Values
BooleanValue: 'true'|'false';
CharValue: Alpabetic;
IntValue: Minus? Numeric+;

WS: ([ \t\r\n]+) -> skip;
