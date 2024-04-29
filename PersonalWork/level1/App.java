package 과제.PersonalWork.level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        char operator;

        Scanner sc = new Scanner(System.in);

        // 양수을 받고 다음 단계로 이동할 수 있도록 while 반복문과 if-else 조건문으로 음수 및 문자 입력 거부
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        while (true) {
            if (sc.hasNextInt()) {    // 입력값이 정수인지 아닌지 boolean 타입으로 출력
                firstNumber = sc.nextInt();
                if (firstNumber >= 0) {    // 입력된 값이 0 이상일 경우 break로 while문 탈출
                    break;
                } else {
                    System.out.println("양의 정수(0 포함)만 입력해주세요.");    // 음수를 받은 경우 재입력 메세지 출력
                }
            } else {
                System.out.println("양의 정수(0 포함)만 입력해주세요.");    // 정수 외 데이터를 받은 경우 재입력 메세지 출력
                sc.next();    // 입력된 정수 외 데이터를 제거하여 무한루프 진입 방지
            }
        }

        System.out.println("사칙연산 기호를 입력해주세요.");
        while (true) {
            operator = sc.next().charAt(0);
            if (operator == '+' || operator == '-'|| operator == '*' || operator == '/') {
                break;
            }
            System.out.println("+, -, *, / 중 필요한 연산자를 입력해주세요.");
        }

        // 양수을 받고 다음 단계로 이동할 수 있도록 while 반복문으로 음수 거부
        System.out.print("두 번째 숫자를 입력해주세요 : ");
        while (true) {
            if (sc.hasNextInt()) {    // 입력값이 정수인지 아닌지 boolean 타입으로 출력
                secondNumber = sc.nextInt();
                if (secondNumber >= 0) {    // 입력된 값이 0 이상일 경우 break로 while문 탈출
                    break;
                } else {
                    System.out.println("양의 정수(0 포함)만 입력해주세요.");    // 음수를 받은 경우 재입력 메세지 출력
                }
            } else {
                System.out.println("양의 정수(0 포함)만 입력해주세요.");    // 정수 외 데이터를 받은 경우 재입력 메세지 출력
                sc.next();    // 입력된 정수 외 데이터를 제거하여 무한루프 진입 방지
            }
        }

        System.out.println("첫 번째 숫자 : " + firstNumber + ", " + "연산자 : " + operator + ", 두 번째 숫자 : " + secondNumber);
    }
}
