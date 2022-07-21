package calculator2;

public class NewCalc {

    private double num1;
    private double num2;

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

    public double getResult() {
        double result = 0.0;
        switch (NewUiCalc.mathOp) {
            case SUMMATION:
                result = sum(num1, num2);
                break;
            case SUBTRACTION:
                result = subtract(num1, num2);
                break;
            case DIVISION:
                while (num2 == 0) {
                    num2 = NewUiCalc.inputNumber(UiMessage.CANNOT_DIVIDED_BY_0 + " " + UiMessage.ENTER_WRIGHT_NUMBER);
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
