package oops.abstraction;

public class WagonR extends Car {
	@Override
	public void accelerate() {
		System.out.println("WagonR is accelerating");
	}
	
	public void breaking() {
		System.out.println("WagonR is Breaking");
	}

}
