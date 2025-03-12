package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.4
	
	Write a Java program to find the maximum element in an array.
*/

public class MaxElement {
	public static void main(String[] args) {
		int[] numbers = {5, 3, 9, 1, 7};
		int max = numbers[0];
		
		for (int i : numbers) {
			if (i > max)
				max = i;
		}
		
		System.out.println("The maximum element is: " + max);
	}
}
