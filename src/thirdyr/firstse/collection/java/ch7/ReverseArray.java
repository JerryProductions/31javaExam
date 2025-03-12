package thirdyr.firstse.collection.java.ch7;

/*
	Practice 5
	
	Write a Java program to reverse the elements of an array.
*/

public class ReverseArray {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = temp;
		}
		
		for (int i : numbers)
			System.out.print(i + " ");
	}
}
