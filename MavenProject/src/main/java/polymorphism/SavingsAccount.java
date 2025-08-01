package polymorphism;

public class SavingsAccount extends BankAccount{

	int limit = 10000;
	public void withdraw(int w_amount)
	{
		if(w_amount>limit)
		{
			System.out.println("Withdrawal limit exceeded! Max allowed: " + limit);
			//System.out.println("Limit is 10000. Please enter the amount less than limit.");
		}
		else if(w_amount>balance)
		{
			 System.out.println("Insufficient balance.");
		}
		else
		{
			balance = balance - w_amount;
			System.out.println("After withdrawal balance amount : "+balance);
		}
	}
	
}
