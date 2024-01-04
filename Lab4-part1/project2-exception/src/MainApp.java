import myPackage.Calculator;
import myPackage.MyException;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int divisionResult = calculator.divide(10, 2);
            System.out.println("Result of division: " + divisionResult);

            double sqrtResult = calculator.calculateSquareRoot(25);
            System.out.println("Square root result: " + sqrtResult);

            double diffResult = calculator.calculateDifference(7.5, 2.5);
            System.out.println("Difference result: " + diffResult);
        } catch (MyException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.(No Exception).");
        }
    }
}
