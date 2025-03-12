package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 6.17 Even or Odd
	
	Write a method isEven that uses the remainder operator (%) to determine whether an integer is even.
	The method should take an integer argument and return true if the integer is even and false otherwise.
	Incorporate this method into an application that inputs a sequence of integers (one at a time) and determines whether each is even or odd.
*/

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		while (true) {
			System.out.print("Enter a number (Type \'exit\' to quit): ");
			if (input.hasNextInt()) {
				num = input.nextInt();
				
				if(isEven(num))
					System.out.printf("%d is an even number.\n", num);
				else
					System.out.printf("%d is an odd number.\n", num);
			} else {
				String opt = input.next();
	            if (opt.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting program...");
	                break;
	            } else
	                System.out.println("Invalid input. Please enter an integer.");
			}
		}
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
