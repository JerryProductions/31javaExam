package thirdyr.firstse.collection.java.ch3.gradeBook;

/*
	Exercise 3.11 Modified GradeBook Class
	
	This is a Test class for the Exercise 3.11 Modified GradeBook Class.
*/

public class GradeBookTest {
	public static void main(String[] args) {
		// GradeBook object
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming", "Bob Bobsen");
		GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java", "Jeff Jefferson");
		
		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
	}
}
