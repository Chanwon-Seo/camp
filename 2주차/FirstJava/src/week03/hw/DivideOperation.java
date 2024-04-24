package week03.hw;

public class DivideOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        //0으로 나눌 수 없는 경우
        if (secondNumber == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return (double) firstNumber / secondNumber;
    }
}
