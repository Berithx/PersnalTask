package 과제.PersonalWork.level2;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> resultArr = new ArrayList<>();    // 연산결과 저장 배열(순서 보장과 데이터 중복을 허용하는 컬렉션)

    public Calculator() {
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
}
