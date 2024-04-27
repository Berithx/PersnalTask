package 과제.week3.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 계산을 하시겠습니까? (+, -, *, /, % 중 하나를 입력해주세요.)");
        String operator = sc.nextLine();

        System.out.println("첫 번째 숫자를 입력해주세요.");
        int firstNumber = sc.nextInt();

        System.out.println("두 번째 숫자를 입력해주세요.");
        int secondNumber = sc.nextInt();

        Calculator cal = new Calculator();
        cal.calculate(operator, firstNumber, secondNumber);
    }
}