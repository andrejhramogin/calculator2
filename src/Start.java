package calculator;

public class Start {

    Calculator calculator = new Calculator();

    public void start() {
        calculator.start();
        calculator.getResult(calculator.firstNum, calculator.nextNum, calculator.operation);
        calculator.printResult();
        calculator.getNextResult();
    }
}