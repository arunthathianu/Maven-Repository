package aggregation;

public class Student {
	
	String name;
	int rno;
	Address obj;
	public Student(String name,int rno, Address obj)
	{
		this.name=name;
		this.rno=rno;
		this.obj=obj;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("rno : "+rno);
		System.out.println("State: "+obj.state);
		System.out.println("pincode: "+obj.pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address("TVM",695501);
		Student stud = new Student("Anu", 10, add);
		stud.display();
		

	}

}
