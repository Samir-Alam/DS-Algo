package oops;

class Cat{				//We can make as many class as we want
	boolean hasFur;			//These are the states of the class
	String color, breed;
	int legs, eyes;
	
	public void walk() {			//These are behaiviour (walk()) of the class 
		System.out.println("Cat is walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println(("My cat has " + legs + " legs and " + eyes + " eyes"));
	}
}
class Dog{				//There many types of class i.e., Public, Private, Protected.
	
	String breed, name;
	
	public void jump() {
		System.out.println("My dog "+ name + " jumped");
	}
	
	public void description() {
		System.out.println("My dog's name is " + name + " and it's breed is " + breed);
	}
	
}

public class MainClass {				//There can be only one public class(in an individual file or program)

	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.walk();
//		cat2.eat();
//		
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		
//		cat1.description();			
//		cat2.description();			//default value of int is 0, String is Null and boolean is False

		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		poodle.breed = "Husky";
		poodle.name = "Drax";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
	}

}
