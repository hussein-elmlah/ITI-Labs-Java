// /home/hussein/14-Java/Java-Labs/Lab3/project1/src/MainApp.java
// package myPackage.appPackage; // This is not a package file; this is the MainApp file

import java.util.function.Function;
import myPackage.converterPackage.TemperatureConverter;
import myPackage.interfacePackage.MyFunction;

public class MainApp {
    public static void main(String[] args) {
        double celsius = 30.0;

        Function<Double, Double> converter = TemperatureConverter.celsiusToFahrenheit;
        Double fahrenheit = converter.apply(celsius);
        System.out.println("Using Function interface: " + celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");

        MyFunction<Double, Double> converterAgain = TemperatureConverter.celsiusToFahrenheitAgain;
        Double fahrenheitAgain = converterAgain.apply(celsius);
        System.out.println("Using MyFunction interface: " + celsius + " Celsius is equal to " + fahrenheitAgain + " Fahrenheit.");
    }
}
