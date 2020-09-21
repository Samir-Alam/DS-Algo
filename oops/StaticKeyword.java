package oops;

//import oops.ExampleClass.B;
//import oops.ExampleClass.C;

public class StaticKeyword {
	
	static {								//It is a static block which executes before the main function.
		System.out.println("in block one");	//it is used for memory management.
	}
	
	static {
		System.out.println("In static block two");
	}
	
	public static void main(String[] args) {
		
//		ExampleClass objA = new ExampleClass();
//		B objB = objA.new B();
//		
//		C objC = new ExampleClass.C();			//It is a static class so it can be used without creating main class
//												//object.
		System.out.println("Inside main");
		
	}

	static {
		System.out.println("In static block three");	//It doesn't matter where the static blocks are placed,
	}													//it will execute before the main function.
	
}

//Anything static belongs to the class and not to the object