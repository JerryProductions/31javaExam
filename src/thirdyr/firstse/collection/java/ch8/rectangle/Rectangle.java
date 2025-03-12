package thirdyr.firstse.collection.java.ch8.rectangle;

/*
	Exercise 8.4 Rectangle Class
	
	Create a class Rectangle with attributes length and width, each of which defaults to 1.
	Provide methods that calculate the rectangle's Perimeter and area.
	It has set and get methods for both length and width.
	The set methods should verify that the length and width are each floating-point numbers larger than
	0.0 and less than 20.0.
	Write a program to test class Rectangle.
*/

public class Rectangle {
	private double length, width;
	
	// Default Constructor
	public Rectangle() {
		setLength(1.0);
		setWidth(1.0);
	}
	
	// Argument Constructor
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	// Setters
	public void setLength(double length) {
		if (length >= 0.0f && length <= 20.0f)
			this.length = length;
		else
			throw new IllegalArgumentException("length must be between 0.0 and 20.0");
	}
	
	public void setWidth(double width) {
		if (width >= 0.0f && width <= 20.0f)
			this.width = width;
		else
			throw new IllegalArgumentException("width must be between 0.0 and 20.0");
	}
	
	// Getters
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	// Calculate Perimeter
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		return String.format(
				"Width: %.2f\nLength: %.2f\nArea: %.2f\nPerimeter: %.2f\n",
				getWidth(), getLength(), getArea(), getPerimeter());
	}
}
