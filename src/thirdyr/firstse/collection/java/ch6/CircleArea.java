package thirdyr.firstse.collection.java.ch6;

/*
	Exercise 6.20 Circle Area
	
	Write an application that prompts the user for the radius of a circle
	and uses a method circleArea to calculate the area of the circle.
*/

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		double area = circleArea(radius);
		
		System.out.printf("The area of the circule with radius %.2f is %.2f%n", radius, area);
		input.close(); // [Optional] close the Scanner to remove warnings
	}
	
	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
}
