// /project1/src/myPackage/StringUtils.java
package myPackage;

import java.util.function.Predicate;

public class StringUtils {

    // Using lambda expression
    public static boolean containsOnlyAlphabetsLambda(String input) {
        return allMatch(input, c -> Character.isLetter(c));
    }

    // Using method reference
    public static boolean containsOnlyAlphabetsMethodReference(String input) {
        return allMatch(input, Character::isLetter);
    }

    private static boolean allMatch(String input, Predicate<Character> charPredicate) {
        for (char c : input.toCharArray()) {
            if (!charPredicate.test(c)) {
                return false;
            }
        }
        return true;
    }
}
