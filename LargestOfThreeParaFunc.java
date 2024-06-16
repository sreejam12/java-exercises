package june;
import java.util.Scanner;
public class LargestOfThreeParaFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number");
		int c = sc.nextInt();
		
		int largest = findLargest(a,b,c);
		System.out.println("The largest number is" + largest);
        sc.close();
        
	}
	
   public static int findLargest(int a, int b,int c) {
	if(a>=b && a>=c) {
		return a;
		}
	else if(b>=c && b>=a) {
		return b;
		}
	else {
		return c;
		}

}
}
//create a parameterised function to check large of 3 numbers