package 과제.week3.step1;

public class Calculator {
    public Calculator () {
    }
    public double calculate(String operator, int firstNumber, int secondNumber) {
        double answer = 0;

        if (operator.equals("+")) {
            answer = (double) firstNumber + (double) secondNumber;
        } else if (operator.equals("-")) {
            answer = (double) firstNumber - (double) secondNumber;
        } else  if (operator.equals("*")) {
            answer = (double) firstNumber * (double) secondNumber;
        } else if (operator.equals("/")) {
            answer = (double) firstNumber / (double) secondNumber;
        } else if (operator.equals("%")) {
            answer = (double) firstNumber % (double)  secondNumber;
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        System.out.println("계산 결과 : " + answer + " 입니다.");
        return answer;
    }
}
