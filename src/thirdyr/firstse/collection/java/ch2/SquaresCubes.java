package thirdyr.firstse.collection.java.ch2;

/*
	Exercise 2.31 Table of Squares and Cubes
	
	Using only the programming techniques you learned in this chapter,
	write an application that calculates the squares and cubes of the numbers from 0 to 10
	and prints the resulting values in table format, as shown below. [Note: This program
	does not require any input from the user.]
	
	number	square	cube
	0		0		0
	1		1		1
	2		4		8
	3		9		27
	4		16		64
	5		25		125
	6		36		216
	7		49		343
	8		64		512
	9		81		729
	10		100		1000
*/

public class SquaresCubes {
	public static void main(String[] args) {
		System.out.println("number\tsqure\tcube");
		System.out.printf("%d\t%d\t%d\t\n", 0, 0*0, 0*0*0);
		System.out.printf("%d\t%d\t%d\t\n", 1, 1*1, 1*1*1);
		System.out.printf("%d\t%d\t%d\t\n", 2, 2*2, 2*2*2);
		System.out.printf("%d\t%d\t%d\t\n", 3, 3*3, 3*3*3);
		System.out.printf("%d\t%d\t%d\t\n", 4, 4*4, 4*4*4);
		System.out.printf("%d\t%d\t%d\t\n", 5, 5*5, 5*5*5);
		System.out.printf("%d\t%d\t%d\t\n", 6, 6*6, 6*6*6);
		System.out.printf("%d\t%d\t%d\t\n", 7, 7*7, 7*7*7);
		System.out.printf("%d\t%d\t%d\t\n", 8, 8*8, 8*8*8);
		System.out.printf("%d\t%d\t%d\t\n", 9, 9*9, 9*9*9);
		System.out.printf("%d\t%d\t%d\t\n", 10, 10*10, 10*10*10);
	}
}

/*
	Alternative Solution: Instead of using \t, use spaces. This method is more preferable.
*/
