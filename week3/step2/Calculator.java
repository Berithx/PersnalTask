package 과제.week3.step2;

import java.util.Scanner;

public class Calculator {
    String addOperator = "덧셈";
    String substractOperator = "뺄셈";
    String multiplyOperator = "곱셈";
    String divideOperator = "나눗셈";
    String[] request;
    String[] requestArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddOperation add = new AddOperation();

        SubstractOperation substrat = new SubstractOperation();

        MultiplyOperation multiply = new MultiplyOperation();

        DivideOperation divide = new DivideOperation();
    }
}