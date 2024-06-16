package constructs;
import java.util.Scanner;
public class FactorialRecur {

		public static int calFact(int n) {
			if(n==0||n==1) {
				return 1;
			}
			return n*calFact(n-1);
		}
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			int fact=calFact(n);
			System.out.println("Factorial of "+n+" is: "+fact);

	}


}