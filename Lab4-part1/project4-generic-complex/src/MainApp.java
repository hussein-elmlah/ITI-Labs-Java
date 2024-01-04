import myPackage.ComplexNumber;

public class MainApp {
    public static void main(String[] args) {
        // Test the generic complex number class and methods

        // Create complex numbers
        ComplexNumber<Double> complex1 = new ComplexNumber<>(3.0, 4.0);  // 3 + 4i
        ComplexNumber<Double> complex2 = new ComplexNumber<>(1.0, 2.0);  // 1 + 2i

        // Perform arithmetic operations using instance methods
        System.out.println("Performing arithmetic operations using instance methods:");

        // Addition
        ComplexNumber<Double> resultAddInstance = complex1.add(complex2);
        System.out.println("Result after addition:");
        resultAddInstance.printComplex();

        // Subtraction
        ComplexNumber<Double> resultSubtractInstance = complex1.subtract(complex2);
        System.out.println("Result after subtraction:");
        resultSubtractInstance.printComplex();

        // Multiplication
        ComplexNumber<Double> resultMultiplyInstance = complex1.multiply(complex2);
        System.out.println("Result after multiplication:");
        resultMultiplyInstance.printComplex();

        // Division
        ComplexNumber<Double> resultDivideInstance = complex1.divide(complex2);
        System.out.println("Result after division:");
        resultDivideInstance.printComplex();
    }
}
