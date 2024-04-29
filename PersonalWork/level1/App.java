package 과제.PersonalWork.level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;

        Scanner sc = new Scanner(System.in);

        // 양수을 받고 다음 단계로 이동할 수 있도록 while 반복문으로 음수 거부
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        while ((firstNumber = sc.nextInt()) < 0) {
            System.out.println("양의 정수(0 포함)를 입력해주세요.");
        }

        // 양수을 받고 다음 단계로 이동할 수 있도록 while 반복문으로 음수 거부
        System.out.print("두 번째 숫자를 입력해주세요 : ");
        while ((secondNumber = sc.nextInt()) < 0) {
            System.out.println("양의 정수(0 포함)를 입력해주세요.");
        }

        System.out.println("첫 번째 숫자 : " + firstNumber + ", 두 번째 숫자 : " + secondNumber);
    }
}
