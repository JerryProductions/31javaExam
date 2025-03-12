package thirdyr.firstse.collection.java.ch9.circleShape;

/*
	Practice 9.3

	Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
	Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and Perimeter of a circle.

	Circle.java [SUBCLASS]
*/

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
