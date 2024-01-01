import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WordCountWithRegex {
    public static void main(String[] args) {
        String sentence = "hi my name is Hussein, and my full name is Hussein Elmlah.";

        String targetWords = "hi|name";

        // Count occurrences using regular expressions
        int count = countWithRegex(sentence, targetWords);

        System.out.println("Occurrences of the words '" + targetWords + "': " + count);
    }

    // method to count occurrences using regular expressions
    private static int countWithRegex(String sentence, String targetWords) {
        // Construct the regular expression pattern
        String regex = "\\b(" + targetWords + ")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        // Create a matcher for the input sentence
        Matcher matcher = pattern.matcher(sentence);

        // Count the occurrences
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
