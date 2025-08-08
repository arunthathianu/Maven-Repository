package interfaceEx;
import java.util.*;

public class HDFC implements RBI{
	
	public void recurringDeposit(double amount, int duration)
	{
		
		double TotalAmount = amount * duration + (amount * duration * interestRate);
		System.out.println("TotalAmount with intreset: "+TotalAmount);
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit amount: ");
		double deposit_amount = sc.nextDouble();
		System.out.println("Enter the time duration in months: ");
		int months = sc.nextInt();
		HDFC obj = new HDFC();
		obj.recurringDeposit(deposit_amount, months);
	}

}
