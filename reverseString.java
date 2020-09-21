package Homeworks;

import java.util.Scanner;

public class reverseString {

//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a sentence");
//		String a = sc.nextLine();
//		
//		String b[] = a.split(" ");;
//
//		for(int i = b.length-1; i>-1; i--) {
//		System.out.print(b[i]+" ");
//		}
//		
//	}
	static String reverseStrings(String s) {
		
		int i = s.length()-1;
		
		String ans = "";
		
		while(i>=0) {
			while( i>=0 && s.charAt(i) == ' ') i--;
			int j = i;
			
			if(i < 0) break;
			
			while(i >= 0 && s.charAt(i) != ' ') i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1, j+1));
				
			}else {
			ans = ans.concat(" "+s.substring(i+1, j+1));
			}
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = sc.nextLine();
		System.out.println(reverseStrings(s));
	}

}
