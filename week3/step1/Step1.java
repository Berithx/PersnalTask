package 과제.week3.step1;

import java.util.Scanner;

public class Step1 {
    static String operator;
    static int firstNumber;
    static int secondNumber;
    static double answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 계산을 하시겠습니까? (+, -, *, /, % 중 하나를 입력해주세요.)");
        operator = sc.nextLine();
        System.out.println("첫 번째 숫자를 입력해주세요.");
        firstNumber = sc.nextInt();
        System.out.println("두 번째 숫자를 입력해주세요.");
        secondNumber = sc.nextInt();

        calculate(operator, firstNumber, secondNumber);

        System.out.println("계산 결과는 " + answer + " 입니다.");
    }

    static double calculate(String operator, int firstNumber, int secondNumber) {
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
        }
        return answer;
    }
}
