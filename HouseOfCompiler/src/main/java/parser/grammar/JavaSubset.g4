grammar JavaSubset;

program: classdecl+;

//class identifier{...}
classdecl: 'class' Identifier OpenCurlyBracket (constuctorDecl|fieldDecl|methodDecl)* ClosedCurlyBracket;
constuctorDecl: AccessModifier? Identifier OpenRoundBracket parameterList? ClosedRoundBracket block;
//public static void main(string[] args) {...}
methodDecl: AccessModifier? (type | Void) Identifier OpenRoundBracket parameterList? ClosedRoundBracket block;
fieldDecl: AccessModifier? type Identifier Semicolon;
//int param1, string param2,...
parameterList: parameter(Comma parameter)*;
//int param1
parameter: type Identifier;

argumentList: expression? | expression (Comma expression)*?;
//property, object.a, 3+1, a = 3
expression: subExpression | binaryExpr; //FIXME unary Expressions fehlen noch

//subExpression to dissolve left-recusion
subExpression: Identifier | instVar | value | stmtExpr | unaryExpr | OpenRoundBracket expression ClosedRoundBracket;

//FIXME macht es mehr sinn den Methodenaufruf rekursiv umzusetzen? sodass vorstehende Methodenaufrufe als reciever gehandhabt werden?
//methodCall: reciever Identifier OpenRoundBracket argumentList ClosedRoundBracket
//reciever: (instVar | Identifier Dot | methodCall Dot)
//reciever kann (fast beliebige) expression sein (methodenaufrufe mit dot in reciever auslagern)
methodCall: receiver? receivingMethod* Identifier OpenRoundBracket argumentList ClosedRoundBracket;
//int a, {...}, while(a > 10){...}, for(i=0;i<10;i++){...}, if(...){...} else if{...} else{...}
statement: returnStmt Semicolon | localVarDecl Semicolon | block | whileStmt | ifElseStmt | stmtExpr Semicolon;
//a = expr, new Object(), method(param1)
stmtExpr: assign | newDecl | methodCall;

unaryExpr: Not expression;

instVar: This Dot Identifier | (This Dot)? (Identifier Dot)+ Identifier;

binaryExpr: subExpression operator expression;

operator: DotOperator | LineOperator | LogicalOpertor | ComparisonOperator | Not;

BooleanValue: 'true'|'false';
NullValue: 'null';

//Statements
returnStmt: Return expression;
localVarDecl: type Identifier (Assign expression)?;
block: OpenCurlyBracket statement* ClosedCurlyBracket;
whileStmt: While OpenRoundBracket expression ClosedRoundBracket block;
ifElseStmt: ifStmt elseStmt?;
ifStmt: If OpenRoundBracket expression ClosedRoundBracket statement;
elseStmt: Else statement;
assign: (instVar | Identifier) Assign expression;
newDecl: New Identifier OpenRoundBracket argumentList ClosedRoundBracket;
receiver: ((This | instVar | newDecl | Identifier) Dot);
receivingMethod: Identifier OpenRoundBracket argumentList ClosedRoundBracket Dot; //reciever?
type: Int | Boolean | Char | Identifier;
value: IntValue | BooleanValue | CharValue | NullValue;

//Access modifier
AccessModifier: 'public' | 'private' | 'protected';

//Types
Void: 'void';
Boolean: 'boolean';
Char: 'char';
Int: 'int';

//Operators
DotOperator: Mult | Div | Modulo;
LineOperator: Plus | Minus;
ComparisonOperator: Greater | Less | GreaterEqual | LessEqual | Equal | NotEqual;
LogicalOpertor: And | Or;

Assign: '=';
Plus: '+';
Minus: '-';
Mult: '*';
Modulo: '%';
Div: '/';
Greater: '>';
Less: '<';
GreaterEqual: '>=';
LessEqual: '<=';
Equal: '==';
NotEqual: '!=';
Not: '!';
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

//Identifier
fragment Alpabetic : [a-zA-Z];
fragment Numeric: [0-9];
fragment ValidIdentSymbols : Alpabetic|Numeric|'$'|'_';
Identifier: Alpabetic ValidIdentSymbols*;

//Values
CharValue: '\'' Alpabetic '\'';
IntValue: Minus? Numeric+;

//To be Ignored
WS: ([ \t\r\n]+) -> skip;
InlineComment:'//' ~[\r\n]* -> skip;
MultilineComment: '/*' .*? '*/' -> skip;
