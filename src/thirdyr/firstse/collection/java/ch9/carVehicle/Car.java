package thirdyr.firstse.collection.java.ch9.vehicleCar;

/*
	Practice 9.1
	
	Write a Java program to create a class called Vehicle with a method called drive().
	Create a subclass called Car that overrides the drive() method to print "Repairing a car".
	
	Car.java [SUBCLASS]
*/

public class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Repairing a car");
	}
}
