package exception;
import java.util.Scanner;
import java.util.*;
public class ExceptionInt {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your birth year");
			int year=s.nextInt();
		}
		catch(InputMismatchException e) {
			{
				System.out.println("Wrong input");
			}

	}

}
}
//Write a Java program that reads an integer from the user. Handle the InputMismatchException that may occur if the user enters a non-integer value.