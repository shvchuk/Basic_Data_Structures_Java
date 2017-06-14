package StackExpressionCalculator;

public class App {
    public static void main(String[] args) {

        ExpressionCalculator calculator = new ExpressionCalculator();

        calculator.calculateExpression("( 10 - 4 ) / ( 2 )");

        calculator.result();

        calculator.calculateExpression("( ( 5 + 10 ) / ( 2 + 3 ) )");

        calculator.result();

    }

}
