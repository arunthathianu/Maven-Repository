package encapsulation;
import java.util.*;

public class User {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Bank bank = new Bank();

	        System.out.println("Welcome to ATM.");
	        System.out.print("Please enter your PIN: ");
	        int userPin = sc.nextInt();

	        // Set and validate the PIN
	        bank.setPin(userPin);
	        bank.validatePin();
	    }
	
	
}
