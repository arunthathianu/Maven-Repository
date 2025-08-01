package interfaceEx;

public class MultipleInheritanceChild implements MultipleInheritanceP1,MultipleInheritanceP2{

	public void display()
	{
		System.out.println("MultipleInheritanceP1");
	}
	
	public void print()
	{
		System.out.println("MultipleInheritanceP2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInheritanceChild obj = new MultipleInheritanceChild();
		obj.display();
		obj.print();
	}

}
