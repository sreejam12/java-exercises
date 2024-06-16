package array;

public class SumArray {
   public static void main(String args[]) {
	   int[] numbers = {12, 52, 73, 24, 58, 66};

       // Calculate the sum of all elements
       int sum = calculateSum(numbers);

       // Print the result
       System.out.println("The sum of all elements in the array is: " + sum);
   }

   // Method to calculate the sum of all elements in an integer array
   public static int calculateSum(int[] array) {
       int sum = 0;

       // Iterate through the array and add each element to the sum
       for (int num : array) {
           sum += num;
       }

       return sum;

 }
}
//Write a Java program to calculate the sum of all elements in an integer array