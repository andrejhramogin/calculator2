package calculator2;

public class UiMessage {

    public static final String ENTER_THE_FIRST_NUMBER;
    public static final String WRONG_OPERATION;
    public static final String ENTER_THE_NEXT_NUMBER;
    public static final String STARTING_MESSAGE;
    public static final String ENTER_WRIGHT_NUMBER;
    public static final String EMPTY_STRING;
    public static final String ENTER_OPERATION;
    public static final String CANNOT_DIVIDED_BY_0;
    public static final String RESULT_IS;

    static {
        STARTING_MESSAGE = "Console calculator\n" + "\"+\" - summation\n" +
                "\"-\" - subtraction\n" + "\"*\" - multiplication\n" + "\"/\" - division\n";
        ENTER_THE_FIRST_NUMBER = "Enter the first number:";
        ENTER_OPERATION = "Enter an operation (+, -, /, *) :\n";
        ENTER_THE_NEXT_NUMBER = "Enter the next number:";
        ENTER_WRIGHT_NUMBER = "Enter the wright number:";
        WRONG_OPERATION = "Wrong operation, try agan (+, -, /, *): ";
        EMPTY_STRING = "";
        CANNOT_DIVIDED_BY_0 = "Cannot be divided by 0.";
        RESULT_IS = "Result is: ";
    }
}
