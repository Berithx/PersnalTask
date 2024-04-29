package 과제.week4;

public class Calculator {
    private int number1;
    private int number2;

    private AbstractOperation operation;

    public Calculator (AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation (AbstractOperation operation) {
        this.operation = operation;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double calculate () {
        double answer = 0;

        answer = operation.operate(this.number1, this.number2);

        return answer;
    }
}