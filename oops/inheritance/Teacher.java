package oops.inheritance;

public class Teacher extends Person {
	
	public Teacher(String name){
		super(name);			//Through this super constructor of the parent class is called
		System.out.println("Inside teacher constructor");
	}
	
	public void teach() {							//It is related to the object
		System.out.println(name+" is teaching");
	}
	public void eat() {
		super.eat(); 		//Through super keyword parent class will be accessed first
		System.out.println("Teacher "+name+" is eating");
	}
	
	public static void laughing() {					//It is related to the class
		System.out.println("Teacher is laughing");
	}

}
