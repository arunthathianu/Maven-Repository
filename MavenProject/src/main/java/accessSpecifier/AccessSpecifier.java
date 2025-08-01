package accessSpecifier;

public class AccessSpecifier {
	
	public void display()
	{
		System.out.println("public");
	}
	
	private void display1()
	{
		System.out.println("private");
	}
	
	protected void display2()
	{
		System.out.println("protected");
	}
	
	void display3()
	{
		System.out.println("Default");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier obj = new AccessSpecifier();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}

}
