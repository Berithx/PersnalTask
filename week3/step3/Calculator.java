package 과제.week3.step3;

public class Calculator {

    private AbstractOperation operation;

    public Calculator (AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation (AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate (int number1, int number2) {
        double answer = 0;

        answer = operation.operate(number1, number2);

        return answer;
    }
}