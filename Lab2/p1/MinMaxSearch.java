import java.util.Random;

public class MinMaxSearch {
    public static void main(String[] args) {
        // Record the start time
        long startTime = System.nanoTime();

        // create array
        int arraySize = 1000;
        int[] array = new int[arraySize];

        // Insert random values into the array
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(-1000, 1001); // Values between -1000 and 1000
        }

        // Find the minimum and maximum elements
        int min = getMin(array);
        int max = getMax(array);

        // Record the end time
        long endTime = System.nanoTime();

        // Compute the running time
        long runningTime = endTime - startTime;

        // Display the results
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
        System.out.println("Running Time: " + runningTime + " nanoseconds");
    }

    // Method to find the minimum element in an array
    private static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method to find the maximum element in an array
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
