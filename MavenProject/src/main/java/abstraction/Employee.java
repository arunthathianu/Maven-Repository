package abstraction;

public abstract class Employee {

	String name;
	int employeeId;
	
	
	public abstract void calculateSalary(double paymentPerHour,int workingHours);
	
}
