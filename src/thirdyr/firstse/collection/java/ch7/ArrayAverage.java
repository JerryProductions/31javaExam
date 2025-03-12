package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.6
	
	Write a Java program to calculate the average of all elements in an array.
*/

public class ArrayAverage {
	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 10};
		int sum = 0;
		
		for (int i : numbers) 
			sum += i;
		
		double avg = (double) sum / numbers.length;
		
		System.out.println("The average of elements is: " + avg);
	}
}
