package oops;

class motor{			//here there is no constructor but still a default constructor is made by the compiler when
	int wheels;			// it is called i.e., motor bike = new motor();
}

class Vehicles{
	
	int wheels;
	
	Vehicles(){
		wheels = 4;
		
	}
}

class wheeler{
	int wheels;
	int headLigths;
	wheeler(int Wheels){		//It is a parameterized constructor	it can be customized as per new objects
		this.wheels = Wheels;	// "this" is a keyword which makes reference of a word to the current object defined earlier
		headLigths = 2;
	}
}


public class MyConstructor {
	
	MyConstructor(){
		
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
		//MyConstructor obj = new MyConstructor();
		
		Vehicles car = new Vehicles();
		Vehicles car2 = new Vehicles();
		
		motor bike = new motor();		//Her the compiler is automatically making a default constructor giving it's  
										//variable value a default value i.e., bike = 0
		wheeler scooty = new wheeler(2);
		
		System.out.println(car.wheels+" Wheels");
		System.out.println(car2.wheels);
		System.out.println(bike.wheels);
		System.out.println(scooty.wheels);

	}

}
