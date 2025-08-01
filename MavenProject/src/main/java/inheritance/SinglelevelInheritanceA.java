package inheritance;

public class SinglelevelInheritanceA extends SinglelevelInheritanceB{
	
	public void age()
	{
		System.out.println("10");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglelevelInheritanceA obj = new SinglelevelInheritanceA();
		obj.name();
		obj.age();
	}

}
