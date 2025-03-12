package thirdyr.firstse.collection.java.ch3.gradeBook;


// WARNING: This is a question file, DO NOT MODIFY ANYTHING BELOW!


public class GradeBookQ {
	private String courseName; // course name for this GradeBook
	
	// constructor initializes courseName with String argument
	public GradeBookQ( String name ) // constructor name is class name
	{
	courseName = name; // initializes courseName
	} // end constructor
	
	// method to set the course name
	public void setCourseName( String name ) {
		courseName = name; // store the courseName
	} // end method setCourseName
	
	// method to retrieve the course name
	public String getCourseName() {
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage() {
		// this statement call getCourseName to get the
		// name of the course this GradeBook represents
		System.out.printf( "Welcome to the grade book for\n%s!\n",
				getCourseName() );
	} // end method displayMessage
} // end class GradeBook
