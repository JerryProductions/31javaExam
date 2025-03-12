package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.3
	
	Write a Java program to initialize an array with the first 10 even numbers
	and print the array.
*/

public class EvenNumbersArray {
	public static void main(String[] args) {
		int[] evenNumbers = new int[10];
		
		for (int i = 0; i < evenNumbers.length; i++)
			evenNumbers[i] = 2 * (i + 1);
		
		for (int i : evenNumbers)
			System.out.print(i + " ");
	}
}
