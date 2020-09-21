package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(12);
		q.add(23);
		q.add(34);
		q.offer(65);		//same as add
		
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());		//throws exception when the queue is empty
		System.out.println(q.element());		//same as peek in stacks and throws exception if the queue is empty
												//peek returns false/null if the queue is empty
		
		System.out.println(q.poll());		//returns null if the queue is empty. same as remove()
	}

}
