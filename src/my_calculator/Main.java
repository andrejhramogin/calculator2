package my_calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println(my_calculator.UiMessage.STARTING_MESSAGE);

        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }
}