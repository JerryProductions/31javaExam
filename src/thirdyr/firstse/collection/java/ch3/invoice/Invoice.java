package thirdyr.firstse.collection.java.ch3.invoice;

/*
	Exercise 3.13 Invoice Class
	
	Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
	An invoice should include four pieces of information as instance variables--
	a part number (type String),
	a part description (type String),
	a quality of the item being purchased (type int),
	and a price per item (type double).
	Your class should have a constructor that initializes the four instance variables.
	Provide a set and a get method for each instance variable.
	In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
	then returns the amount as a double value. If the quantity is not positive, it should be set to 0.
	If the price per item is not positive, it should be set to 0.0.
	Write a test application name InvoiceTest that demonstrates class Invoice's capabilities.
*/

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	// constructor
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}
	
	// setters
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = (quantity < 0) ? 0 : quantity;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = (pricePerItem < 0) ? 0 : pricePerItem;
	}
	
	// getters
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public double getInvoiceAmount() {
		return getQuantity() * getPricePerItem();
	}
}
