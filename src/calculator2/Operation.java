package calculator2;

public enum Operation {
    SUMMATION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION;

    public static Operation operation;

    public static Operation getOperationType(char mathOperation) {
        if (mathOperation == '+') {
            operation = SUMMATION;
        } else if (mathOperation == '-') {
            operation = Operation.SUBTRACTION;
        } else if (mathOperation == '*') {
            operation = Operation.MULTIPLICATION;
        } else if (mathOperation == '/') {
            operation = Operation.DIVISION;
        } else {
            System.out.println(UiMessage.WRONG_OPERATION);
            operation = getOperationType(NewUiCalc.getChar());
        }
        return operation;
    }
}
