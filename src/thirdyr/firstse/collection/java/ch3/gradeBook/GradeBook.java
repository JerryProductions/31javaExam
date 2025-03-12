package thirdyr.firstse.collection.java.ch3.gradeBook;

/*
	Exercise 3.11 Modified GradeBook Class
	
	Modify class GradeBook (From GradeBookQ.java) as follows:
	a) Include a String instance variable that represents the name of the course's instructor.
	b) Provide a set method to change the instuctor's name and a get method to retrieve it.
	c) Modify the constructor to specify two parameters: one for the course name and one for the instructor's name.
	d) Modify method displayMessage to output the welcome message and course name, followed by "This course is presented by: " and the instuctor's name.
	Use your modified class in a test application that demonstrates the class's new capabilities.
*/

public class GradeBook {
	private String courseName;
	private String instructorName;
	
	// constructor
	public GradeBook(String name, String instructor) {
		courseName = name;
		instructorName = instructor;
	}
	
	// set the courseName
	public void setCourseName(String name) {
		courseName = name;
	}
	
	// set the instructorName
	public void setInstructorName(String instructor) {
		instructorName = instructor;
	}
	
	// get the courseName
	public String getCourseName() {
		return courseName;
	}
	
	// get the instructorName
	public String getInstructorName() {
		return instructorName;
	}
	
	// display a welcome message to the GradeBook user
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s\nThis course is presented by: %s\n",
				getCourseName(), getInstructorName());
	}
}
