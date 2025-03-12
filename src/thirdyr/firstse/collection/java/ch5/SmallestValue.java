package thirdyr.firstse.collection.java.ch5;

/*
	Exercise 5.11 Find the Smallest Value
	
	Write an application that finds the smallest of several integers.
	Assume that the first value read specifies the number of values to input from the user.
*/

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of values to input: ");
		int numberOfValues = input.nextInt();
		
		System.out.print("Enter number 1: ");
		int smallestValue = input.nextInt();
		
		for (int i = 1; i < numberOfValues; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			int currentValue = input.nextInt();
			
			if (currentValue < smallestValue)
				smallestValue = currentValue;
		}
		
		System.out.println("The smallest value is " + smallestValue + ".");
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
}
