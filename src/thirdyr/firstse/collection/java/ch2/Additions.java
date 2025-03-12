package thirdyr.firstse.collection.java.ch2;

// Chapter 1 Figure 2.7: Addition.java

/*
	Addition program that displays the sum of two numbers.
	Class: Addition
	Main Class: Addition
*/

import java.util.Scanner;

public class Additions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second ingeger: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d\n", sum);
		
		// This line doesn't include in the text book
		// close() method is for closing the Scanner, this method is necessary for larger projects and optimization
		input.close();
	}
}
