package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 6.32 Distance Between Points
	
	Write a method distance to calculate the distance between two points (x1, y1) and (x2, y2).
	All numbers and return values should be of type double.
	incorporate this method into an application that enables the user to enter the coordinates of the points.
*/

import java.util.Scanner;

public class DistanceBetweenPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the x-coordinate of the first point: ");
		double x1 = input.nextDouble();
		System.out.print("Enter the y-coordinate of the first point: ");
		double y1 = input.nextDouble();
		
		System.out.print("Enter the x-coordinate of the second point: ");
		double x2 = input.nextDouble();
		System.out.print("Enter the y-coordinate of the second point: ");
		double y2 = input.nextDouble();
		
		double distance = distance(x1, y1, x2, y2);
		System.out.printf("The distance between the points (%.2f, %.2f) and (%.2f, %.2f) is %.2f",
				x1, y1, x2, y2, distance);
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
