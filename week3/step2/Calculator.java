package 과제.week3.step2;

public class Calculator {
    private final AddOperation addOperation;
    private final  SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator (AddOperation addOperation,
                       SubstractOperation substractOperation,
                       MultiplyOperation multiplyOperation,
                       DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate (String operator, int number1, int number2) {
        double answer = 0;

        if (operator.equals("+")) {
            answer = addOperation.operate(number1, number2);
        } else if (operator.equals("-")) {
            answer = substractOperation.operate(number1, number2);
        } else if (operator.equals("*")) {
            answer = multiplyOperation.operate(number1, number2);
        } else if (operator.equals("/")) {
            answer = divideOperation.operate(number1, number2);
        }

        return answer;
    }
}