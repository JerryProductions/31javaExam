package thirdyr.firstse.collection.java.ch9.rectangleShape;

/*
	Practice 9.2
	
	Write a Java program to create a class called Shape with a method called getArea().
	Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

	ShapeTest.java [TEST CLASS]
*/

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3.0, 10.0);
		double area = rectangle.getArea();
		System.out.println("The area of the rectangle is: " + area);
	}
}
