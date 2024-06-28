package collections;
import java.util.*;
public class HashLab {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("David", 40);

        System.out.println("Initial HashMap: " + map);

        map.put("Eve", 28); 
        map.put("Alice", 32);

        System.out.println("Updated HashMap: " + map);

        String key = "Bob";
        if (map.containsKey(key)) {
            System.out.println("The value associated with the key \"" + key + "\" is: " + map.get(key));
        } else {
            System.out.println("The key \"" + key + "\" is not present in the HashMap.");
        }
	}

}
//Write a Java program to associate the specified value with the specified key in a HashMap.[Hint:Create HashMap and store few elements on it]