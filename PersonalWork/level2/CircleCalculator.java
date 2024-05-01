package 과제.PersonalWork.level2;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    // private 접근제어자 설정으로 외부에서 컬렉션에 접근하는 것과 수정하는 것 방지
    private ArrayList<Double> resultArray;    // 연산결과 저장 배열 선언
    private static final double pi = 3.14;    // 원의 넓이 공식 : 반지름 × 반지름 × 원주율(pi) / 이 중 pi는 상수로서 절대 변하지 않아야할 값이기에 static final 선언

    // 객체 생성자
    public CircleCalculator() {
        resultArray = new ArrayList<>();
    }

    // 원의 넓이 계산, 컬렉션 저장, 리턴 메서드
    public double calculate(double radius) {
        double circleArea = (radius * radius) * pi;

        resultArray.add(circleArea);

        return circleArea;
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
