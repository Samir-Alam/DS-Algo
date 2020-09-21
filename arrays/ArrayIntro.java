package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
		int[] marks = {100,90,80,70,60}, rollNo = {1,2,3,4,5}, classes = {10,9,8,7,6};	//or int marks[], rollNo[], classes[] = new int[5];
		String[] StudentsName = {"Samir","Shraddha","Kriti","Natalie","Brie"};
		
		 System.out.println("marks\trollNo\tclasses\tStudentsName");
		 for(int i = 0; i < 4; i++) {
			 
			 System.out.println(marks[i]+"\t"+rollNo[i]+"\t"+classes[i]+"\t"+StudentsName[i]);
		 }

	}

}
