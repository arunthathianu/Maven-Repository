package collections;

import java.util.HashMap;
import java.util.Map;

public class CountNoofCharacter {

	public static void main(String args[])
	{
		String name = "ArunthathiArunthathi";
		name = name.toLowerCase();
		int j = 1;
		Map<Character,Integer> count = new HashMap<Character,Integer>();
		
		for(char i:name.toCharArray())
		{
			if(!count.containsKey(i))
			{
				count.put(i, j);
			}
			else
			{
				j = count.get(i);
				count.replace(i, j+1);
			}	
		}
		
		for(Map.Entry<Character, Integer> entry:count.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}		
		
	}
}
