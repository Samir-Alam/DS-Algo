package Homeworks;

import java.util.Scanner;

public class matrixMultiAddition {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the Dimensions of all the matrix = ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		
		System.out.println("Enter Array a :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Enter Array b :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				b[i][j] = sc.nextInt();
			}
			
		}
		int d[][] = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				d[i][j] = a[i][j]*b[i][j];
			}
			
		}
		System.out.println("Result Array d :");
		int s = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				 s += d[i][j];
				 System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum is = "+s);

	}

}
