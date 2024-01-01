import java.util.Random;

public class BinarySearchMinMax {
    public static void main(String[] args) {
        // Create and sort the array
        int arraySize = 1000;
        int[] array = generateRandomArray(arraySize);

        // Sort the array using Bubble Sort algorithm
        bubbleSort(array);

        // Record the start time
        long startSearchTime = System.nanoTime();

        // Search for an element using binary search
        int target = 500;
        int isFound = binarySearch(array, target);

        // Record the end time
        long endSearchTime = System.nanoTime();

        // Compute the running time
        long searchingTime = endSearchTime - startSearchTime;

        // Display the results based on whether the target was found
        if (isFound != -1) {
            System.out.println("Target Element " + target + " found at index " + isFound);
        } else {
            System.out.println("Target Element " + target + " not found in the array");
        }

        System.out.println("searching Time: " + searchingTime + " nanoseconds");
    }

    // Method to generate an array of random integers
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(-1000,1001);
        }

        return array;
    }

    // Method to perform Bubble Sort on the array
    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Method to perform Binary Search to find a target element
    private static int binarySearch(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            if (array[mid] == target) {
                return mid; // Target element found
            } else if (array[mid] < target) {
                leftIndex = mid + 1; // Continue search in the right half
            } else {
                rightIndex = mid - 1; // Continue search in the left half
            }
        }

        return -1; // Target element not found
    }
}
