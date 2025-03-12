package thirdyr.firstse.collection.java.ch9.cheetahAnimal;

/*
	Practice 9.4

	Write a Java program to create a class called Animal with a method named move().
	Create a subclass called Cheetah that overrides the move() method to run.

	Cheetah.java [SUBCLASS]
*/

public class Cheetah extends Animal {
	@Override
	public void move() {
		System.out.println("This cheetah is running!");
	}
}
