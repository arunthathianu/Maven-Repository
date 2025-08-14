package collections;

import java.util.ArrayList;
import java.util.List;

public class FindAndRemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> car = new ArrayList<String>();
		car.add("Maruti");
		car.add("Ford");
		car.add("Hyundai");
		System.out.println("\n**Before Remove***\n");
		System.out.println(car);
		System.out.println("\n**After Remove***\n");
		car.remove(2);
		System.out.println(car);

	}

}
