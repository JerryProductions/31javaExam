package thirdyr.firstse.collection.java.ch3.invoice;

/*
	Exercise 3.13 Invoice Class
	
	This is a Test class for the Exercise 3.13 Invoice Class.
*/

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice keyboard = new Invoice("1234", "Keyboard", 2, 9.99);
		
		System.out.printf("Part Number: %s%n", keyboard.getPartNumber());
		System.out.printf("Part Description: %s%n", keyboard.getPartDescription());
		System.out.printf("Quantity: %d%n", keyboard.getQuantity());
		System.out.printf("Pirce per Item: $%.2f%n", keyboard.getPricePerItem());
		System.out.printf("Invoice Amount: %.2f%n", keyboard.getInvoiceAmount());
		
		Invoice hammer = new Invoice("124", "Hammer", -1, -19.99);
		
		System.out.printf("Part Number: %s%n", hammer.getPartNumber());
		System.out.printf("Part Description: %s%n", hammer.getPartDescription());
		System.out.printf("Quantity: %d%n", hammer.getQuantity());
		System.out.printf("Pirce per Item: $%.2f%n", hammer.getPricePerItem());
		System.out.printf("Invoice Amount: %.2f%n", hammer.getInvoiceAmount());
	}
}
