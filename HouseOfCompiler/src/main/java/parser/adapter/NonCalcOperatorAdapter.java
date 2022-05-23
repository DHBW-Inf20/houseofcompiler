package parser.adapter;

import common.Operator;
import parser.generated.JavaSubsetParser;

public class NonCalcOperatorAdapter {

    /**
     * @param operatorContext
     * @return Operator
     */
    public static Operator adapt(JavaSubsetParser.NonCalcOperatorContext operatorContext) {
        String operator = operatorContext.getText();
        switch (operator) {
            case "=":
                return Operator.ASSIGN;
            case "+":
                return Operator.PLUS;
            case "-":
                return Operator.MINUS;
            case "*":
                return Operator.MULT;
            case "/":
                return Operator.DIV;
            case ">":
                return Operator.GREATER;
            case "<":
                return Operator.LESS;
            case ">=":
                return Operator.GREATEREQUAL;
            case "<=":
                return Operator.LESSEQUAL;
            case "==":
                return Operator.EQUAL;
            case "!=":
                return Operator.NOTEQUAL;
            case "!":
                return Operator.NOT;
            case "&&":
                return Operator.AND;
            case "||":
                return Operator.OR;
            case "%":
                return Operator.MOD;
            default:
                return null;
        }
    }
}
