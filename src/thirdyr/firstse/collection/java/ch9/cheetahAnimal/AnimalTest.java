package thirdyr.firstse.collection.java.ch9.cheetahAnimal;

/*
	Practice 9.4

	Write a Java program to create a class called Animal with a method named move().
	Create a subclass called Cheetah that overrides the move() method to run.

	AnimalTest.java [TEST CLASS]
*/

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();
		
		Cheetah cheetah = new Cheetah();
		cheetah.move();
	}
}
