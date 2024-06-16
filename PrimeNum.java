package constructs;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(n%i==0)
			{
				count++;
			}
		}
		if (count==2) {
			System.out.println(n+" is a prime number:");
		}
		else {
			System.out.println(n+" is a not a prime number:");
		}

	}

}
