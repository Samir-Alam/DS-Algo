package encapsulations;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		
		Student obj = new Student();
		//obj.name = "Tom";
		//obj.age = 56;
		obj.setAge(1);
		
		System.out.println(obj.getAge());

	}

}
