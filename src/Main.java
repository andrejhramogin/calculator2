package calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Console calculator\n" + "\"+\" - summation\n" +
                "\"-\" - subtraction\n" + "\"*\" - multiplication\n" + "\"/\" - division\n");

        Start calculator = new Start();
        calculator.start();

//        NewUiCalc newUiCalc = new NewUiCalc();
//        newUiCalc.start();
    }
}