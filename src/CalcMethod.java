package calculator;

import java.util.Scanner;

public class CalcMethod {

    private final Calculator calculator = new Calculator();
    private static final Scanner scan = new Scanner(System.in);

    public static double getNumber(String str) {
        double num = 0;
        System.out.println(str);
        if (scan.hasNextDouble()) {
            num = scan.nextDouble();
        } else if (scan.next().charAt(0) == 'q') {
            close();
        } else {
            System.out.print("Enter the wright number:");
            scan.next();
            num = getNumber("");
        }
        return num;
    }

//    public static char getChar(String str) {
//        char operation;
//        System.out.print(str);
//        operation = scan.next().charAt(0);
//        if (operation == 'q') {
//            close();
//        }
//        return operation;
//    }

    public static char getChar2(String str) {
//        char operation;
        System.out.print(str);
        char operation = scan.next().charAt(0);
        switch (operation) {
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;
            case '/':
                break;
            case 'q':
                close();
            default:
                System.out.println("Wrong operation, try agan (+, -, /, *, q (quit)): ");
                operation = getChar2("");
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
            b = getNumber("It can`t be divided by 0. Enter another number");
        }
        return a / b;
    }

    public static void close() {
        System.out.println("Calculator is closed.");
        System.exit(0);// какой вариант остановки лучше? scan.close or System.exit(0)?
//            scan.close();
    }
}

