package collections;
import java.util.HashSet;
public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        System.out.println(numbers);
        
        if (numbers.contains(10)) {
            System.out.println("HashSet contains 10.");
        } else {
            System.out.println("HashSet does not contain 10.");
        }
        numbers.remove(15);
        System.out.println(numbers);
        System.out.println(numbers.size());

	}

}
