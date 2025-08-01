package polymorphism;

public class polymorphismchild extends polymorphismparent{

	public void display(int a, int b)
	{
		super.display(10, 5);
		int sub = a-b;
		System.out.println("Sub = "+sub);
	}
	public static void main(String args[])
	{
		polymorphismchild obj = new polymorphismchild();
		obj.display(10, 10);
		
	}
}
