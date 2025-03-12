package thirdyr.firstse.collection.java.ch4.factorial;

/*
	Exercise 4.37 Factorial
	
	The factorial of a nonnegative integer n is written as n! (pronounced "n factorial")
	and is defined as follows: n! = n * (n - 1) * (n - 2) * ... * 1 (for values of n greater than or equal to 1)
	and n! = 1 (for n = 0).
	For example, 5! = 5 * 4 * 3 * 2 * 1, which is 120.
	
	a)	Write an application that reads a nonnegative integer and computes and prints its factorial.
	b)	Write an application that estimates the value of the mathematical constant e by using the following formula.
		Allow the user to enter the number of terms to calculate.
		
		e = 1 + 1/1! + 1/2! + 1/3! + ...
	c)	Write an application that computes the value of e^x by using the following formula.
		Allow the user to enter the number of terms to calculate.
		
		e^x = 1 + x/1! + (x^2)/2! + (x^3)/3! + ...
*/

import java.util.Scanner;

public class FactorialB {
	public static void main(String[] args) {
		int num, factorial = 1;
		double sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of terms for e to calculate: ");
		num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			factorial *= i;
			
			sum += 1.0 / factorial;
		}
		
		System.out.println("Constant e = " + sum);
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
}
