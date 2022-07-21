package my_calculator;

public class Calculator {

    private double firstNum, nextNum;
    private char operation;
    private double result;

    public void startCalculator() {
        dataEntry();
        getResult(firstNum, operation, nextNum);
        printResult();
        getNextResult();
    }

    public void dataEntry() {

        firstNum = CalcMethod.getNumber(UiMessage.ENTER_THE_FIRST_NUMBER);

        operation = CalcMethod.getOperation(UiMessage.ENTER_OPERATION);

        nextNum = CalcMethod.getNumber(UiMessage.ENTER_THE_NEXT_NUMBER);
    }

    public double getResult(double first, char operation, double second) {
        switch (operation) {
            case UiMessage.PLUS:
                result = CalcMethod.sum(first, second);
                break;
            case UiMessage.MINUS:
                result = CalcMethod.subtract(first, second);
                break;
            case UiMessage.MULTIPLY:
                result = CalcMethod.multiply(first, second);
                break;
            case UiMessage.DIVIDE:
                result = CalcMethod.divide(first, second);
                break;
        }
        return result;
    }

    public double getNextResult() {
        operation = CalcMethod.getOperation(UiMessage.ENTER_OPERATION);
        nextNum = CalcMethod.getNumber(UiMessage.ENTER_THE_NEXT_NUMBER);
        getResult(result, operation, nextNum);
        printResult();
        result = getNextResult();
        return result;
    }

    public void printResult() {
        System.out.println(UiMessage.RESULT_IS + result);
    }
}
