package collections;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		System.out.println(color);
		
		System.out.println(color.indexOf("Red"));
		System.out.println(color.get(2));

	}

}
