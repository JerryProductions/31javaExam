package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.1
	
	Write a Java program to sum values of an arrya.
*/

public class SumArray {
	public static void main(String[] args) {
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i : my_array) 
			sum += i;
		
		System.out.println("The sum of the array is: " + sum);
	}
}
