// import java.io.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("========================");

        try {
            // Trying to convert the first command-line argument to an integer.
            String myString = args[0];
            System.out.println(myString.length());

            // Printing loop
            int i=0, j=(myString.length()-1);
            while ( i <= (myString.length()/2) ) {
            	if(myString.charAt(i) != myString.charAt(j))
            	{
	            	System.out.println("string is not palindrome");
	            	return;
            	} else {
                	i++;
			j--;
            	}
            }
            System.out.println("string is palindrome");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input or not enough args.");
            System.out.println("Please provide a string as command-line argument.");
        }

        System.out.println("========================");
    }
}


