package encapsulation;

public class Product {
	
	private String productName, productCode;
	private double price;
	private float discount=0.25f;
	public void setdetails()
	{
		productName = "LG Double Door Refridgerator";
		productCode = "102562";
		price = 15000.23;
	}
	
	public void getdetails()
	{
		System.out.println("Product Name: "+productName);
		System.out.println("Product Code: "+productCode);
		System.out.println("Price: "+price);
	}
	
	public void applyDiscount()
	{
		 price = price - (price * discount);
	}
	
}
