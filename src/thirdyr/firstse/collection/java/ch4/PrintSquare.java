package thirdyr.firstse.collection.java.ch4;

/*
	Exercise 4.29 Square of Asterisks
	
	Write an application that prompts the user to enter the size of a square,
	then displays a hollow square of that size made of asterisks.
	Your program should work for squares of all side lengths between 1 and 20.
*/

import java.util.Scanner;

public class PrintSquare {
	public static void main(String[] args) {
		int size;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of a square: ");
		size = input.nextInt();
		
		if (size > 0 && size < 20) {
			// Top Side
			for(int i = 0; i < size; i++)
				System.out.print("*");
			System.out.println();
			
			for(int i = 0; i < size - 2; i++) { // Iterate through rows via i
				System.out.print("*"); // Outer bond (left) of hollow square
				for(int j = 0; j < size - 2; j++) { // Iterate through columns via j
					System.out.print(" "); // Hollow Area
				}
				System.out.print("*"); // Outer bound (right) of hollow square
				System.out.println();
			}
			
			// Bottom Side
			for(int i = 0; i < size; i++)
				System.out.print("*");
		} else {
			System.out.println("Size must be between 1 and 20.");
		}
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
}
