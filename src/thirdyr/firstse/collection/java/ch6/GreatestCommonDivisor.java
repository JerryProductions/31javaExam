package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 6.27 Greatest Common Divisor
	
	The greatest common divisor (GCD) of two integers is the largest integer that evenly divides each of the two numbers.
	Write a method gcd that returns the greatest common divisor of two integers.
	[Hint: You might want to use Euclid's algorithm. You can find information about it at en.wikipdia.org/wiki/Euclidean_algorithm.]
	Incorporate the method into an application that reads two values from the user and displays the result.
*/

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		
		int gcd = gcd(num1, num2);
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static int gcd(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
}
