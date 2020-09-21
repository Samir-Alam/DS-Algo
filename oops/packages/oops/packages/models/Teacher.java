package oops.packages.oops.packages.models;

public class Teacher {

private String name;
	
	public Teacher(String name) {
		this.name = name;
	}
	
//	public void Teacher(String name2) {
//		
//	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student("Harry");
		
		obj.getSquare(2);
		
	}
}
