package polymorphism;

import java.util.*;

public class OffSeason extends Onseason{
	
	static Scanner sc = new Scanner(System.in);
	static String season;
	static float amount;
	
//	public void season(String season, float amount)
//	{
//		if (season.equals("onseason"))
//			discount(amount);
//		else
//			discount(amount);
//		
//	}
	public void discount(float amount)
	{
		amount = amount * 0.15f;
		System.out.println("Off-Season After discount: "+amount);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason obj;

		System.out.println("Please Enter the Amount: ");
		amount = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter the Season: ");
		season = sc.nextLine().toLowerCase();
		if (season.equals("onseason"))
			obj=new Onseason();
		else
			obj=new OffSeason();
		
		obj.discount(amount);
	}

}
