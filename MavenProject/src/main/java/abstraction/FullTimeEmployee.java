package abstraction;
import java.util.*;

public class FullTimeEmployee extends Employee{
	
	double salary;
		
	public void calculateSalary(double paymentPerHour,int workinghours)
	{
		salary = paymentPerHour * workinghours;
		System.out.println("salary for Full time employee: "+salary);
	}
	
	
	public static void main(String args[])
	{
		final int workinghours = 8;
		Contractor c_obj = new Contractor();
		FullTimeEmployee f_obj = new FullTimeEmployee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment per hour for contract employee: ");
		double paymentPerHour = sc.nextDouble();
		System.out.println("Enter payment per hour for Full Time Employee: ");
		paymentPerHour = sc.nextDouble();
		System.out.println("Enter working hours for contract employee");
		int c_workinghours = sc.nextInt();
		c_obj.calculateSalary(paymentPerHour,c_workinghours);
		f_obj.calculateSalary(paymentPerHour,workinghours);
	}

}
