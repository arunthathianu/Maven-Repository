package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AddTwoListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> color = new HashSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		System.out.println(color);
		
		Set<String> fruits = new TreeSet<String>();
		fruits.add("Apple");
		fruits.add("Blueberry");
		fruits.add("Banana");
		System.out.println(fruits);
		
		color.addAll(fruits);
		System.out.println(color);
		System.out.println(fruits);
		
		color.removeAll(fruits);
		System.out.println(color);
		System.out.println(fruits);
		
		color.containsAll(fruits);
		System.out.println(color);
		

	}

}
