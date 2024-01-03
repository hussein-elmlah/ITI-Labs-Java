// /home/hussein/14-Java/Java-Labs/Lab3/project1/src/myPackage/converterPackage/TemperatureConverter.java
package myPackage.converterPackage;

import java.util.function.Function;
import myPackage.interfacePackage.MyFunction;

public class TemperatureConverter {
    // Method to convert temperature using a conversion function
    public static Double convert(Function<Double, Double> conversionFunction, Double input) {
        return conversionFunction.apply(input);
    }

    // Function to convert Celsius to Fahrenheit using 'java.util.function.Function' interface
    public static Function<Double, Double> celsiusToFahrenheit = celsius -> ((celsius * 9 / 5) + 32);

    // Method to convert temperature using a conversion function
    // using the function created by my custom functional interface 'MyFunction'
    public static Double convertAgain(MyFunction<Double, Double> conversionFunction, Double input) {
        return conversionFunction.apply(input);
    }

    // Function to convert Celsius to Fahrenheit using my custom functional interface 'MyFunction'
    public static MyFunction<Double, Double> celsiusToFahrenheitAgain = celsius -> ((celsius * 9 / 5) + 32);
}
