package thirdyr.firstse.collection.java.ch5;

/*
	Exercise 5.24 Diamond Printing Program
	
	Write an application that prints the following diamond shape.
	You may use output statements that print a single asterisk (*),
	a single space or a single newline character.
	Maximize your use of repetition (with nested for statements), and minimize the number of output statements.
	
	    *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
*/

public class DiamondPrintingProgram {
	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 4; j > i - 1; j--) {
				System.out.print(' ');
			}
			
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 4; j > i - 1; j--) {
				System.out.print(' ');
			}
			
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
