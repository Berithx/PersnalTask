package 과제.PersonalWork.level2;

import java.util.ArrayList;

public class Calculator {
    // private 접근제어자 설정으로 외부에서 접근하는 것과 수정하는 것 방지
    private ArrayList<Integer> arithmeticArr;    // 사칙연산 연산결과 저장 배열, 선언
    private ArrayList<Double> circleArr;    // 원의 넓이 연산결과 저장 배열, 원주율(3.14)에 의한 결과값 고려 Double 타입 컬렉션으로 선언
    private static final double pi = 3.14;    // 원의 넓이 공식 : 반지름 × 반지름 × 원주율(pi) / 이 중 pi는 상수로서 절대 변하지않을 값이기에 static final 선언

    // 객체 생성자
    public Calculator() {
        arithmeticArr = new ArrayList<>();    // 사칙연산 연산결과 컬렉션, 인스턴스 생성과 함께 생성 및 초기화
        circleArr = new ArrayList<>();    // 원의 넓이 연산결과 컬렉션, 인스턴스 생성과 함께 생성 및 초기화
    }

    // 사칙연산 연산, 결과 값 저장, 리턴 메서드
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

        arithmeticArr.add(result);

        return result;
    }

    // 외부에서 resultArr 필드에 간접 접근해서 읽을 수 있도록 getter 메서드 선언
    public ArrayList<Integer> getResult() {
        return this.arithmeticArr;
    }

    // 외부에서 resultArr 필드에 간접 접근해서 수정할 수 있도록 setter 메서드 선언
    public void setResultArr(int index, int value) {
        this.arithmeticArr.set(index, value);
    }

    // 외부에서 resultArr 필드에 간접 접근하여 가장 먼저 입력된 값을 삭제할 수 있도록 remove 메서드 선언
    public void removeResult() {
        this.arithmeticArr.remove(0);
    }

    // 외부에서 저장된 사칙연산 계산 결과를 간접 접근해서 조회할 수 있는 조회 메서드 선언
    public void inquiryResults() {
        System.out.println(this.arithmeticArr.toString());
    }

    // 원의 넓이 계산, 컬렉션 저장, 리턴 메서드
    public double calculateCircleArea(double radius) {
        double circleArea = (radius * radius) * pi;

        circleArr.add(circleArea);

        return circleArea;
    }

    // 외부에서 circleArr 컬렉션에 간접 접근할 수 있도록 getter 메서드 선언
    public ArrayList<Double> getCircleArr() {
        return this.circleArr;
    }

    // 외부에서 cicleArr 컬렉션에 간접 접근하여 값을 수정할 수 있도록 setter 메서드 선언
    public void setCircleArr(int index, double value) {
        this.circleArr.set(index, value);
    }

    // 외부에서 circleArr 컬렉션에 저장된 결과값을 간접 접근하여 조회할 수 있도록 조회 메서드 선언
    public void inquiryCircleArea() {
        System.out.println(this.circleArr.toString());
    }
}
