package thirdyr.firstse.collection.java.ch3.date;

/*
	Exercise 3.15 Date Class
	
	Create a class called Date that includes three instance variables--
	a month (type int),
	a day (type int),
	and a year (type int).
	Provide a constructor that initializes the three instance variables and assumes that the values provided are correct.
	Provide a set and a get method for each instance variable.
	Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
	Write a test application named DateTest that demonstrates class Date's capabilities.
*/

public class Date {
	private int month;
	private int day;
	private int year;
	
	// constructor
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// setters
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	// getters
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}
	
	public void displayDate() {
		System.out.printf("%d/%d/%d\n", month, day, year);
	}
}
