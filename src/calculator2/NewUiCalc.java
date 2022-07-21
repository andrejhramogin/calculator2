package calculator2;

import java.util.Scanner;

public class NewUiCalc {

    public static final Scanner SCAN = new Scanner(System.in);
    private final NewCalc newCalc = new NewCalc();
    static Operation mathOp;

    public void start() {
        newCalc.setNum1(inputNumber(UiMessage.ENTER_THE_FIRST_NUMBER));

        char mathOperation = getChar();
        mathOp = Operation.getOperationType(mathOperation);

        newCalc.setNum2(inputNumber(UiMessage.ENTER_THE_NEXT_NUMBER));

        System.out.println(UiMessage.RESULT_IS +  newCalc.getResult());
    }

    public static double inputNumber(String msg) {
        double result;
        System.out.println(msg);
        if (SCAN.hasNextDouble()) {
            result = SCAN.nextDouble();
        } else {
            System.out.print(UiMessage.ENTER_WRIGHT_NUMBER);
            SCAN.next();
            result = inputNumber(UiMessage.EMPTY_STRING);
        }
        return result;
    }

    public static char getChar(){
        System.out.print(UiMessage.ENTER_OPERATION);
        return (SCAN.next().charAt(0));
    }
}
