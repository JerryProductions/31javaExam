package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 6.28 Quality Points
	
	Write a method qualityPoitns that inputs a student's average and returns
	4 if it's 90-100,
	3 if 80-89,
	2 if 70-79,
	1 if 60-69 and
	0 if lower than 60.
	Incorporate the method into an application that reads a value from the user and displays the result.
*/

import java.util.Scanner;

public class QualityPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student's average: ");
		int average = input.nextInt();
		
		int qualityPoints = qualityPoints(average);
		
		System.out.println("The quality points for an average of " + average + " is: " + qualityPoints);
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static int qualityPoints(int average) {
		if (average >= 90 && average <= 100)
			return 4;
		else if (average >= 80 && average < 90)
			return 3;
		else if (average >= 70 && average < 80)
			return 2;
		else if (average >= 60 && average < 70)
			return 1;
		else
			return 0;
	}
}
