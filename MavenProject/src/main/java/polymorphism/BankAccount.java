package polymorphism;

public class BankAccount {
	
	int balance = 100000;
	int w_amount, d_amount;
	public void deposit(int d_amount)
	{
		balance = balance + d_amount;
		System.out.println("Deposit amount balance: "+balance);
	}
	public void withdraw(int w_amount)
	{
		this.w_amount = w_amount;
		System.out.println("Withdrawal amount balance: "+this.w_amount);
	}
}
