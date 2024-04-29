package 과제.week4;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String number1Input) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, number1Input)) {
            throw new BadInputException("정수를");
        }
        this.calculator.setNumber1(Integer.parseInt(number1Input));

        return this;
    }

    public Parser parseSecondNum(String number2Input) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, number2Input)) {
            throw new BadInputException("정수를");
        }
        this.calculator.setNumber2(Integer.parseInt(number2Input));

        return this;
    }

    public Parser parseOperator (String operationInput) throws BadInputException {
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("사칙 연산자를");
        }

        switch (operationInput) {
            case "+" : this.calculator.setOperation(new AddOperation());
                break;
            case "-" : this.calculator.setOperation(new SubstractOperation());
                break;
            case "*" : this.calculator.setOperation(new MultiplyOperation());
                break;
            case "/" : this.calculator.setOperation(new DivideOperation());
                break;
        }
        return  this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
