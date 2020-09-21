package whileLoopDowhileLoop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		sc.close();
		int sum = 0, temp = n;
		
		while(temp>0) {
			
			int l = temp%10;
			
			sum = sum + l;
			
			temp = temp/10;
			
		}System.out.println("Sum of the digits of "+n+" is "+sum);

	}

}
