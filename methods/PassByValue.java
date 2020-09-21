package methods;

public class PassByValue {

	public static void main(String[] args) {
		
		int c =34;
		int d = 12;
		
		swap(c, d);				//Pass by value case
		
		System.out.println(c+" "+d);	//Values of c and d (it is primitive data type will not change as there 
										// is copy of c and d i.e., a and b who have scope only inside the function 'swap'
//		Dog a = new Dog();
//		a.legs = 4;
//		Dog b = new Dog();
//		b.legs = 3;
//		
//		swap(a, b);
		
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
		
		System.out.println(a.legs);
		
	}
	
	static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		
	}
	static void swap(Dog a, Dog b) {		//here it takes the reference and not copies the object
		Dog temp = a;
		a = b;
		b = temp;
	}
	
	static void changeDog(Dog dog) {
		dog.legs = 6;
	}

}

class Dog{
	int legs;
}
