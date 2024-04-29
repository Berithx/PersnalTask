package 과제.PersonalWork.level1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstNumber = 0;    // 첫번째 정수
        int secondNumber = 0;    // 두번째 정수
        char operator;    // 연산자

        int result = 0;   // 계산 결과

        ArrayList<Integer> resultArr = new ArrayList<>();    // 연산결과 저장 배열(순서 보장과 데이터 중복을 허용하는 컬렉션)

        Scanner sc = new Scanner(System.in);
        do {    // 1번의 계산이 끝난 후 exit 입력여부에 따른 반복계산
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
            // +, -, *, / 만 입력 받기
            while (true) {
                operator = sc.next().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
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

            // operator(연산자) if문으로 구분하여 연산
            if (operator == '+') {    // 덧셈
                result = firstNumber + secondNumber;
            } else if (operator == '-') {    // 뺄셈
                result = firstNumber - secondNumber;
            } else if (operator == '*') {    // 곱셈
                result = firstNumber * secondNumber;
            } else if (operator == '/') {    // 나눗셈
                if (secondNumber == 0) {    // 두번째 정수에 0이 입력될 경우 메세지 출력 및 종료
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNumber / secondNumber;
                }
            }
            System.out.println("연산 결과 : " + result);
            
            // 연산결과 배열 저장
            resultArr.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            // remove 입력 시 ArrayList의 remove 메소스를 사용한 index 0번째 값 삭제
            if (sc.next().equals("remove")) {
                resultArr.remove(0);
                System.out.println("삭제되었습니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        } while (!sc.next().equals("exit"));    // 1번의 계산이 끝난 후 exit 입력여부에 따른 반복계산
    }
}
