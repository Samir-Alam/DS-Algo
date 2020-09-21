package oops.packages.oops.packages.models;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		getPassword();
		return name;
	}
	
	private String getPassword() {	// it can only be within it's main class and not outside the class
		return "fjfy@trrhu&&d5%";
	}
	public String getPasswords() {	// it can be accessed from everywhere
		return "fjfy@trrhu&&d5%";
	}
	
	int getSquare(int a) {			//default modifier, as no access level is specified, so it cannot be accessed 
		return a*a;					//from outside it's main(or parent) package i.e., in MainClass, etc.
	}

}
