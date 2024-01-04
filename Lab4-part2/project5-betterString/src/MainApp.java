import myPackage.StringUtils;

import java.util.function.BiPredicate;

public class MainApp {
    public static void main(String[] args) {
        String string1 = "Hi";
        String string2 = "Hussein";

        // Using a lambda to compare string lengths
        BiPredicate<String, String> lengthComparator = (s1, s2) -> s1.length() > s2.length();

        // Example 1: Select the longer string
        String longer = StringUtils.betterString(string1, string2, lengthComparator);
        System.out.println("Longer string: " + longer);

        // Example 2: Always select the first string
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First string: " + first);
    }
}
