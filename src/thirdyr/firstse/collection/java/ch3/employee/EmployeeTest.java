package thirdyr.firstse.collection.java.ch3.employee;

/*
	Exercise 3.14 Employee Class
	
	This is a Test class for the Exercise 3.14 Employee Class.
*/

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Frank", "Freddy", 3000.00);
		Employee employee2 = new Employee("Jack", "Jackson", 4000.00);
		
		System.out.printf("Employee 1: %s %s%nYearly Salary: $%.2f%n\n",
				employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
		System.out.printf("Employee 2: %s %s%nYearly Salary: $%.2f%n\n",
				employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
		
		employee1.giveRaise(10);
		employee2.giveRaise(10);
		
		System.out.printf("%nAfter 10%% raise:%n");
		System.out.printf("Employee 1: %s %s%nYearly Salary: $%.2f%n\n",
				employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
		System.out.printf("Employee 2: %s %s%nYearly Salary: $%.2f%n\n",
				employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
	}
}
