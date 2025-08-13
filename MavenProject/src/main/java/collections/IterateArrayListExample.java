package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class IterateArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		System.out.println(color);
		
		System.out.println("\n*****For Loop******\n");
		for(int i=0;i<color.size();i++)
		{
			System.out.println(color.get(i));
		}
		
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Mango");
		fruits.add("Apple");
		System.out.println("\n*****Fruits*****\n");
		System.out.println(fruits);
		
		System.out.println("\n*****For Each*****\n");
		for(String i:fruits)
		{
			System.out.println(i);
		}
		
		System.out.println("\n*****While Loop*****\n");
		
		Iterator it = fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
