// import java.io.*; 
public class Check {
  public static void main(String[] args) {
	System.out.println("========================"); 
	int number;
	try {
            number = Integer.parseInt(args[0]);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input or not enough args.");
            System.out.println("Please provide an integer as command-line argument.");
        }
	
	System.out.println("========================"); 
  }
}
