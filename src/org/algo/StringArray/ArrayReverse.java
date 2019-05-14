package org.algo.StringArray;

/* Program that reverses array in less number of swaps*/

public class ArrayReverse { 

	/*function swaps the array's first element with last element, 
	second element with last second element and so on*/
	static void reverse(int a[], int n) 
	{ 
		int  t; 
		for (int i = 0; i < n / 2; i++) { 
			t = a[i];  // take array element in temp
			a[i] = a[n - i - 1]; // swap the element from the last for beginning 
			a[n - i - 1] = t;  // put the temp element in the last from the array
		} 

		/*printing the reversed array*/
	
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(a[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50, 60}; 
		reverse(arr, arr.length); 
	} 
} 
