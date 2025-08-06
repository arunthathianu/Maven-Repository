package exception;
//import java.lang.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("C: "+c);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally
		{
			int a=10,b=3;
			System.out.println(a+b);
		}

	}

}
