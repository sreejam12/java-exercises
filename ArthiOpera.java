package june;
import java.util.Scanner;
public class ArthiOpera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter an operator(+,-,*,%,/)");
		char operator = sc.next().charAt(0);
		
		int result = 0; // Initialize result to avoid compilation error

        boolean validOperation = true;
		
		switch (operator){
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '%':
			 if (num2 != 0) {
                 result = num1 % num2;
             } else {
                 System.out.println("Error! Division by zero.");
                 validOperation = false;
             }
             break;
		case '/':
			 if (num2 != 0) {
                 result = num1 % num2;
             } else {
                 System.out.println("Error! Division by zero.");
                 validOperation = false;
             }
             break;
		default:
		  System.out.println("invalid operator");
		  validOperation = false;
		}
		
		if (validOperation) {
            System.out.println("Result: " + result);
        }
				

	}

}
//create a parameterized function and return arithmatic operatons