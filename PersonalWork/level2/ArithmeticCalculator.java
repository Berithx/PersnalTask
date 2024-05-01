package 과제.PersonalWork.level2;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    // private 접근제어자 설정으로 외부에서 컬렉션에 접근하는 것과 수정하는 것 방지
    private ArrayList<Double> resultArray;    // 연산결과 저장 배열 선언

    // 객체 생성자
    public ArithmeticCalculator() {
        resultArray = new ArrayList<>();     // 사칙연산 연산결과 컬렉션, 인스턴스 생성과 함께 생성 및 초기화
    }

    // 사칙연산 연산, 결과 값 저장, 리턴 메서드
    public double calculate(int firstNumber, char operator, int secondNumber) throws BadInputException {
        double result = 0;

        if(operator == '+') {
            Operator add = new AddOperator();    // Operator 인터페이스 타입의 AddOperator 클래스 객체 생성
            result = add.operate(firstNumber, secondNumber);
        } else if (operator == '-') {
            Operator sub = new SubtractOperator();
            result = sub.operate(firstNumber, secondNumber);
         } else if (operator == '*') {
            Operator mul = new MultiplyOperator();
            result = mul.operate(firstNumber, secondNumber);
        } else if (operator == '/') {
            if (secondNumber == 0) {
                throw new BadInputException("나눗셈 분모에는 0이 입력될 수 없습니다.");
            }
            Operator div = new DivideOperator();
            result = div.operate(firstNumber, secondNumber);
        } else if (operator == '%') {
            Operator mod = new ModOperator();
            result = mod.operate(firstNumber, secondNumber);
        } else {
            throw new BadInputException("연산자에는 +, -, *, /, %만 입력할 수 있습니다.");
        }

        resultArray.add(result);

        return (int) result;
    }

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근해서 읽을 수 있도록 getter 메서드 선언
    @Override
    public ArrayList<Double> getResultArray() {
        return this.resultArray;
    }

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근해서 수정할 수 있도록 setter 메서드 선언
    @Override
    public void setResultArray(int index, double value) {
        this.resultArray.set(index, value);
    }

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근하여 가장 먼저 입력된 값을 삭제할 수 있도록 remove 메서드 선언
    @Override
    public void removeResultArray() {
        this.resultArray.remove(0);
    }

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근하여 전체 일괄 조회하는 메서드 선언
    @Override
    public void inquiryResults() {
        System.out.println(this.resultArray.toString());
    }
}
