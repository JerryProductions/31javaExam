package thirdyr.firstse.collection.java.ch4;

/*
	Exercise 4.33 Multiples of 2 with an Infinite Loop
	
	Write an application that keep displaying in the command window the multiples of the integer 2--
	namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate (i.e., it should create an infinite loop).
	What happens when you run this program?
	
	WARNING: Running this program may cause some IDEs or Compilers to crash!
*/

public class MultiplesOf2 {
	public static void main(String[] args) {
		int number = 2;
		
		while (true) {
			System.out.println(number);
			number *= 2;
		}
	}
}

/*
	Alternative Solution:
	
	Most program will crash because of the infinite loop.
*/
