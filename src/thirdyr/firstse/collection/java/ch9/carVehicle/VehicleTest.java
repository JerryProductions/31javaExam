package thirdyr.firstse.collection.java.ch9.vehicleCar;

/*
	Practice 9.1
	
	Write a Java program to create a class called Vehicle with a method called drive().
	Create a subclass called Car that overrides the drive() method to print "Repairing a car".
	
	VehicleTest.java [TEST CLASS]
*/

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		vehicle.drive();
		car.drive();
	}
}
