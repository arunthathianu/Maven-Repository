package aggregation;

import java.util.*;

public class AddressA{

	String address;
	Scanner sc = new Scanner(System.in);
	//StudentA obj;
	
	public String getAddress()
	{
		System.out.println("Enter the Student Adress: ");
		address = sc.nextLine();
		return address;
	}
	
	public void display(StudentA obj,String addr)
	{
		System.out.println("Student Name: "+obj.s_name);
		System.out.println("Student Roll Number: "+obj.r_no);
		System.out.println("Student Address: "+addr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA s_obj = new StudentA();
		s_obj.getStudentDetails();
		AddressA a_obj = new AddressA();
		
		String address = a_obj.getAddress();
		a_obj.display(s_obj,address);
		
	}

}
