package 과제.PersonalWork.level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadInputException {
        // 객체 사전 선언
        Calculator calc  = null;

        // 외부 입력(Scanner) 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("[사칙연산], [원의 넓이] 중 필요한 계산을 입력해주세요.");
        String select = sc.nextLine();

        // if문을 통한 Calculator 인스턴스 객체 생성
        if (select.equals("사칙연산")) {
            calc = new ArithmeticCalculator();
        } else if (select.equals("원의 넓이")) {
            calc = new CircleCalculator();
        }

        do {    // 1번의 계산이 끝난 후 exit 입력여부로 반복계산 실행
            //select 변수에 입력된 값으로
            if (select.equals("사칙연산")) {
                try {
                    // 첫 번째 숫자 입력
                    System.out.print("첫 번째 숫자를 입력해주세요 : ");
                    int firstNumber = sc.nextInt();

                    // 연산자 입력
                    System.out.println("사칙연산 기호를 입력해주세요.");
                    char operator = sc.next().charAt(0);

                    // 두 번째 숫자 입력
                    System.out.print("두 번째 숫자를 입력해주세요 : ");
                    int secondNumber = sc.nextInt();

                    // Calculator 객체로 넘어간 데이터 상에서 예외사항 발생 시 핸들링

                    // 입력된 연산자, 피연산자를 Calculator 객체의 calculate 메소드 매개변수로 사용해서 호출 및 출력
                    calc.calculate(firstNumber, operator, secondNumber);
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회, 계속하시려면 임의 값을 입력해주세요.)");
                // inquiry 입력 시 Calculator 객체의 ArrayList 필드에 저장된 데이터를 getter 메서드를 통해 간접 접근하여 읽기
                if (sc.next().equals("inquiry")) {
                        calc.inquiryResults();
                }

                System.out.println("저장된 연살결과를 수정하시겠습니까? (modify 입력 시 수정, 계속하시려면 임의 값을 입력해주세요.)");
                if(sc.next().equals("modify")) {
                    System.out.println(calc.getResultArray().toString());
                    System.out.println("현재 저장된 값을 확인 후 수정하고자 하는 값의 순번(index)과 수정될 값을 정수 형태로 입력해주세요");

                    System.out.print("순번(index) : ");
                    int index = sc.nextInt();       // 수정할 컬렉션의 index 입력
                    System.out.print("수정될 값 : ");
                    int value = sc.nextInt();       // 수정되어 저장될 값 입력
                    calc.setResultArray(index, value);    // Calculator 사칙연산에 대한 setter 메서드 활용

                    System.out.println("수정되었습니다.");
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제, 계속하시려면 임의 값을 입력해주세요.)");
                // remove 입력 시 Caculator 객체의 ArrayList 필드를 removeResult 메서드를 통해 간접 접근하여 index 0번째 값 삭제
                if (sc.next().equals("remove")) {
                    calc.removeResultArray();    // Calculator 객체의 removeResult 메서드를 통해 간접 접근해서 삭제로 수정
                    System.out.println("삭제되었습니다.");
                }
            } else if (select.equals("원의 넓이")) {
                System.out.println("계산하고자 하는 원의 반지름을 입력해주세요.");
                double radius = sc.nextDouble();  // 연산에 필요한 값 입력

                calc.calculate(radius);

                calc.inquiryResults();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, 계속하시려면 임의 값을 입력해주세요.)");
        } while (!sc.next().equals("exit"));    // 1번의 계산이 끝난 후 exit 입력 시 계산 종료
    }
}
