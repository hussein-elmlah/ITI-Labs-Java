package myPackage;

public class Calculator {
    public int divide(int dividend, int divisor) throws MyException {
        if (divisor == 0) {
            throw new MyException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public double calculateSquareRoot(double value) throws MyException {
        if (value < 0) {
            throw new MyException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(value);
    }

    public double calculateDifference(double a, double b) throws MyException {
        if (a < b) {
            throw new MyException("Left operand in subtraction is less than the right operand");
        }
        return a - b;
    }
}

