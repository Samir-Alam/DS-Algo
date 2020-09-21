package linkedLists;

public class MyLinkedList<E> {		//this is generic class as we have added <E> which is type
	
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<E> (data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	void set(E data, int index) {
		int count = 0;
		Node<E> tmp = head;
		@SuppressWarnings("unused")
		Node<E> st = new Node<E>(data); 
		if(index == count) {
			st = tmp;
			tmp.data = data;
			tmp.next = tmp;
		}
		tmp = tmp.next;
		count = count + 1;
		System.out.println("hi");
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public E removeLast() throws Exception {
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		
		return (E) toRemove.data;
		
	}
	public E getLast() throws Exception {
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public boolean isEmpty() {
		return head == null;
//		if(head == null) {
//			return true;
//		}else {
//			return false;
//		}
	}
	

	
public static class Node<E>{
	public E data;
	public Node<E> next;
	
	public Node(E data) {
		this.data = data;
		next = null;
	}
}}
	


