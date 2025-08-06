package collections;

import java.util.*;

public class GenericCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		
		System.out.println(color);
		
		System.out.println(color.indexOf("Blue"));
		
		Set <String> s_color = new TreeSet<String>();
		s_color.add("Green");
		s_color.add("Orange");
		s_color.add("Orange");
		System.out.println(s_color);
		
		Set <String> car = new HashSet<String>();
		car.add("Audi");
		car.add("Benz");
		car.add("Benz");
		System.out.println(car);
		
		
		
		

	}

}
