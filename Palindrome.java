package constructs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		 
		if (isPalindrome(input)) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
		sc.close();
	}
	// Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        // Check characters from both ends towards the center
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

