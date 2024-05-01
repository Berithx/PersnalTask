package 과제.PersonalWork.level2;

import java.util.ArrayList;

public abstract class Calculator {
    // 객체 생성자
    public Calculator(){
    }

    // 사칙연산 연산, 결과 값 저장, 리턴 메서드
    public double calculate() {
        double answer = 0;

        return (int) answer;
    };

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근해서 읽을 수 있도록 getter 메서드 선언
    public abstract ArrayList<Double> getResultArray();

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근해서 수정할 수 있도록 setter 메서드 선언
    public abstract void setResultArray(int index, double value);

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근하여 가장 먼저 입력된 값을 삭제할 수 있도록 remove 메서드 선언
    public abstract void removeResultArray();

    // 외부에서 연산결과 저장 컬렉션 필드에 간접 접근하여 전체 일괄 조회하는 메서드 선언
    public abstract void inquiryResults();
}
