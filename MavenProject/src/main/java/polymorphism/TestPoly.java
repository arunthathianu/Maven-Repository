package polymorphism;

public class TestPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba= new BankAccount();
		SavingsAccount sa= new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();
		ba.withdraw(5000);
		sa.withdraw(5000);
		ca.withdraw(5000);
	}

}
