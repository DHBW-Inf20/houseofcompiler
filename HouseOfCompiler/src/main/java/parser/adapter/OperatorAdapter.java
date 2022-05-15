package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;
import syntaxtree.statementexpression.Assign;

public class OperatorAdapter {
    public static Operator adapt(JavaSubsetParser.OperatorContext operatorContext){
        String operator = operatorContext.getText();
        switch (operator){
            case "=": return Operator.ASSIGN;
            case "+": return Operator.PLUS;
            case "-": return Operator.MINUS;
            case "*": return Operator.MULT;
            case "/": return Operator.DIV;
            case ">": return Operator.GREATER;
            case "<": return Operator.LESS;
            case ">=": return Operator.GREATEREQUAL;
            case "<=": return Operator.LESSEQUAL;
            case "==": return Operator.EQUAL;
            case "!=": return Operator.NOTEQUAL;
            case "&&": return Operator.AND;
            default: return Operator.OR;
        }
    }
}
