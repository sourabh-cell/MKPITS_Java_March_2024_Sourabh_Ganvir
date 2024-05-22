package calculator;

public class Calculator {
    private int num1, num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        if (num1 > num2) {
            return num1 - num2;
        } else {
            return num2 - num1;
        }
    }

    public int multiplication() {
        return num1 * num2;
    }

    public int division() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("please enter valid number");
        } else {
            return num1 / num2;
        }

        return 0;
    }
}