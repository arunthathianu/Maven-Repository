package exception;

public class CustomException {
	
	public void validateage(int age)
	{
		if(age<18)
			//System.out.println("Not eligible");
			throw new IllegalArgumentException("Access denied");
		else
			System.out.println("Eligible");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException obj = new CustomException();
		try 
		{
			obj.validateage(16);
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
		
	}

}
