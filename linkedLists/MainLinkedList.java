package linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll =  new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		getTimeDiff(al);
		getTimeDiff(ll);
		
//		ll.add(12);		//
//		ll.add(2);
//		ll.add(32);
//		//ll.toArray();
//		ll.set(1, 4);
//		System.out.println(ll.get(1));
//		System.out.println(ll.size());
//		System.out.println(ll);

	}
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<100000; i++) {
			list.add(0, i);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + 	//getClass() get the class functionality and getName() gets
				"-->"+ (end - start));					//the name of that class
		
	}

}
