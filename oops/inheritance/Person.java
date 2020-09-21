package oops.inheritance;

public class Person {
	
	protected String name;		//protected keyword make visible to only the children 
	
	public Person(String name) {
		this.name = name;
		System.out.println("Inside Person constructor");
	}
	
	public void walk() {
		System.out.println( "Person "+name+" is walking");
	}
	
	public void eat() {
		System.out.println("Person "+name+" is eating");
	}
	
	public static void laughing() {
		System.out.println("Person is laughing");
	}

}
