// RootsOfQuadratic.java
package myPackage.rootsPackage;

import java.util.function.Function;

public interface RootsOfQuadratic {
   // Function to calculate roots of a quadratic equation
   Function<double[], double[]> calculateRoots = (coefficients) -> {
      double a = coefficients[0];
      double b = coefficients[1];
      double c = coefficients[2];

      // Calculate the discriminant
      double discriminant = b * b - 4 * a * c;
      double[] roots;

      // Calculate roots based on the discriminant
      if (discriminant > 0) {
         roots = new double[2];
         roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
         roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
      } else if (discriminant == 0) {
         roots = new double[1];
         roots[0] = -b / (2 * a);
      } else {
         roots = new double[0]; // No real roots for a negative discriminant
      }

      return roots;
   };
}
