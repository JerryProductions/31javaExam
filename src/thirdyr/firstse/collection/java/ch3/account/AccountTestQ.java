package thirdyr.firstse.collection.java.ch3.account;

// WARNING: This is a question file, DO NOT MODIFY ANYTHING BELOW!

import java.util.Scanner;

public class AccountTestQ {
	// main method begins execution of Java application
	public static void main(String[] args) {
		AccountQ account1 = new AccountQ( 50.00 ); // create Account object
		AccountQ account2 = new AccountQ( -7.53 ); // create Account object
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f\n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n",
				account2.getBalance() );
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		double depositAmount; // deposit amount read from user
		
		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account1 balance\n\n",
				depositAmount );
		account1.credit( depositAmount ); // add to account1 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n",
				account2.getBalance() );
		
		System.out.print( "Enter deposit amount for account2: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account2 balance\n\n",
				depositAmount );
		account2.credit( depositAmount ); // add to account2 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n",
				account2.getBalance() );
		
		input.close(); // [Optional] close the Scanner to remove warnings
	} // end main
} // end class AccountTestQ
