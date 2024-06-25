package exception;

public class ExceptionArray {

	public static void main(String[] args) {
		try {
			  int [] arr= {20,30,40};
			  int number=arr[5];
			  System.out.println("Element at index 5: " + number);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

	}

}
//Write a Java program that initializes an array and attempts to access an element at an index that is out of bounds. Handle the ArrayIndexOutOfBoundsException that may occur.