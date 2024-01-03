// MainApp.java
import myPackage.rootsPackage.RootsOfQuadratic;

public class MainApp {
    public static void main(String[] args) {
        double[] coefficients = {1, 3, 2}; // Example coefficients

        // Calculating roots using the RootsOfQuadratic interface
        double[] roots = RootsOfQuadratic.calculateRoots.apply(coefficients);

        // Displaying the roots
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else {
            System.out.println("Roots:");
            for (double root : roots) {
                System.out.println(root);
            }
        }
    }
}
