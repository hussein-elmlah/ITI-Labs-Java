package myPackage;

public class ComplexNumber<T extends Number> {
    private T real;
    private T imaginary;

    public ComplexNumber(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }

    public void setComplex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber<T> add(ComplexNumber<T> other) {
        T newReal = addNumbers(this.real, other.getReal());
        T newImaginary = addNumbers(this.imaginary, other.getImaginary());
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> subtract(ComplexNumber<T> other) {
        T newReal = subtractNumbers(this.real, other.getReal());
        T newImaginary = subtractNumbers(this.imaginary, other.getImaginary());
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> multiply(ComplexNumber<T> other) {
        T newReal = subtractNumbers(multiplyNumbers(this.real, other.getReal()), multiplyNumbers(this.imaginary, other.getImaginary()));
        T newImaginary = addNumbers(multiplyNumbers(this.real, other.getImaginary()), multiplyNumbers(this.imaginary, other.getReal()));
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> divide(ComplexNumber<T> other) {
        T denominator = addNumbers(square(other.getReal()), square(other.getImaginary()));
        T newReal = divideNumbers(addNumbers(multiplyNumbers(this.real, other.getReal()), multiplyNumbers(this.imaginary, other.getImaginary())), denominator);
        T newImaginary = divideNumbers(subtractNumbers(multiplyNumbers(this.imaginary, other.getReal()), multiplyNumbers(this.real, other.getImaginary())), denominator);
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public void printComplex() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    private static <T extends Number> T addNumbers(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }

    private static <T extends Number> T subtractNumbers(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() - num2.floatValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        }
    }

    private static <T extends Number> T multiplyNumbers(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() * num2.floatValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        }
    }

    private static <T extends Number> T divideNumbers(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() / num2.floatValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        }
    }

    private static <T extends Number> T square(T num) {
        return multiplyNumbers(num, num);
    }
}
