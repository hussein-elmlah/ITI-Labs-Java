import java.util.*;

class InteractiveWordDictionary {
    private Map<Character, List<String>> wordsMap;

    public InteractiveWordDictionary() {
        // Initialize the wordsMap with empty lists for each letter
        wordsMap = new TreeMap<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            wordsMap.put(ch, new ArrayList<>());
        }

        // Add the additional word lists
        addWordsToDictionary('A', Arrays.asList("Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant"));
        addWordsToDictionary('B', Arrays.asList("Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful"));
        addWordsToDictionary('C', Arrays.asList("Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon"));
        addWordsToDictionary('D', Arrays.asList("Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly"));
        addWordsToDictionary('E', Arrays.asList("Eagle", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral"));
        addWordsToDictionary('F', Arrays.asList("Fairy", "Flame", "Fiesta", "Frost", "Floral", "Firefly", "Fascinate", "Fable", "Feather", "Flicker"));
        addWordsToDictionary('G', Arrays.asList("Gazebo", "Glimmer", "Grace", "Gentle", "Galaxy", "Glisten", "Garnet", "Gentleman", "Giggly", "Glitter"));
        addWordsToDictionary('H', Arrays.asList("Harmony", "Heavenly", "Honey", "Harbor", "Hope", "Heartfelt", "Halcyon", "Haven", "Halo", "Hyacinth"));
        addWordsToDictionary('I', Arrays.asList("Imagine", "Infinite", "Inspire", "Ivory", "Island", "Illuminate", "Impulse", "Incandescent", "Ingenious", "Ineffable"));
        addWordsToDictionary('J', Arrays.asList("Jubilant", "Jade", "Journey", "Joyful", "Jazz", "Jasmine", "Jovial", "Jigsaw", "Jubilee", "Jocular"));
        addWordsToDictionary('K', Arrays.asList("Kaleidoscope", "Kindle", "Kinetic", "Keen", "Kismet", "Kale", "Kudos", "Kiss", "Kittens", "Knight"));
        addWordsToDictionary('L', Arrays.asList("Lagoon", "Luminous", "Lullaby", "Lavender", "Lively", "Lunar", "Luscious", "Lyric", "Labyrinth", "Lilac"));
        addWordsToDictionary('M', Arrays.asList("Majestic", "Mystic", "Moonlight", "Melody", "Mirth", "Magenta", "Mosaic", "Mellow", "Miracle", "Majesty"));
        addWordsToDictionary('N', Arrays.asList("Nebula", "Nectar", "Nirvana", "Noble", "Nurturing", "Nautical", "Novel", "Nuance", "Nebulous", "Nestle"));
        addWordsToDictionary('O', Arrays.asList("Orchid", "Opulent", "Oasis", "Oceanic", "Optimistic", "Ornate", "Outstanding", "Overcome", "Overjoyed", "Onyx"));
        addWordsToDictionary('P', Arrays.asList("Peach", "Pristine", "Petal", "Panorama", "Pleasure", "Ponder", "Panache", "Peaceful", "Perfume", "Pinnacle"));
        addWordsToDictionary('Q', Arrays.asList("Quasar", "Quaint", "Quell", "Quest", "Quiver", "Quintessence", "Quirky", "Quiet", "Quintessential", "Quench"));
        addWordsToDictionary('R', Arrays.asList("Radiant", "Reverie", "Ripple", "Rustic", "Rendezvous", "Rhapsody", "Resplendent", "Rejoice", "Rose", "Rapture"));
        addWordsToDictionary('S', Arrays.asList("Serene", "Sapphire", "Serenade", "Symphony", "Sparkle", "Stellar", "Sublime", "Savor", "Sculpt", "Sylvan"));
        addWordsToDictionary('T', Arrays.asList("Tranquil", "Twilight", "Tender", "Tropical", "Talisman", "Tidal", "Traverse", "Timeless", "Tintinnabulation", "Treasure"));
        addWordsToDictionary('U', Arrays.asList("Umbra", "Utopia", "Unwind", "Uplift", "Utter", "Umbrella", "Unique", "Upbeat", "Universe", "Unity"));
        addWordsToDictionary('V', Arrays.asList("Velvet", "Vivid", "Vibrant", "Vanilla", "Valiant", "Vortex", "Verdant", "Verve", "Voyage", "Virtue"));
        addWordsToDictionary('W', Arrays.asList("Whisper", "Wander", "Wisp", "Willow", "Wavelength", "Wondrous", "Wishful", "Waltz", "Wonder", "Wildflower"));
        addWordsToDictionary('X', Arrays.asList("Xanadu", "Xylophone", "Xenon", "Xeric", "X-factor", "Xenial", "Xenophobe", "Xanthein", "Xenagogue", "Xerox"));
        addWordsToDictionary('Y', Arrays.asList("Yearning", "Yonder", "Yoga", "Yummy", "Yield", "Yarn", "Yonder", "Yaffle", "Yoga", "Yonder"));
        addWordsToDictionary('Z', Arrays.asList("Zephyr", "Zenith", "Zeal", "Zest", "Zing", "Zircon", "Zestful", "Zen", "Zeppelin", "Zany"));
    }

    // Helper method to add words to the dictionary for a specific letter
    private void addWordsToDictionary(char letter, List<String> words) {
        List<String> wordsForLetter = wordsMap.computeIfAbsent(letter, k -> new ArrayList<>());
        wordsForLetter.addAll(words);
        Collections.sort(wordsForLetter);
    }

    // Print the entire dictionary
    public void printDictionary() {
        System.out.println("--- Word Dictionary ---");
        for (Map.Entry<Character, List<String>> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Print words for a specific letter
    public void getWords(char key) {
        key = Character.toUpperCase(key);
        List<String> words = wordsMap.get(key);
        if (words != null) {
            System.out.println(key + ": " + words);
        } else {
            System.out.println("No words found for letter " + key);
        }
    }

    // Insert words into the dictionary
    public boolean insert(Collection<String> words) {
        boolean success = true;
        for (String word : words) {
            char firstLetter = Character.toUpperCase(word.charAt(0));
            List<String> wordsForLetter = wordsMap.computeIfAbsent(firstLetter, k -> new ArrayList<>());
            int index = Collections.binarySearch(wordsForLetter, word);
            if (index < 0) {
                wordsForLetter.add(-index - 1, word);
            } else {
                success = false;
                System.out.println("Word '" + word + "' already exists in the dictionary.");
            }
        }
        return success;
    }

    // Remove a specific word from the dictionary
    public void removeWord(String word) {
        char firstLetter = Character.toUpperCase(word.charAt(0));
        List<String> wordsForLetter = wordsMap.get(firstLetter);

        if (wordsForLetter != null && wordsForLetter.remove(word)) {
            System.out.println("Word '" + word + "' removed successfully!");
        } else {
            System.out.println("Word '" + word + "' not found in the dictionary.");
        }
    }

    // Remove all words for a specific letter
    public void removeAllKey(char key) {
        key = Character.toUpperCase(key);
        List<String> wordsForLetter = wordsMap.remove(key);

        if (wordsForLetter != null) {
            System.out.println("All words for letter " + key + " removed successfully!");
        } else {
            System.out.println("No words found for letter " + key + " in the dictionary.");
        }
    }

    // Search for words containing a specific substring
    public void search(String substring) {
        System.out.println("Words containing '" + substring + "':");
        for (Map.Entry<Character, List<String>> entry : wordsMap.entrySet()) {
            for (String word : entry.getValue()) {
                if (word.contains(substring)) {
                    System.out.println(entry.getKey() + ": " + word);
                }
            }
        }
    }
}

class DictionaryMenu {
    // Display the menu options
    public void displayMenu() {
        System.out.println("\n--- Word Dictionary Menu ---");
        System.out.println("1. Print Dictionary");
        System.out.println("2. Print Words for a Specific Letter");
        System.out.println("3. Insert Words");
        System.out.println("4. Remove a Word");
        System.out.println("5. Remove All Words for a Letter");
        System.out.println("6. Search Words by Substring");
        System.out.println("7. Exit");
    }

    // Get the user's menu choice
    public int getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (1-7): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
            System.out.print("Enter your choice (1-7): ");
        }
        return scanner.nextInt();
    }

    // Get a single letter input from the user
    public char getLetterInput(Scanner scanner) {
        System.out.print("Enter a letter: ");
        return scanner.next().toUpperCase().charAt(0);
    }

    // Get a list of words input from the user
    public Collection<String> getWordsInput(Scanner scanner) {
        System.out.print("Enter words separated by commas: ");
        scanner.nextLine(); // Consume the newline character
        String wordsInput = scanner.nextLine();
        return Arrays.asList(wordsInput.split("\\s*,\\s*"));
    }

    // Get a substring input from the user
    public String getSubstringInput(Scanner scanner) {
        System.out.print("Enter a substring to search for: ");
        return scanner.next();
    }
}

public class MainApp {
    public static void main(String[] args) {
        // Initialize menu and word dictionary
        DictionaryMenu menu = new DictionaryMenu();
        InteractiveWordDictionary wordDictionary = new InteractiveWordDictionary();

        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                // Display the menu options
                menu.displayMenu();
                // Get the user's choice
                int choice = menu.getUserChoice(scanner);

                // Process the user's choice
                switch (choice) {
                    case 1:
                        wordDictionary.printDictionary();
                        break;

                    case 2:
                        char letterToPrint = menu.getLetterInput(scanner);
                        wordDictionary.getWords(letterToPrint);
                        break;

                    case 3:
                        Collection<String> wordsToInsert = menu.getWordsInput(scanner);
                        boolean success = wordDictionary.insert(wordsToInsert);
                        if (success) {
                            System.out.println("Words inserted successfully!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter a word to remove: ");
                        String wordToRemove = scanner.next();
                        wordDictionary.removeWord(wordToRemove);
                        break;

                    case 5:
                        char letterToRemove = menu.getLetterInput(scanner);
                        wordDictionary.removeAllKey(letterToRemove);
                        break;

                    case 6:
                        String substring = menu.getSubstringInput(scanner);
                        wordDictionary.search(substring);
                        break;

                    case 7:
                        // Exit the program
                        System.out.println("Exiting the Word Dictionary Application. Goodbye!");
                        System.exit(0);

                    default:
                        // Handle invalid choices
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                }
            }
        }
    }
}
