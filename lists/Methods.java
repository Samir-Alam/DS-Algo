package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Methods {
	
	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<String>();
		List<String> vegetables = new ArrayList<String>();
		
		fruits.add("Apple");				//add()
		fruits.add("Orange");
		fruits.add("Guava");
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		
		fruits.addAll(vegetables);		//addAll()
		
		fruits.set(2, "Banana");		//set
		
//		fruits.remove(2);				//remove()
//		
//		fruits.clear();					//clear()
		
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Potato");
		toRemove.add("Tomato");
		fruits.removeAll(toRemove);		//removeAll()
		
		String temp[] = new String[fruits.size()];			//if you want the object that you know
		fruits.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
		
//		Object x [] = fruits.toArray();			it makes array of an object
		
		System.out.println(fruits);
		System.out.println(fruits.get(2));			//get()
		System.out.println(fruits.size()); 			//size()
		System.out.println(fruits.contains("Apple"));			//size() , returns boolean value
		System.out.println(fruits.isEmpty());
		
		
	}

}
