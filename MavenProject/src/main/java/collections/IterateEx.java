package collections;

import java.util.*;

public class IterateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> color = new HashSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		System.out.println(color);
		
		Iterator<String> i = color.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
	}

}
