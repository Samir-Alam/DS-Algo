package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();	//it is array list object
		List<String> veg = new LinkedList<>();			//now it is a list type object
		
		fruits.add(" Apple");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList<>();
		
		Double x = 45.0;		// it is a Wrapper class
		
		Pair<String, Integer> p1 = new Pair<>("Samir", 123);		//now it has became a generic class
		Pair<Boolean, String> p2 = new Pair<>(true, "Hello");
		
		p1.getDescription();
		p2.getDescription();

	}

}
