package collections;
import java.util.*;
public class WordCount {

	public static void main(String[] args) {
	        String text = "This is a sample text. This text is for testing. This is a test text.";

	        Map<String, Integer> wordCount = countWordOccurrences(text);

	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static Map<String, Integer> countWordOccurrences(String text) {
	        text = text.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

	        String[] words = text.split("\\s+");

	        Map<String, Integer> wordCount = new HashMap<>();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	            }
	        }

	        return wordCount;

	}

}
//write a java  program to count the number of occurrences of word(use split())