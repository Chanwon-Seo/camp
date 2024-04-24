package week03.hw;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(1, 2));

        calculator.fromConstructor(new DivideOperation());
        System.out.println(calculator.calculate(2, 0));
    }
}
