package thirdyr.firstse.collection.java.ch3.account;

/*
	Exercise 3.12 Modified Account Class
	
	Modify class Account (AccountQ.java) to provide
	a method called debit that withdraws money from an Account.
	Ensure that the debit amount does not exceed the Account's balance.
	If it does, the balance should be left unchanged and
	the method should print a message indicating "Debit amount exceeded account balance."
	Modify class AccountTest (AccountTestQ.java) to test method debit.
*/

public class Account {
	private double balance;
	
	// constructor
	public Account(double initialBalance) {
		// ensure initialBalance > 0.0
		// if not it is initialized to 0.0
		if (initialBalance > 0.0)
			balance = initialBalance;
	}
	
	// credit account
	public void credit(double amount) {
		balance += amount;
	}
	
	// debit account
	public void debit(double amount) {
		if (amount > balance)
			System.out.println("Debit amount exceeded account balance.");
		else
			balance -= amount;
	}
	
	// get balance
	public double getBalance() {
		return balance;
	}
}
