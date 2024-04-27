package 과제.week3.step3;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(new AddOperation());
        System.out.println(cal.calculate(10, 20));
        cal.setOperation(new MultiplyOperation());
        System.out.println(cal.calculate(10, 20));
        cal.setOperation(new DivideOperation());
        System.out.println(cal.calculate(10, 20));
        cal.setOperation(new SubstractOperation());
        System.out.println(cal.calculate(10, 20));
    }
}
