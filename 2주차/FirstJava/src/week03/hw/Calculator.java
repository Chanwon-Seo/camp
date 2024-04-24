package week03.hw;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void fromConstructor(AbstractOperation newOperation) {
        operation = newOperation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
