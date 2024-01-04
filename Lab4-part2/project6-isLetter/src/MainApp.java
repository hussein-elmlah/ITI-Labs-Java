import myPackage.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        String string1 = "HelloWorld";
        String string2 = "Hello123";

        // Example usage with lambda expression
        boolean result1 = StringUtils.containsOnlyAlphabetsLambda(string1);
        System.out.println("String1 contains only alphabets (Lambda): " + result1);

        boolean result2 = StringUtils.containsOnlyAlphabetsLambda(string2);
        System.out.println("String2 contains only alphabets (Lambda): " + result2);

        // Example usage with method reference
        boolean result3 = StringUtils.containsOnlyAlphabetsMethodReference(string1);
        System.out.println("String1 contains only alphabets (Method Reference): " + result3);

        boolean result4 = StringUtils.containsOnlyAlphabetsMethodReference(string2);
        System.out.println("String2 contains only alphabets (Method Reference): " + result4);
    }
}
