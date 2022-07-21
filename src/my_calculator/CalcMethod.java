package my_calculator;

import java.util.Scanner;

public class CalcMethod {

    public static final Scanner SCAN = new Scanner(System.in);

    public static double getNumber(String str) {
        double num = 0;
        System.out.println(str);
        if (SCAN.hasNextDouble()) {
            num = SCAN.nextDouble();
        } else if (scanChar() == UiMessage.QUIT) {
            close();
        } else {
            System.out.print(UiMessage.ENTER_WRIGHT_NUMBER);
            num = getNumber(UiMessage.EMPTY_STRING);
        }
        return num;
    }

    public static char getOperation(String str) {
        System.out.print(str);
        char operation = scanChar();
        switch (operation) {
            case UiMessage.PLUS:
                break;
            case UiMessage.MINUS:
                break;
            case UiMessage.MULTIPLY:
                break;
            case UiMessage.DIVIDE:
                break;
            case UiMessage.QUIT:
                close();
            default:
                System.out.println(UiMessage.WRONG_OPERATION);
                operation = getOperation(UiMessage.EMPTY_STRING);
        }
        return operation;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        while (b == 0) {
            b = getNumber( UiMessage.CANNOT_DIVIDED_BY_0 + " " + UiMessage.ENTER_WRIGHT_NUMBER);
        }
        return a / b;
    }

    public static void close() {
        System.out.println(UiMessage.CALC_CLOSED);
        System.exit(0);// какой вариант остановки лучше? scan.close or System.exit(0)?
//        SCAN.close();

    }

    private static char scanChar (){
        return SCAN.next().charAt(0);
    }
}

