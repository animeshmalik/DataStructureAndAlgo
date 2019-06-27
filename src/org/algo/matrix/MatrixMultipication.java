package org.algo.matrix;

public class MatrixMultipication {
	
	public static int[][] multiply(int[][] a, int[][] b) {
		// for multipication A--> 4X3 and B --> 3X4 result --> 4X4
		int[][] r = new int[a.length][b[0].length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {

				for (int k = 0; k < a[0].length; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				r[i][j] = sum;
				sum=0;

			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		/*int[][] a= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
				
		};
		int[][] b= {
				{1,2,3,10},
				{4,5,6,11},
				{7,8,9,12}
				
				
		};*/
		
		int[][] a= {
				{1,2,3},
				{4,5,6}
		};
		int[][] b= {
				{7,8},
				{9,10},
				{11,12}
		};
		
		int[][] r=multiply(a, b);
		
		//pring the marix
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(r[i][j] +"\t");
			}
			System.out.println();
		}
	}
	

}
