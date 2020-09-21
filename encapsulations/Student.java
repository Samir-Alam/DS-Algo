package encapsulations;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {					//Getter
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {			//Setter
		if(age>20) {						//restriction. we have encapsulated
			System.out.println("You are too old to be a student in our school");
		}else {
			this.age = age;
		}
		
	}	

}


