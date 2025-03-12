package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 6.16 Multiples
	
	Write a method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of the first.
	The method should take two integer arguments and return true if the second is a multiple of the first and false otherwise.
	[Hint: Use the remainder operator.]
	Incorporate this method into an application that inputs a series of pairs of integers (one pair at a time) and determines whether the second value in each pair is a multiple of the first.
*/

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the first integer (or type 'exit' to quit): ");
			if (input.hasNextInt()) {
				int first = input.nextInt();
				System.out.print("Enter the second integer: ");
				int second = input.nextInt();
				
				if(isMultiple(first, second))
					System.out.println(second + " is a multiple of " + first + ".");
				else
					System.out.println(second + " is not a multiple of " + first + ".");
			} else if (input.hasNext("exit"))
				break;
			else {
				System.out.println("Invalid input. Please enter an integer or 'exit' to quit.");
				input.next();
			}
				
		}
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static boolean isMultiple(int first, int second) {
		return first % second == 0;
	}
}
