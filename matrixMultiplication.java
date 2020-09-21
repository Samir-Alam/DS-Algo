package Homeworks;

import java.util.Scanner;

public class matrixMultiplication {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the dimensions");
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		
		System.out.println("Enter array a");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Enter array b");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				b[i][j] = sc.nextInt();
				
			}
			
		}
		
		int d[][] = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				d[i][j] = a[i][j]*b[i][j];
			}
		}
		
		System.out.println("Result array d is :");
		for (int i = 0 ; i < r ; i++ ) {
			for(int j = 0 ; j < c ; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}


