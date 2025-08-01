package superKeyword;

public class SuperVariable2 extends SuperVariable1{

	String color = "Red";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariable2 obj = new SuperVariable2();
		obj.display();
	}

}
