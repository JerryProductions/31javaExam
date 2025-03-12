package thirdyr.firstse.collection.java.ch8.rectangle;

/*
	Exercise 8.4 Rectangle Class
	
	This is a Test class for the Exercise 8.4 Rectangle Class.
*/

public class RectangleTest {
	public static void main(String[] args) {
		// Default Constructor
		Rectangle rect1 = new Rectangle();
		
		rect1.setLength(2.0f);
		rect1.setWidth(8.0f);
		
		// Argument Constructor
		Rectangle rect2 = new Rectangle(4.0f, 3.0f);
		
		System.out.println("rect1 default constructor:");
		System.out.println(rect1.toString());
		
		System.out.println("rect2 default constructor:");
		System.out.println(rect2.toString());
		
		try {
			@SuppressWarnings("unused") // [Optional] used to suppress the warnings of unused object
			Rectangle rect3 = new Rectangle(40.0f, -1.0f);
		} catch (IllegalArgumentException e) {
			System.out.printf("\nException while initialising rect3: %s\n", e.getMessage());
		}
	}
}
