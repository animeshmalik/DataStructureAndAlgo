package org.algo.problems;

public class MissingElementInSortedArray {
	public static int getMissingElementFromSortedArray(int n,int[] array) {
		int missing=-1;
		for(int i=0;i<n-1;i++) {
			if(array[i]+1!=array[i+1]) {
				return array[i]+1;
			}
		}
		return missing;
	}
	
	public static int getMissingElementFromUnSortedArray(int n,int[] array) {
		int sum=(n)*(n+1)/2;
		for(int i=0;i<n-1;i++) {
			sum-=array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a= {1, 2, 3,4, 6, 7, 8};
		System.out.println(getMissingElementFromSortedArray(8, a));
		int[] an= {1, 2,7, 4, 3,6, 8,9};
		System.out.println(getMissingElementFromUnSortedArray(9, an));
	}

}
