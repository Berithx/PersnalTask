package 과제.PersonalWork.level2;

import java.util.ArrayList;

public class Calculator {
    // private 접근제어자 설정으로 외부에서 접근하는 것과 수정하는 것 방지
    private ArrayList<Integer> resultArr;    // 연산결과 저장 배열(순서 보장과 데이터 중복을 허용하는 컬렉션), 선언

    public Calculator() {
        resultArr = new ArrayList<>();    // 인스턴스 생성과 함께 컬렉션 초기화
    }

    public int calculate (int firstNumber, char operator, int secondNumber) throws BadInputException {
        int result = 0;

        if(operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            if (secondNumber == 0) {
                throw new BadInputException("나눗셈 분모에는 0이 입력될 수 없습니다.");
            }
            result = firstNumber / secondNumber;
        } else {
            throw new BadInputException("연산자에는 +, -, *, /만 입력할 수 있습니다.");
        }

        resultArr.add(result);

        return result;
    }

    // 외부에서 resultArr 필드에 간접 접근해서 읽을 수 있도록 getter 메서드 선언
    public ArrayList<Integer> getResult() {
        return this.resultArr;
    }

    // 외부에서 resultArr 필드에 간접 접근해서 수정할 수 있도록 setter 메서드 선언
    public void setResultArr(int index, int value) {
        this.resultArr.set(index, value);
    }

    // 외부에서 resultArr 필드에 간접 접근하여 가장 먼저 입력된 값을 삭제할 수 있도록 remove 메서드 선언
    public void removeResult() {
        this.resultArr.remove(0);
    }

    // 외부에서 저장된
    public void inquiryResults() {
        System.out.println(this.resultArr.toString());
    }
}
