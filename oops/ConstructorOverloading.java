package oops;

class Vehicle{
	
	int wheels;
	int headLigths;
	String color;
	
	Vehicle(int wheels){
		this.wheels = wheels;
		headLigths = 2;
	}
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLigths = 2;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		Vehicle eRickshaw = new Vehicle(3, "Yellow");
		
		System.out.println(car.wheels);
		System.out.println(scooty.wheels);
		System.out.println(eRickshaw.wheels + " wheels and color = "+ eRickshaw.color);

	}

}
