package thirdyr.firstse.collection.java.ch5;

/*
	Exercise 5.13 Factorials
	
	Factorials are used frequently in probability problems.
	The factorial of a positive integer n (written n! and pronounced "n factorial") is equal to the product of the positive integers from 1 to n.
	Write an application that calculates the factorials of 1 through 20. Use type long.
	Display the results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
*/

public class Factorials {
	public static void main(String[] args) {
		System.out.println("Number\tFactorial");
		System.out.println("=================");
		
		for (int i = 1; i <= 20; i++) {
			long factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			
			System.out.printf("%d\t%d%n", i, factorial);
		}
	}
}

/*
	The main difficulty is that a long variable in Java (a 64-bit signed integer)
	cannot hold such a large value.
	Attempting to compute 100! with long will lead to integer overflow,
	resulting in an incorrect calculation.
*/