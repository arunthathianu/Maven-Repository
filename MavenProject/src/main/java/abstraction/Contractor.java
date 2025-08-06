package abstraction;

public class Contractor extends Employee{
	
	double paymentPerHour;
	int workingHours;
	double salary;
	
	public void calculateSalary(double paymentPerHour,int workingHours)
	{
		salary = paymentPerHour * workingHours;
		System.out.println("salary for contract employee: "+salary);
	}
	

}
