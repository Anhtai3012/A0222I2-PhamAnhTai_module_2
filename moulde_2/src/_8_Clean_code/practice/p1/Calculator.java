package _8_Clean_code.practice.p1;

public class Calculator {
    public static int calculate(int firstOperator, int secondOperator, char operator) {
        switch (operator) {
            case '+':
                return firstOperator +secondOperator ;
            case '-':
                return firstOperator - secondOperator;
            case '*':
                return firstOperator * secondOperator;
            case '/':
                if (secondOperator!= 0)
                    return firstOperator / secondOperator;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
