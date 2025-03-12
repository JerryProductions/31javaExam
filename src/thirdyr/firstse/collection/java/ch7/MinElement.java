package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.7
	
	Write a Java program to find the minimum element in an arrary.
*/

public class MinElement {
	public static void main(String[] args) {
		int[] numbers = {5, 3, 9, 1, 7};
		int min = numbers[0];
		
		for (int i : numbers) {
			if (i < min)
				min = i;
		}
		
		System.out.println("The maximum element is: " + min);
	}
}
