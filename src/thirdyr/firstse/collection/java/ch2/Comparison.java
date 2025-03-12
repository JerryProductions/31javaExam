package thirdyr.firstse.collection.java.ch2;

//Chapter 1 Figure 2.15: Comparison.java

/*
	Compare integers using if statements, relational operators and equality operators
	Class: Comparison
	Main Class: Comparison
*/

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second ingeger: ");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
		
		// This line doesn't include in the text book
		// close() method is for closing the Scanner, this method is necessary for larger projects and optimization
		input.close();
	}
}
