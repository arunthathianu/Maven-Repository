package abstraction;

public class AbstractClassEx1 extends AbstractClassEx{

	public void display()
	{
		System.out.println("abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractClassEx1 obj = new AbstractClassEx1();//first option
		AbstractClassEx obj = new AbstractClassEx1();//second option
		obj.display();
		obj.print();
	}

}
