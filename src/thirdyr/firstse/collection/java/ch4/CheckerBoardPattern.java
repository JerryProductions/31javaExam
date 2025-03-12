package thirdyr.firstse.collection.java.ch4;

/*
	Exercise 4.32 Checkerboard Pattern of Asterisks
	
	Write an application that uses only the output statements:
	System.out.print("*");
	System.out.print(" ");
	System.out.println();
	to display the checkerboard pattern that follows.
	A system.out.println method call with no arguments causes the program to output a single new line character.
	[Hint: Repetition statements are required]
	
	* * * * * * * *
	 * * * * * * * *
	* * * * * * * *
	 * * * * * * * *
	* * * * * * * *
	 * * * * * * * *
	* * * * * * * *
	 * * * * * * * *
*/

public class CheckerBoardPattern {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			if (i % 2 != 0)
				System.out.print(" ");
			
			for (int j = 0; j < 15; j++) {
				if (j % 2 == 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
