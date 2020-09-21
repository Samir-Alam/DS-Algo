package whileLoopDowhileLoop;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int rev = 0;
				
		while(temp>0) {
			
			int a = temp%10;
			
			rev = rev*10 + a ;
			
			temp = temp/10;
			
		}
		if(rev == n)
			System.out.println(n+" is a Palindrom number");
		else
			System.out.println(n+" is not a Palindrom number");
	}

}
