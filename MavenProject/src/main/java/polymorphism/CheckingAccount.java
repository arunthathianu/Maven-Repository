package polymorphism;

public class CheckingAccount extends BankAccount{

	int transaction_fee = 25;
	int t_amount=10;
	
	public void withdraw(int w_amount)
	{
		t_amount = w_amount+transaction_fee;
		if(balance<t_amount)
		{
			System.out.println("Insufficient balance to withdraw");
		}
		else
		{
			 balance = balance - t_amount;
			 System.out.println("After withdrawal, balance amount : "+balance);
		}
	}
	public static void main(String args[])
	{
		SavingsAccount sa = new SavingsAccount();
		sa.withdraw(5000);
		sa.withdraw(100001); //limit exceed cal
		
		CheckingAccount ca = new CheckingAccount();
		ca.deposit(5000);
		ca.withdraw(5000);
		ca.withdraw(105002);
	}
}
