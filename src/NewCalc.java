package calculator;

public class NewCalc {

    private double num1;
    private double num2;
    Operation operation;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double getResult() {
        double result = 0.0;

        switch (operation) {
            case SUMMATION:
                result = sum(num1, num2);
                break;
            case SUBTRACTION:
                result = subtract(num1, num2);
                break;
            case DIVISION:
                while (num2 == 0) {
                    num2 = NewUiCalc.inputNumber("It can`t be divided by 0. Enter another number");
                }
                result = divide(num1, num2);
                break;
            case MULTIPLICATION:
                result = multiply(num1, num2);
                break;
        }
        return result;
    }

    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private double divide(double num1, double num2) {
        return num1 / num2;
    }

    private double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
