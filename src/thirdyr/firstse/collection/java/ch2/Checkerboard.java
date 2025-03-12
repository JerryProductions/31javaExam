package thirdyr.firstse.collection.java.ch2;

/*
	Exercise 2.27 Checkerboard Pattern of Asterisks
	
	Write an application that displays a checkerboard pattern, as follows:
	
	* * * * * * * *
	 * * * * * * * *
	* * * * * * * *
	 * * * * * * * *
	* * * * * * * *
	 * * * * * * * *
	* * * * * * * *
	 * * * * * * * *
*/

public class Checkerboard {
	public static void main(String[] args) {
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
	}
}

/*
	Alternative Solution:
	
	public static void main(String[] args) {
		for(int i = 0; i < 8; ++i) {
			System.out.printf("%s* * * * * * * *\n", (i % 2 != 0 ? " " : ""));
		}
	}
	
	// Prefer: Use the solution without loops for better value.
*/