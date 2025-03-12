package thirdyr.firstse.collection.java.ch3.date;

/*
	Exercise 3.15 Date Class
	
	This is a Test class for the Exercise 3.15 Date Class.
*/

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date(21, 2, 2025);
		
		date.displayDate();
		date.setMonth(7);
		date.setDay(19);
		date.setYear(2005);
		date.displayDate();
	}
}
