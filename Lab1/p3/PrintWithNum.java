// import java.io.*;

public class PrintWithNum {
    public static void main(String[] args) {
        System.out.println("========================");
        int number;

        try {
            // Trying to convert the first command-line argument to an integer.
            number = Integer.parseInt(args[0]);

            // Printing loop
            for (int i = 0; i < number; i++) {
                System.out.println((i + 1) + "-" + args[1]);
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input or not enough args.");
            System.out.println("Please provide an integer and a string as command-line arguments.");
        }

        System.out.println("========================");
    }
}


