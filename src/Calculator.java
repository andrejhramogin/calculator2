public class Calculator {

    public double firstNum, nextNum;
    public char operation;
    public double result;

    public void printResult() {
        System.out.println("Result is " + result);
    }

    public void start() {

        firstNum = CalcMethod.getNumber("Enter the first number:");

        operation = CalcMethod.getChar2("Enter an operation (+, -, /, *, q (quit)) :\n");

        nextNum = CalcMethod.getNumber("Enter the next number:");
    }

    public double getResult(double first, double second, char op) {
        switch (operation) {
            case '+':
                result = CalcMethod.sum(first, second);
                break;
            case '-':
                result = CalcMethod.subtract(first, second);
                break;
            case '*':
                result = CalcMethod.multiply(first, second);
                break;
            case '/':
                result = CalcMethod.divide(first, second);
                break;
//            default:
//                System.out.println("Wrong operation, try agan (+, -, /, *, q (quit)): ");
//                operation = CalcMethod.getChar("");
//                result = getResult(first, second, operation);
//                break;
        }
        return result;
    }

    public double getNextResult() {

        operation = CalcMethod.getChar2("Enter an operation (+, -, /, *, q (quit)) :\n");
        nextNum = CalcMethod.getNumber("Enter the next number: ");
        getResult(result, nextNum, operation);
        printResult();
        result = getNextResult();
        return result;
    }
}
