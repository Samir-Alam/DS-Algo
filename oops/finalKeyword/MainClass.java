package oops.finalKeyword;

public class MainClass{  //extends Student{			The type MainClass cannot subclass the final class Student
	
//	public void getDescription() {			Cannot override the final method from Student
//		System.out.println("Inside Main Class");
//	}
//	
	
//	//final int rooNo;		so here the variable( also called blank final variable) is not initialized so we can't
//							 use final keyword
//	final int ROLL_NO = 4;			//A convention of naming the final variable is name them all in CAPS
//									//which is actually in capital letters.

	public static void main(String[] args) {
		
//		final String name = "Anuj";
//		/*name = "Kumar"; it can't change because of the final keyword*/
//		
//		final String names;		//you can make final variable without initializing but the condition is that the  
//								// variable should be local variable. But before printing the variable, the variable
//								// should be initialized even if it is not a final variable
//		System.out.println(name);
		
//		final Student obj = new Student();
//		
//		Student obj2 = new Student();
//		
//		obj.name = "Samir";
		
		@SuppressWarnings("unused")
		MainClass obj = new MainClass();
		
	}
	
}
