package thirdyr.firstse.collection.java.ch3.account;

/*
	Exercise 3.12 Modified Account Class
	
	This is a Test class for the Exercise 3.12 Modified Account Class.
*/

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		double depositAmount;
		double debitAmount;
		
		// Account 1 for deposit amount
		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account1 balance\n\n",
				depositAmount );
		account1.credit( depositAmount ); // add to account1 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		// Account 2 for deposit amount
		System.out.print( "Enter deposit amount for account2: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account2 balance\n\n",
				depositAmount );
		account2.credit( depositAmount ); // add to account2 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		// Account 1 for debit amount
		System.out.print( "Enter debit amount for account1: " ); // prompt
		debitAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nsubracting %.2f to account1 balance\n\n",
				debitAmount );
		account1.debit( debitAmount ); // add to account1 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
				
		// Account 2 for debit amount
		System.out.print( "Enter debit amount for account2: " ); // prompt
		debitAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nsubracting %.2f to account2 balance\n\n",
				debitAmount );
		account2.debit( debitAmount ); // add to account2 balance\
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		input.close(); // [Optional] close the Scanner to remove warnings
	}
}
