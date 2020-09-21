package oops.interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		YouTuber obj2 = obj;	//as soon as you make an object(Upcast), this interface can't access the functionality of
								//'Student' interface. Now, it's only a youtuber and a video editor. This is not 
								//This is not instantiation, its just upcasting.
		obj2.editVideo();
		obj2.makeVideo();

	}

	@Override
	public void study() {
		System.out.println("Person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making video");
		
	}

	@Override
	public void editVideo() {
		System.out.println("Person is editing a video");
		
	}
	

}
