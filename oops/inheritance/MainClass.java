package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher t = new Teacher("Mr. Harry");
		
		t.name = "Mr. Harry";
		
		t.eat();
		
		t.walk();
		
		t.teach();
		
//		Singer s = new Singer();
//		
//		s.name = "Austin";
//		
//		s.sing();
//		
//		s.eat();
		
		Person p = t;			//Up-casting or Implicit casting
		
		Singer s1 = new Singer("Justin");
		
		Teacher t1 = (Teacher)p;
		
//		boolean yo = t1 instanceof Teacher;
	
		System.out.println(t instanceof Teacher);
		System.out.println(s1 instanceof Singer);
		System.out.println(t instanceof Person);
		
		System.out.println(t1 instanceof Person );
		System.out.println(p instanceof Singer);
		System.out.println(p instanceof Teacher);

	}

}
