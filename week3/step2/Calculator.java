package 과제.week3.step2;

public class Calculator {

    public Calculator () {
    }

    public void calculate (String operator, int number1, int number2) {

        if (operator.equals("+")) {
            AddOperation add = new AddOperation();
            add.operate(number1, number2);
        } else if (operator.equals("-")) {
            SubstractOperation substract = new SubstractOperation();
            substract.operate(number1, number2);
        } else if (operator.equals("*")) {
            MultiplyOperation multiply = new MultiplyOperation();
            multiply.operate(number1, number2);
        } else if (operator.equals("/")) {
            DivideOperation divide = new DivideOperation();
            divide.operate(number1, number2);
        }
    }
}