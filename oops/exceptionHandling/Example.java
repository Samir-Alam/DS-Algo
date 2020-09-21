package oops.exceptionHandling;

public class Example {

	public static void main(String[] args) {
		fun1();
		

	}
	static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		
		System.out.println(c);
		
//		boolean isDanger = true;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("Danger was coming");		//this is exception object
//		}
		try {
			Thread.sleep(3000);		//your code sleeps here
			//fun2();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After delay");
		
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");		//this is exception object
		}
	
}

}
