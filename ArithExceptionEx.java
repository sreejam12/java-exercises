package exception;
import java.util.*;
public class ArithExceptionEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    try {
	    	System.out.print("Enter the numerator: ");
	        int num = scanner.nextInt();
	        System.out.print("Enter the denominator: ");
	        int den = scanner.nextInt();
	        int res = num / den;
	        System.out.println("Result: " + res);
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e.getMessage());
	    }

	}

}
Write a Java program that calculates the division of two numbers entered by the user. Handle the ArithmeticException that may occur if the denominator is zero.
