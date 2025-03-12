package thirdyr.firstse.collection.java.ch4;

/*
	Exercise 4.30 Palindromes
	
	A palindrome is a sequence of characters that reads the same backward as forward.
	For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611.
	Write an application that reads in a five-digit integer and determines whether it's a palindrome.
	If the number is not five digits long, display an error message and allow the user to enter a new value.
*/

import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
		int num;
		boolean restart = true;
		
		Scanner input = new Scanner(System.in);
		
		while (restart) {
			System.out.print("Enter a five-digit integer: ");
			num = input.nextInt();
			
			int originalNum = num, reversedNum = 0, remainder;
			
			if (num > 9999 && num < 100000) {
				while (num != 0) {
					remainder = num % 10;
					reversedNum = reversedNum * 10 + remainder;
					num /= 10;
				}
				
				if (originalNum == reversedNum)
					System.out.println(originalNum + " is a Palindrome.");
				else
					System.out.println(originalNum + " is not a Palindrome.");
				
				restart = false;
			} else
				System.out.println("Error: The number must be a five-digit integer.");
		}
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
}
