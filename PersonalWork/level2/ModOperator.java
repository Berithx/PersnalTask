package 과제.PersonalWork.level2;

public class ModOperator implements Operator {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
