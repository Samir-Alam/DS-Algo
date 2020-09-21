package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		try {
//		int a = 5;
//		int b = 0;
//		int c = a/b;		//the code shuts down from here if we don't use try and catch. As you can see the last
							//two lines will not get printed
		
//		System.out.println(c);
			
		int[] x = new int [5];
		System.out.println(x[6]);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " occured, please check your code");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be in the range of size of the array.");
			
		}catch(IllegalArgumentException e) {
			System.out.println("Check your vasting carefully.");
		}finally {							// this code will run either you have catch an error or not
			System.out.println("Sorry for the inconvenience");
		}
		
		System.out.println("Very important code");
		System.out.println("need to run");

	}
	static void fun1() {
		int a = 5;
		int b = 0;
		
		int c = a/b;
		
		System.out.println(c);
	}

}
