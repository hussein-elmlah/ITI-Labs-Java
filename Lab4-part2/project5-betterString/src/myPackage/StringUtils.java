package myPackage;

import java.util.function.BiPredicate;

public class StringUtils {

    // Method to determine the better string based on the provided lambda condition
    public static String betterString(String s1, String s2, BiPredicate<String, String> comparator) {
        return comparator.test(s1, s2) ? s1 : s2;
    }
}
