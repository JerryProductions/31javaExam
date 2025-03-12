package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 2.23 Find the Minimum
	
	Write a method minimum3 that returns the smallest of three floating point numbers.
	Use the Math.min method to implement minimum3.
	Incorporate the method into an application that reads three values from the user,
	determines the smallest value and displays the result.
*/

import java.util.Scanner;

public class FindTheMinimum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first floating-point number: ");
		double num1 = input.nextDouble();
		System.out.print("Enter the second floating-point number: ");
		double num2 = input.nextDouble();
		System.out.print("Enter the third floating-point number: ");
		double num3 = input.nextDouble();
		
		double min = minimum3(num1, num2, num3);
		
		System.out.println("The minimum floating-point number is: " + min);
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static double minimum3(double num1, double num2, double num3) {
		return Math.min(Math.min(num1, num2), num3);
	}
}
