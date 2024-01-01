public class WordCountExample {
    public static void main(String[] args) {
        String sentence = "hi my name is Hussein, and my full name is Hussein Elmlah.";
        String word = "name";

        // Method 1: Using split method
        int count1 = countUsingSplit(sentence, word);

        System.out.println("Method 1: Using split");
        System.out.println("Occurrences of the word '" + word + "': " + count1);

        // Method 2: Using indexOf method
        int count2 = countUsingIndexOf(sentence, word);

        System.out.println("\nMethod 2: Using indexOf");
        System.out.println("Occurrences of the word '" + word + "': " + count2);

        // Method 3: Using replace method
        int count3 = countUsingReplace(sentence, word);

        System.out.println("\nMethod 3: Using replace");
        System.out.println("Occurrences of the word '" + word + "': " + count3);

        // Method 4: Using StringTokenizer class
        int count4 = countUsingStringTokenizer(sentence, word);

        System.out.println("\nMethod 4: Using StringTokenizer");
        System.out.println("Occurrences of the word '" + word + "': " + count4);
    }

    private static int countUsingSplit(String sentence, String word) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    private static int countUsingIndexOf(String sentence, String word) {
        int count = 0;
        int index = sentence.indexOf(word);
        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + 1);
        }
        return count;
    }

    private static int countUsingReplace(String sentence, String word) {
        String sentenceWithoutWord = sentence.replace(word, "");
        int count = (sentence.length() - sentenceWithoutWord.length()) / word.length();
        return count;
    }

    private static int countUsingStringTokenizer(String sentence, String word) {
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(sentence);
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            if (tokenizer.nextToken().equals(word)) {
                count++;
            }
        }
        return count;
    }
}
