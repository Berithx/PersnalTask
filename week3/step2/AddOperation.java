package 과제.week3.step2;

public class AddOperation {

    public AddOperation() {
    }

    public double operate(int number1, int number2) {
        double answer;
        answer = (double) number1 + (double) number2;
        System.out.println(answer);
        return answer;
    };
}