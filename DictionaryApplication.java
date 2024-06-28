package collections;
import java.util.*;
public class DictionaryApplication {

	public static void main(String[] args) {
		TreeMap<String, String> dictionary = new TreeMap<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to allow the user to interact with the dictionary
        do {
            System.out.println("\nDictionary Application");
            System.out.println("1. Add word-definition pair");
            System.out.println("2. Retrieve definition of a specific word");
            System.out.println("3. Display all word-definition pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add word-definition pair
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word-definition pair added.");
                    break;

                case 2:
                    // Retrieve definition of a specific word
                    System.out.print("Enter word to retrieve: ");
                    word = scanner.nextLine();
                    if (dictionary.containsKey(word)) {
                        System.out.println("Definition of " + word + ": " + dictionary.get(word));
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;

                case 3:
                    // Display all word-definition pairs
                    System.out.println("All word-definition pairs in alphabetical order:");
                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 4:
                    // Exit the application
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        // Close the scanner
        scanner.close();

	}

}
