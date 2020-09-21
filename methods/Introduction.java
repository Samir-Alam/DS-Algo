package methods;

public class Introduction {
	
		//	  ________________________________________________	
		//	  v												  |
	public static void main(String[] args) {		// 		  |
													//		  |
		int firstNumber = 34;						//		  |
		int secondNumber = 23;						//		  |
												    //		  |
		int result = maxOf(firstNumber, secondNumber);//	  |
													  //	  |
				System.out.println(result);			  //	  |
													  //  	  |
	}												  //	  |
													  //	  |
	static int maxOf(int a, int b) {		//under the static function only static function can be called.
		if(a > b) {				// another method:-
			return a;			//return a> b? a: b;
		}else {
		return b;
		}
		
	}
	
	static float maxOf(float a, float b) {
		
		if(a > b) {
			return a;
		}else {
			return b;
		}
		
	}
	
	static void maxOf(int a, float b) {
		
	}
	
	static void sayHi() {			//Here the return type is void and nothing is getting return
		System.out.println("Hi");
		System.out.println("Good morning");
	}

}
