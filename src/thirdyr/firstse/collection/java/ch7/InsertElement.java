package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.8
	
	Write a Java program to insert an element at a specific position in an array.
*/

import java.util.Arrays;

public class InsertElement {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 4, 5};
		int element = 3;
		int position = 2;
		int[] newArray = new int[numbers.length + 1];
		
		for (int i = 0, j = 0; i < numbers.length; i++, j++) {
			if (j == position) {
				newArray[j] = element;
				j++;
			}
			newArray[j] = numbers[i];
		}
		
		System.out.println("Array before insertion: " + Arrays.toString(numbers));
		System.out.println("Array after insertion: " + Arrays.toString(newArray));
	}
}
