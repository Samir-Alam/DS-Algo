package strings;

public class StringIntro {

	public static void main(String[] args) {
		
		String name = "Samir";
		String name1 = new String("Samir");
		String name2 = new String("Shraddha");
		System.out.println(name);
		System.out.println(name1.charAt(0));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(1, 4));			//Returns a string from a given starting to ending index
		
		System.out.println(name1.contains("am"));			//Returns a boolean value by checking the presence of a
															//given string or character in the parenthesis in the string
		
		System.out.println(name == name1);
		
		System.out.println(name.equals(name1));				//Checks if the strings are equal or not by literal word check
		
		String e ="";
		System.out.println(e.isEmpty());					//Checks if a string is empty
		
		System.out.println(name.concat(name2));				//Joins two strings
		System.out.println(name+name2);
		
		name1 =name1+" Alam";
		System.out.println(name1);
		
		System.out.println(name.replace("S", "A"));			//Replaces a given character with a given one
		
		String cars = "Bugatti,Lamborgini,Bentely,BMW,Mercedes,Toyota,McLaren";
		String allCars[] = cars.split(",");					//split function is very important
		
		for(String car: allCars) {
			System.out.print(car+" ");
		}System.out.println();
		
		System.out.println(name.indexOf("m"));		//Returns the index of the given character
		
		System.out.println(cars.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String a = "   Ester   ";
		System.out.println(a.trim());		//Trim the extra spaces
			
	}

}