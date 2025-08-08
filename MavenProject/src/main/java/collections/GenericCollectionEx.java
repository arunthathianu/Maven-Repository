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
		
		List <String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Pomegrante");
		System.out.println(fruits);
		
		System.out.println(fruits.get(0));
		
		fruits.set(2, "Orange");
		fruits.add("Orange");
		System.out.println(fruits);
		
		System.out.println(fruits.indexOf("Orange"));
		
		System.out.println(fruits.lastIndexOf("Orange"));
		
		fruits.remove(4);
		System.out.println(fruits);
		
		System.out.println(fruits.contains("Orange"));
		System.out.println(fruits.contains("Grapes"));
		
		System.out.println(fruits.isEmpty());
		
		System.out.println(fruits.size());
	}

}
