package thirdyr.firstse.collection.java.ch5;

/*
	Exercise 5.23 De Morgan's Laws
	
	In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !.
	De Morgan's laws can sometimes make it more convenient for us to express a logical expression.
	These laws state that the expression
	!(condition1 && condition2) is logically equivalent to the expression
	(!condition1 || !condition2).
	Also, the expression
	!(condition1 || condition2) is logically equivalent to the expression
	(!condition1 && !condition2).
	Use De Morgan's laws to write equivalent expressions for each of the following,
	then write an application to show that both the original expression and the new expression in each case produce the same value:
	
	a)	!( x < 5 ) && !( y >= 7 )
	b)	!( a == b ) || !( g != 5 )
	c)	!( ( x <= 8 ) && ( y > 4 ) )
	d)	!( ( i > 4 ) || ( j <= 6 ) )
*/

import java.util.Scanner;

public class DeMorgansLaws {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean result;
		
		// Get values for x and y
		System.out.print("Enter value for x: ");
		int x = input.nextInt();
		System.out.print("Enter value for y: ");
		int y = input.nextInt();
		
		// Check expression a
		result = !(x < 5) && !(y >= 7);
		System.out.println("(Expression a)\nOriginal Expression: " + result);
		result = !((x < 5) || (y >= 7));
		System.out.println("New Expression: " + result + "\n");
		
		// Get values for a, b and g
		System.out.print("Enter value for a: ");
		int a = input.nextInt();
		System.out.print("Enter value for b: ");
		int b = input.nextInt();
		System.out.print("Enter value for g: ");
		int g = input.nextInt();
		
		// Check expression b
		result = !(a == b) || !(g != 5);
		System.out.println("(Expression b)\nOriginal Expression: " + result);
		result = !((a == b) && (g != 5));
		System.out.println("New Expression: " + result + "\n");
		
		// Get values for x and y
		System.out.print("Enter value for x: ");
		x = input.nextInt();
		System.out.print("Enter value for y: ");
		y = input.nextInt();
		
		// Check expression c
		result = !((x <= 8) && (y > 4));
		System.out.println("(Expression c)\nOriginal Expression: " + result);
		result = !(x <= 8) || !(y > 4);
		System.out.println("New Expression: " + result + "\n");
		
		// Get values for i and j
		System.out.print("Enter value for i: ");
		int i = input.nextInt();
		System.out.print("Enter value for j: ");
		int j = input.nextInt();
		
		// Check expression d
		result = !((i > 4) && (j <= 6));
		System.out.println("(Expression d)\nOriginal Expression: " + result);
		result = !(i > 4) || !(j <= 6);
		System.out.println("New Expression: " + result + "\n");
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
}
