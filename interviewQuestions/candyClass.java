package interviewQuestions;

import java.io.IOException;
import java.util.*;

public class candyClass {
	
	static long candies(int n, int[] a) {
		int c[] = new int[n];
		Arrays.fill(c, 1);
		
		for(int i =0 ; i<n; i++) {
			if(a[i] > a[i-1]) {
				c[i] = c[i-1]+1;
			}
		}
		for(int i = n-2; i>=0; i--) {
			if(a[i] > a[i+1]) {
				c[i] = Math.max(c[i+1] +1, c[i]);
			}
		}
		
		long sum = 0;
		for(int i = 0; i<n; i++) {
			sum = sum + (long)c[i];
		}
		
		return sum;
		
	}
	@SuppressWarnings("unused")
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		

	}

}
