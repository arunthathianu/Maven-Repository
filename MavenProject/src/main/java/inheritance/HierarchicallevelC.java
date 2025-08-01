package inheritance;

public class HierarchicallevelC extends HierarchicallevelP{

	public void speed()
	{
		System.out.println("1200 rpm");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicallevelC obj = new HierarchicallevelC();
		obj.carcolor();
		obj.speed();
		HierarchicallevelP1 obj1 = new HierarchicallevelP1();
		obj1.carname();
		obj1.carcolor();

	}

}
