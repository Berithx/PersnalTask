package 과제.PersonalWork.level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadInputException {
        int firstNumber = 0;    // 첫번째 정수
        int secondNumber = 0;    // 두번째 정수
        char operator = 0;    // 연산자

        // Calculator 인스턴스 객체 생성
        Calculator calc = new Calculator();

        Scanner sc = new Scanner(System.in);

        do {    // 1번의 계산이 끝난 후 exit 입력여부로 반복계산 실행
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력해주세요 : ");
            firstNumber = sc.nextInt();

            // 연산자 입력
            System.out.println("사칙연산 기호를 입력해주세요.");
            operator = sc.next().charAt(0);

            // 두 번째 숫자 입력
            System.out.print("두 번째 숫자를 입력해주세요 : ");
            secondNumber = sc.nextInt();

            try {
            // 입력된 연산자, 피연산자를 Calculator 객체의 calculate 메소드 매개변수로 사용해서 호출 및 출력
            System.out.println("연산 결과 : " + calc.calculate(firstNumber, operator, secondNumber));
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            // remove 입력 시 Caculator 객체의 ArrayList 필드를 remove 메소스를 사용한 index 0번째 값 삭제
            if (sc.next().equals("remove")) {
                calc.resultArr.remove(0);
                System.out.println("삭제되었습니다.");
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            // inquiry 입력 시 향상된 for문을 통한 Calculator 객체의 ArrayList 필드에 저장된 데이터 전체 조회
            if (sc.next().equals("inquiry")) {
                System.out.println(calc.resultArr.toString());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));    // 1번의 계산이 끝난 후 exit 입력 시 계산 종료
    }
}
