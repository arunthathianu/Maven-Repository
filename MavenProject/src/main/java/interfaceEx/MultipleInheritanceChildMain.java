package interfaceEx;

public class MultipleInheritanceChildMain implements MultipleInheritanceExP2,MultipleInheritanceExP1{

	public void bike_cc()
	{
		System.out.println("125 cc");
	}
	
	public void car_cc()
	{
		System.out.println("900 cc");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritanceChildMain obj = new MultipleInheritanceChildMain();
		obj.bike_cc();
		obj.car_cc();
	}

}
