package thirdyr.firstse.collection.java.ch9.rectangleShape;

/*
	Practice 9.2

	Write a Java program to create a class called Shape with a method called getArea().
	Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

	Rectangle.java [SUBCLASS]
*/

public class Rectangle extends Shape {
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
}
