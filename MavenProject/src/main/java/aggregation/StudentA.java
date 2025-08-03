package aggregation;

import java.util.Scanner;

public class StudentA {

	String s_name;
	int r_no;
	Scanner sc = new Scanner(System.in);
	public void getStudentDetails()
	{
		System.out.println("Enter Student Name: ");
		s_name = sc.nextLine();
		System.out.println("Enter Student Roll No: ");
		r_no = sc.nextInt();
		sc.nextLine();
	}
}
