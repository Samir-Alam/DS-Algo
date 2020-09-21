package arrays;

import java.util.Scanner;

public class UserInputarrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of subjects :");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("Enter the marks of the subjects :");
		
		for(int i = 0; i < n; i++){
			
			marks[i] = sc.nextInt();
		}
		int avgmarks = 0;
		
		for(int i = 0;i < n; i++) {
			avgmarks += marks[i];
		}
		avgmarks /= n;
		
		System.out.println("The Average Marks is "+avgmarks);
		
		sc.close();
	}

}
