package 과제.week4;

import java.util.Scanner;

public class CalculatorApp {
    public static boolean start() throws Exception {
        Parser parser = new Parser();
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력해주세요.");
        String number1Input = sc.nextLine();
        parser.parseFirstNum(number1Input);

        System.out.println("연산자를 입력해주세요.");
        String operatorInput = sc.nextLine();
        parser.parseOperator(operatorInput);

        System.out.println("두 번째 숫자를 입력해주세요.");
        String number2Input = sc.nextLine();
        parser.parseSecondNum(number2Input);

        System.out.println( "연산 결과는 : " + parser.executeCalculator() + " 입니다.");
        return true;
    }
}
