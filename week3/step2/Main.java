package 과제.week3.step2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation());
        System.out.println(cal.calculate("/",10,5));

    }
}
