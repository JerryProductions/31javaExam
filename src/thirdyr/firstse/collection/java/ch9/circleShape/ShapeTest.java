package thirdyr.firstse.collection.java.ch9.circleShape;

/*
	Practice 9.3

	Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
	Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and Perimeter of a circle.

	ShapeTest.java [TEST CLASS]
*/

public class ShapeTest {
	public static void main(String[] args) {
		double r = 8.0;
		
		Circle c1 = new Circle(r);
		System.out.println("Radius of the circle: " + r);
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Area: " + c1.getArea());
		
		r = 3.2;
		Circle c2 = new Circle(r);
		System.out.println("\nRadius of the circle: " + r);
		System.out.println("Perimeter: " + c2.getPerimeter());
		System.out.println("Area: " + c2.getArea());
	}
}
