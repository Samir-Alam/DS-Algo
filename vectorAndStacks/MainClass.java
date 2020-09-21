package vectorAndStacks;

import java.util.Stack;
//import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector<>();		//vector synchronizes every individual operation and are less efficient
//												//array list is preferred over vector.
//		
//		v.add(12);
//		v.add(87);
		Stack<Integer> stack = new Stack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
//		stack.add(122);			add() function also works
		
		int popped = stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
//		popped = stack.pop();		//throws exception if you pop empty stack
//		System.out.println(popped);
		
		MyStack<Integer> stacks = new MyStack<>();		//using MyStacks created with MyLinkedList rather than vector
		stacks.push(12);
		stacks.push(24);
		stacks.push(36);
		int poppeds = stacks.pop();
		System.out.println(poppeds);
		int peekeds = stacks.peek();
		System.out.println(peekeds);

	}

}
