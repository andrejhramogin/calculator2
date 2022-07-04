import java.util.Scanner;

public class NewUiCalc {

    private static final Scanner SCAN = new Scanner(System.in);
    private final NewCalc newCalc = new NewCalc();

    public void start() {
        newCalc.setNum1(inputNumber("Enter the first number:"));
        inputOperation("Enter the operation (+, -, *, /): ");
        newCalc.setNum2(inputNumber("Enter the second number:"));
        System.out.println(newCalc.getResult());
    }

    public static double inputNumber(String msg) {
        double result;
        System.out.println(msg);
        if (SCAN.hasNextDouble()) {
            result = SCAN.nextDouble();
        } else {
            System.out.print("Wrong number. Try agan: ");
            SCAN.next();
            result = inputNumber("");
        }
        return result;
    }

    private void inputOperation(String msg) {
        System.out.println(msg);
        switch (SCAN.next().charAt(0)) {
            case '+':
                newCalc.setOperation(Operation.SUMMATION);
                break;
            case '-':
                newCalc.setOperation(Operation.SUBTRACTION);
                break;
            case '/':
                newCalc.setOperation(Operation.DIVISION);
                break;
            case '*':
                newCalc.setOperation(Operation.MULTIPLICATION);
                break;
            default:
                System.out.print("Wrong operation. Try agan (+, -, *, /)");
                inputOperation("");
        }
    }

}
