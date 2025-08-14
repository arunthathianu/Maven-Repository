package collections;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		System.out.println(months);
		System.out.println("\n***Contains of *** \n");
		System.out.println(months.contains("March"));
		System.out.println(months.indexOf("January"));
		
	}

}
