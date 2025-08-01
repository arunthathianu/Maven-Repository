package inheritance;

public class MultilevelInheritance extends MultilevelP1 {
	
	public void running()
	{
		System.out.println("Child is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.drawing();
		obj.singing();
		obj.running();
	}

}
