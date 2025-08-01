package superKeyword;
import java.util.*;

public class DivByTen extends AddTwoNumber{

	int divisible;
	public void divisible()
	{
		divisible = super.sum%10;
		
	}
	
	public void display()
	{
		if(divisible==0)
			System.out.println(super.sum+" is divisible by 10");
		else
			System.out.println(super.sum+" is not divisible by 10");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		DivByTen obj = new DivByTen();
		obj.add(a, b);
		obj.divisible();
		obj.display();
	}

}
